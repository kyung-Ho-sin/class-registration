<template>
  <v-container fill-height style="max-width:450px;">
    <v-layout align-center row wrap>
      <v-flex xs12>
        <v-card>
          <v-toolbar color="primary" flat>
            <v-toolbar-title>로그인</v-toolbar-title>
          </v-toolbar>
          <div class="pa-3">
            <v-text-field
              v-model="email"
              label="이메일을 입력하세요"
            />
            <v-text-field
              v-model="password"
              type="password"
              label="패스워드를 입력하세요"
            />
            <v-btn color="primary" depressed block large @click="axiosTest">
              로그인
            </v-btn>
            <v-btn @click="axiosTest">
              Axios테스트
            </v-btn>
          </div>
        </v-card>
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Login',


  data() {
    return {
      mailId: "",
      pw: "",
      email: null,
      password: null,
      allUsers: [
        {
          id: 1,
          name: 'ByungSoo',
          email: 'black55098@naver.com',
          password: '123456',
        },
        {
          id: 2,
          name: 'ByungSoo2',
          email: 'black5509888@naver.com',
          password: '123456',
        },
      ],
    }
  },
  methods: {
    login() {
      let targetUser = null

      this.allUsers.forEach(user => {
        if (user.email === this.email) {
          targetUser = user
        }
      })

      if (targetUser === null) {
        alert('email 없음')
      }

      console.log(`id => ` + this.email)
      console.log(`password =>` + this.password)
    },
    axiosTest() {
      const userData = {
        mailId: "bin4",
        pw: "111"
      }

      axios
        //.post('http://localhost:8094/login', userData)
        .get('http://localhost:8094/login?mailId=bin4&pw=111')
        .then((res) => {
          // handle success
          console.log(res)
        })
        .catch((err) => {
          // handle error
          console.log(err)
        })
        .then(() => {
          // always executed
        })
    }
  },
}
</script>
