<template>
    <div>
  <v-card>
    <v-card-title @click="getTest()">
      Steve_게시판
      <v-spacer></v-spacer>
      <v-text-field
        v-model="search"
        append-icon="mdi-magnify"
        label="검색"
        single-line
        hide-details
      ></v-text-field>
    </v-card-title>
    
    <table border="1" width="100%">
        <tbody>
            <tr>
               <td v-for="header in headers">{{header}}</td>  
            </tr>
            <tr v-for="res_data in res_datas">
                <td>{{res_data.mail_id}}</td>
                <td>{{res_data.title}}</td>
                <td>{{res_data.create_id}}</td>
                <td>{{res_data.mail_id}}</td>
                <td>{{res_data.mail_id}}</td>
            </tr>
            <div>
                <button :disabled="pageNum === 0" @click="prevPage">이전</button>
                <span class="page-count">{{ pageNum + 1 }} / {{ pageCount }}</span>
                <button :disabled="pageNum >= pageCount - 1" @click="nextPage">다음</button>
            </div>
            
        </tbody>
        
    </table>
  </v-card>
  </div>
</template>

<script>
  export default {
    name : 'steveUserMainBoard',
    
    data () {
      return {
        search: '',
        headers: [ '게시판', '제목', '닉네임', '등록일', '조회수'],
        res_datas: [],
        pageNum : 0,
        pageCount : 0,
      }
    },
    created(){
        this.$axios.post('/st_user/selectAll',{})
        .then((response) => {
            this.res_datas = response.data
            console.log(this.res_datas.length)
            if(this.res_datas.length > 5){
                if(this.res_datas % 5 != 0){
                    this.pageCount = parseInt(this.res_datas.length / 5) + 1
                    console.log("여기는 5개이상"+this.pageCount)
                }else{
                    this.pageCount = this.res_datas / 5
                    console.lgo("여기는 5개 이하"+this.pageCount)
                }
            }else{
                this.pageCount = 1
            }
            
        })
        .catch((error) => {
            console.log(error)
        })
    },
    methods:{
        prevPage(){
            this.pageNum -= 1
            console.log(pageNum)
        },
        nextPage(){
            this.pageNum += 1
        }
    }
  }
</script>