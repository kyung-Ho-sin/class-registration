<template>
  <div>
    <h1>Users</h1>

    <v-list flat>
      <v-subheader>User List</v-subheader>
      <v-list-item-group color="primary">
        <v-list-item
          v-for="(item, i) in userList"
          :key="i"
        >
          <v-list-item-content>
            이름<v-list-item-title v-text="item.name" />
          </v-list-item-content>
          <v-list-item-content>
            주소<v-list-item-title v-text="item.address" />
          </v-list-item-content>
        </v-list-item>
      </v-list-item-group>
    </v-list>
  </div>
</template>

<script>
import { mapState } from 'vuex'
// import { EventBus } from '@/main.js'
export default {
  data() {
    return {
      // allUsers: [
      //   {
      //     userId: 'hoza123',
      //     password: '123',
      //     name: 'Hoza',
      //     address: 'Seoul',
      //     src: 'https://goo.gl/oqLfJR',
      //   },
      //   {
      //     userId: 'max123',
      //     password: '456',
      //     name: 'Max',
      //     address: 'Berlin',
      //     src: 'https://goo.gl/Ksk9B9',
      //   },
      //   {
      //     userId: 'lego123',
      //     password: '789',
      //     name: 'Lego',
      //     address: 'Busan',
      //     src: 'https://goo.gl/x7SpCD',
      //   },
      // ],
    }
  },
  computed: {
    ...mapState('commonStore', {
      userList: 'allUsers'
    })
  },
  // mounted() {
  //   EventBus.$on('signUp', (users) => {
  //     this.allUsers.push(users)
  //   })
  // },
}
</script>
