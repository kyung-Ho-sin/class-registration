<template>
  <div>
    <div class="text-center">
      <v-container class="grey lighten-5">
        <h1>강좌 등록</h1>
      </v-container>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import { mapState, mapGetters } from 'vuex'

export default {
  name: 'steveClassCreate',
  data() {
    return {
    }
  },
  computed: {
  },
  methods: {
    // getResponse() {
    //   this.$axios.post('/api/steveclass/cardlist', {
    //   })
    //   .then((response) => {
    //     this.cardList = response.data.list
    //     console.log(this.cardList)
    //   })
    //   .catch((error) => {
    //     console.log(error)
    //   })
    // }
  }
}
</script>
