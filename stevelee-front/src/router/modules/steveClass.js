const routes = [
  {
    path: '/steveclass/list',
    name: 'steveClassList',
    component: () => import(/* webpackChunkName: "steveClassList" */ '@/views/steveclass/List.vue'),
  },
  {
    path: '/steveclass/cardlist',
    name: 'steveClassCardList',
    component: () => import(/* webpackChunkName: "steveClassCardList" */ '@/views/steveclass/CardList.vue'),
  },
  {
    path: '/steveclass/create',
    name: 'steveClassCreate',
    component: () => import(/* webpackChunkName: "steveClassCreate" */ '@/views/steveclass/Create.vue'),
  },
  
]

export default routes
