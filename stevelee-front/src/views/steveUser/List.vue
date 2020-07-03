<template>
  <div>
    <h1>{{ new Date() }}</h1>
  </div>
</template>

<script>
// @ is an alias to /src
import { mapState, mapGetters } from 'vuex'

export default {
  name: 'steveUserList',
  data() {
    return {
      
    }
  },
  computed: {
  },
  methods: {
    getResponse() {
      this.$axios.post('/api/steveclass/cardlist', {
      })
      .then((response) => {
        this.cardList = response.data.list
        console.log(this.cardList)
      })
      .catch((error) => {
        console.log(error)
      })
    }
  }
}
</script>
