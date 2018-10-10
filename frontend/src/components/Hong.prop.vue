<template>
  <div class="">
    <p>===Hong Prop 시작.</p>
    <div v-for="e in list">
      {{e.age}} - {{e.name}}
    </div>
    <p>===Hong Prop 끝.</p>
  </div>
</template>

<script>
// import axios from 'axios'
import {AXIOS} from './http-common'

export default {
  // name: 'HongSub2',
  props: ['list'],
  created: function(){
    console.log("== Hong Prop created")
  }
}

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
p {
  margin-bottom: 20px;
}

h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
