import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

import steveClassRoutes from './modules/steveClass';
import steveMytrainoutes from './modules/steveMytrain';
import stevePushRoutes from './modules/stevePush';
import steveUserRoutes from './modules/steveUser';

const routes = [
  {
    path: '/Home',
    name: 'Home',
    component: () => import(/* webpackChunkName: "home" */ '../views/common/Home.vue'),
  },
  {
    path: '/Login',
    name: 'Login',
    component: () =>
      import(/* webpackChunkName: "Login" */ '../views/common/Login.vue'),
  },
  {
    path: '/Users',
    name: 'Users',
    component: () =>
      import(/* webpackChunkName: "Users" */ '../views/common/Users.vue'),
  },
  ...steveClassRoutes,
  ...steveMytrainoutes,
  ...stevePushRoutes,
  ...steveUserRoutes
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
})

export default router
