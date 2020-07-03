<template>
  <div class="home">
    <p>{{ count }}</p>
    <v-list-item-content v-for="(user, index) in allUserList" :key="index">
      <v-list-item-title>id:#{{ index }} / {{ user.address }} 거주</v-list-item-title>
    </v-list-item-content>

    <p>{{ seouls }}</p>
    <p>{{ percent }}</p>
  </div>
</template>

<script>
// @ is an alias to /src
import { mapState, mapGetters } from 'vuex'

export default {
  name: 'Home',
  computed: {
    ...mapGetters('commonStore', {
      count: 'allUsersCount',
      seouls: 'countOfSeoul',
      percent: 'percentOfSeoul',
    }),
    ...mapState('commonStore', {
      allUserList: 'allUsers',
    })
  },
}
</script>
