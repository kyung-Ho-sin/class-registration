const routes = [
  {
    path: '/steveUser/list',
    name: 'steveUserList',
    component: () => import(/* webpackChunkName: "steveUserList" */ '@/views/steveUser/List.vue'),
  },
  {
    path: '/steveUser/board/detail',
    name: 'steveUserBoardDetail',
    component: () => import(/* webpackChunkName: "steveUserBoardDetail" */ '@/views/steveUser/BoardDetail.vue'),
  },
  {
    path: '/steveUser/board/MainPage',
    name: 'steveUserMainBoard',
    component: () => import(/* webpackChunkName: "steveUserMainBoard" */ '@/views/steveUser/MainBoard.vue'),
  },
]

export default routes
