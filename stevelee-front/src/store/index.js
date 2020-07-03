import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

import commonStore from './modules/common'
import steveClassStore from './modules/steve_class'
import steveMytrainStore from './modules/steve_mytrain'
import stevePushStore from './modules/steve_push'
import steveUserStore from './modules/steve_user'

const store = new Vuex.Store({
  modules: {
    commonStore: commonStore,
    steveClassStore: steveClassStore,
    steveMytrainStore: steveMytrainStore,
    stevePushStore: stevePushStore,
    steveUserStore: steveUserStore
  }
})

export default store
