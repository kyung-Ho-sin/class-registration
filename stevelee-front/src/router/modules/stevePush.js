const routes = [
  {
    path: '/stevePush/list',
    name: 'stevePushList',
    component: () => import(/* webpackChunkName: "stevePushList" */ '@/views/stevePush/List.vue'),
  }
]

export default routes
