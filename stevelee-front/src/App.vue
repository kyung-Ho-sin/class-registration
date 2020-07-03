<template>
  <v-app id="inspire">
    <v-navigation-drawer v-model="drawer" app>
      <v-list dense>
        <v-list-item router-link :to="{name:'Home'}">
          <v-list-item-action>
            <v-icon>Home</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Home</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item router-link :to="{name:'Login'}">
          <v-list-item-action>
            <v-icon>Login</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>로그인</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item router-link :to="{name:'Users'}">
          <v-list-item-action>
            <v-icon>Users</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>회원가입</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item router-link :to="{name:'steveClassList'}">
          <v-list-item-action>
            <v-icon>class</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>카드목록</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item router-link :to="{name:'steveUserBoardDetail'}">
          <v-list-item-action>
            <v-icon>board</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>게시판</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar app color="indigo" dark>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer" />
      <v-row justify="space-around">
        <v-menu
          bottom
          origin="center center"
          transition="scale-transition"
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              color="primary"
              dark
              v-bind="attrs"
              v-on="on"
            >
            steve_user
            </v-btn>
          </template>
          <v-list>
            <v-list-item
              v-for="(item, i) in steveuser"
              :key="i"
              router-link :to="{name: item.name}"
            >
              <v-list-item-title>{{ item.title }}</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-menu>

        <v-menu
          transition="slide-x-transition"
          bottom
          right
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              class="deep-orange"
              color="primary"
              dark
              v-bind="attrs"
              v-on="on"
            >
            steve_class
            </v-btn>
          </template>
          <v-list>
            <v-list-item
              v-for="(item, i) in steveclass"
              :key="i"
              router-link :to="{name: item.name}"
            >
              <v-list-item-title>{{ item.title }}</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-menu>

        <v-menu
          transition="slide-y-transition"
          bottom
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              class="purple"
              color="primary"
              dark
              v-bind="attrs"
              v-on="on"
            >
              steve_mytrain
            </v-btn>
          </template>
          <v-list>
            <v-list-item
              v-for="(item, i) in stevemytrain"
              :key="i"
              router-link :to="{name: item.name}"
            >
              <v-list-item-title>{{ item.title }}</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-menu>
      </v-row>
    </v-app-bar>

    <v-container grid-list-xl >
      <v-layout row wrap>
        <v-content>
          <router-view />
        </v-content>
      </v-layout>
    </v-container>

    <v-footer color="indigo" app>
      <span class="white--text">&copy; 2020</span>
    </v-footer>
  </v-app>
</template>

<script>
export default {
  data: () => ({
    steveclass: [
      { name: 'steveClassList', title: '강좌 목록' },
      { name: 'steveClassCardList', title: '카드 목록' },
      { name: 'steveClassCreate', title: '강좌 등록' },
    ],
    steveuser: [
      
      { name: 'steveUserBoardDetail', title: '게시판' }
    ],
    stevemytrain: [
      { name: 'steveMytrainList', title: '목록' },
      { name: 'lectureRoom', title: '강의실'}
    ],
    drawer: null,
  }),
}
</script>
