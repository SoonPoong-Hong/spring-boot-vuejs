<template>
    <li>{{ todo.name }}</li>
</template>

<script>
// import axios from 'axios'
import {AXIOS} from './http-common'

export default {
  name: 'Hong_basic_sub',

  props: ['todo'],

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
