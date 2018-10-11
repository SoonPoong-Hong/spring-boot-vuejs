<template>
  <div class="xxx">
      <div>=== sub 시작 ======</div>
      <div v-for="item in list">
        {{ item.message }}
      </div>
      <div>{{errorMsg}}</div>
      <div>=== sub 끝 ======</div>
  </div>
</template>

<script>
// import axios from 'axios'
import {AXIOS} from './http-common'

export default {
  name: 'HongList',

  data () {
    return {
      list: []
      , errorMsg:""
    }
  },
  methods: {
    // Fetches posts when the component is created.
    callRestService () {
      AXIOS.get(`/hong/list`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.list = response.data
          // console.log(response)
        })
        .catch(e => {
          console.log(e)
          // alert(e)
          this.errorMsg = e;
        })
    }
  },
  created : function(){
    console.log("== Hong.list.vue created")
  },
  computed : {
    sub : function(){

    }
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
