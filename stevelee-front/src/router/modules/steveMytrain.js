const routes = [
  {
    path: '/steveMytrain/list',
    name: 'steveMytrainList',
    component: () => import(/* webpackChunkName: "steveMytrainList" */ '@/views/steveMytrain/List.vue'),
  },
  {
    path: '/steveMytrain/lectureRoom',
    name: 'lectureRoom',
    component: () => import(/* webpackChunkName: "lectureRoom" */ '@/views/steveMytrain/LectureRoom.vue'),
  }
]

export default routes
