<template>
  <div class="">
    <p>===Hong Prop 시작.</p>
    <div v-for="e in list">
      {{e.age}} - {{e.name}}
    </div>
    <button v-on:click="$emit('fromChild', 1)">
      Enlarge text
    </button>
    <input 
      v-bind:value="value"
      v-on:input="$emit('input'"
    >
    <p>===Hong Prop 끝.</p>
  </div>
</template>

<script>
// import axios from 'axios'
import { AXIOS } from "./http-common";

export default {
  // name: 'HongSub2',  => name은 꼭 필요한게 아닌거 같다.
  props: ["list", "value"],
  created: function() {
    console.log("== Hong Prop created");
  }
};
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
p {
  margin-bottom: 20px;
}

h1,
h2 {
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
