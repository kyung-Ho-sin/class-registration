<template>
  <div id="app" class="max-div">
    
  <div class="header">
    <h2>게시판 작성</h2>
  </div>
  <table class="main_table">
    <tbody>
      <tr>
        <td>
          <div class="innerMain">
            <div class="sub_table">
              <table>
                <tbody>
                  <tr>
                    <th width="80px">게시판</th>
                    <td class="select_board">
                      <v-select
                        v-model="selectboard"
                        height="20"
                        :items="items">
                      </v-select>
                    </td>
                  </tr>
                  <tr>
                    <th>제목</th>
                    <td class="title_board">
                      <v-text-field ></v-text-field>
                    </td>
                  </tr>
                </tbody>  
              </table>
              
              <div class="edit-div">
                <vue-editor placeholder="Front내용을 입력해주세요" v-model="editor"></vue-editor>
              </div>
            </div>
          </div>
        </td>
      </tr>
    </tbody>
  </table>
    <div class="send_div">
            <v-checkbox
              v-model="public_check"
              label="공개여부"
              color="success"
              value="check"
              hide-details
            ></v-checkbox>
      <v-btn class="" outlined color="indigo" @click="getResponse()">
        게시물 작성
      </v-btn>
    </div>
  </div>
</template>

<script>
import { VueEditor, Quill } from "vue2-editor";

export default {
  name: 'steveUserBoardDetail',
  components: {
    VueEditor
  },

  data() {
    return {
      selectboard : null,
      editor : null,
      public_check : null,
      items: ["Front-end게시판", "Back-end게시판"]
    };
  },
  
  methods: {
    getResponse() {
      if(this.selectboard == null){
        alert("타이틀을 선택해주세요")
      }else if(this.editor == null){
        alert("제목을 입력해주세요")
      }else{
        this.$axios.post('/st_user/boardInsert', {title: this.selectboard, contents: this.editor, approval_yn: this.public_check})
      .then((response) => {
        console.log("성공")
      })
      .catch((error) => {
        console.log(error)
      })
      } 
    },
    getTest(){
       this.$axios.post('/st_user/selectAll', {title: this.selectboard, contents: this.editor, approval_yn: this.public_check})
      .then((response) => {
        console.log(response.data)
        console.log("성공")
      })
      .catch((error) => {
        console.log(error)
      })
    }
  } 
};
</script>

<style>
.main_table {
  border-collapse: collapse;
	border-top: 1px solid #CCCCCC;
	border-left: 1px solid #CCCCCC;
  border-right: 1px solid #CCCCCC;
  border-bottom: 1px solid #CCCCCC;
}
.header{
  padding: 30px 0px 10px 0px;
}
.select_board{
  width: 500px;
  padding-top: 1px; 
  
}
.send_div{
  padding-top: 10px;
  float: left;
}

.main_table{
  width: 80%;
}
</style>