<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Hello</router-link> |
      <router-link to="/callservice">Service</router-link> |
      <router-link to="/bootstrap">Bootstrap</router-link> |
      <router-link to="/user">User</router-link> | 
      <router-link to="/hong">Hong</router-link> | 
      <router-link to="/hong2">Hong2</router-link> | 
      <router-link to="/semantic-test">semantic-test</router-link> | 
      <router-link to="/semantic-test2">semantic-test2</router-link> | 
    </div>
    <router-view :hellomsg="msg"></router-view>
  </div>
</template>

<script>

export default {
  name: 'app',
  data () {
    return {
      msg: 'Welcome to your Vue.js powered Spring Boot App'
    }
  }
}
</script>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 20px;
}

#nav {
  padding: 30px;
  a {
    font-weight: bold;
    color: #2c3e50;
    &.router-link-exact-active {
     color: #42b983;
    }
  }
}
</style>
