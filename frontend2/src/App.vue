<template>
  <div id="app">
      <div class="ui fixed inverted menu">
        <div class="ui container">
          <a href="#" class="header item">
            <img class="logo" src="assets/images/logo.png">
            Project Name
          </a>
          <a href="#" class="item">Home</a>
          <div class="ui simple dropdown item">
            Dropdown <i class="dropdown icon"></i>
            <div class="menu">
              <router-link class="item" to="/callservice">Service</router-link>
              <router-link class="item" to="/hong">Hong</router-link>
              <a class="item" href="#">Link Item</a>
              <div class="divider"></div>
              <div class="header">Header Item</div>
              <div class="item">
                <i class="dropdown icon"></i>
                Sub Menu
                <div class="menu">
                  <router-link class="item" to="/semantic-test2">semantic-test2</router-link>
                  <a class="item" href="#">Link Item</a>
                  <a class="item" href="#">Link Item</a>
                </div>
              </div>
              <a class="item" href="#">Link Item</a>
            </div>
          </div>
        </div>
      </div>


      <div class="ui main text container">
        <h1 class="ui header">Semantic UI Fixed Template</h1>
        <router-view :hellomsg="msg"></router-view>
      </div>



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

<style scoped>

  .ui.menu .item img.logo {
    margin-right: 1.5em;
  }
  .main.container {
    margin-top: 4em;
  }
  .wireframe {
    margin-top: 2em;
  }
  .ui.footer.segment {
    margin: 5em 0em 0em;
    padding: 5em 0em;
  }

</style>
