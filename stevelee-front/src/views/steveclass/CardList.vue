<template>
  <div>
    <div class="text-center">
      <v-btn class="ma-2" outlined color="indigo" @click="getResponse()">
        목록 불러오기
      </v-btn>
      <!--
          {{ item.update_id }}
          {{ item.weeks }}
          {{ item.use_yn }}
          {{ item.approval_yn }}
          {{ item.to_hhmm }}
          {{ item.class_no }}
          {{ item.class_amount }}
          {{ item.from_yyyymmdd }}
          {{ item.to_yyyymmdd }}
          {{ item.times }}
          {{ item.class_type }}
          {{ item.create_id }}
          {{ item.create_dt }}
          {{ item.from_hhmm }}
          {{ item.class_name }} 
        -->
      
      <v-container class="grey lighten-5">
        <v-row no-gutters>
          <v-col
            v-for="(item, index) in cardList"
            :key="index"
            cols="12"
            sm="4"
          >
            <v-hover>
              <template v-slot:default="{ hover }">
                <v-card
                  class="mx-auto" style="margin:0 15px 0 0;"
                >
                  <v-img src="https://cdn.vuetifyjs.com/images/cards/forest-art.jpg"></v-img>

                  <v-card-text>
                    <h2 class="title primary--text">{{ item.class_name }}</h2>
                    {{ item.create_dt }}
                  </v-card-text>

                  <v-card-title>
                    <v-rating
                      :value="4"
                      dense
                      color="orange"
                      background-color="orange"
                      hover
                      class="mr-2"
                    ></v-rating>
                    <span class="primary--text subtitle-2">64 Reviews</span>
                  </v-card-title>

                  <v-fade-transition>
                    <v-overlay
                      v-if="hover"
                      absolute
                      color="#036358"
                    >
                      <v-btn>See more info</v-btn>
                    </v-overlay>
                  </v-fade-transition>
                </v-card>
              </template>
            </v-hover>
          </v-col>
        </v-row>
      </v-container>

    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import { mapState, mapGetters } from 'vuex'

export default {
  name: 'steveClassCardList',
  data() {
    return {
      cardList: null,
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
