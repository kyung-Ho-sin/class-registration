<template>
  <div>
    <h1>SignUp</h1>
    <v-text-field
      v-model="userId"
      label="아이디"
    />
    <v-text-field
      v-model="password"
      label="비밀번호"
      type="password"
    />
    <v-text-field
      v-model="name"
      label="이름"
    />
    <v-text-field
      v-model="address"
      label="주소"
    />
    <v-text-field
      v-model="src"
      label="이미지"
    />
    <v-btn @click="signUp">
      회원가입
    </v-btn>
  </div>
</template>

<script>
// import { EventBus } from '@/main.js'
// import { mapMutations } from 'vuex'
import { mapActions } from 'vuex'
export default {
  data() {
    return {
      userId: null,
      password: null,
      name: null,
      address: null,
      src: null
    }
  },
  methods: {
    // ...mapMutations(['addUsers']),
    ...mapActions('commonStore' ,{
      addUserAction: 'addUsers'
    }),
    signUp() {
      const userObj = {
        userId: this.userId,
        password: this.password,
        name: this.name,
        address: this.address,
        src: this.src
      }
      // this.$store.commit('addUsers', userObj)
      // this.addUsers(userObj)
      // this.$store.dispatch('addUsers', userObj)
      this.addUserAction(userObj)

      // EventBus.$emit('signUp', userObj)

      this.clearForm()
    },
    clearForm() {
      this.userId = null
      this.password = null
      this.name = null
      this.address = null
      this.src = null
    }
  }
}
</script>
