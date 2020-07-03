const commonStore = {
    namespaced: true,
    state: {
      allUsers: [
        { address: 'Seoul', password: '123', name: 'Hoza' },
        { address: 'DaeJeon', password: '234', name: 'Bsg' },
        { address: 'Busan', password: '356', name: 'Dsg' },
      ],
    },
    getters: {
      allUsersCount: (state) => {
        return state.allUsers.length
      },
      countOfSeoul: (state) => {
        let count = 0
        state.allUsers.forEach(user => {
          if (user.address === 'Seoul') {
            count++
          }
        })
        return count
      },
      percentOfSeoul: (state, getters) => {
        return Math.round((getters.countOfSeoul / getters.allUsersCount) * 100)
      },
    },
    mutations: {
      addUsers: (state, payload) => {
        state.allUsers.push(payload)
      }
    },
    actions: {
      // context, payload => { commit }
      addUsers: ({ commit }, payload) => {
        commit('addUsers', payload)
      }
      // addUsers: (context) => {
      //   context.commit('addUsers')
      // }
    },
    modules: {},
}

export default commonStore