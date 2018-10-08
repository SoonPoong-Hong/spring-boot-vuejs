<template>
  <div class="bootstrap">
    <h3>{{ msg }}</h3>

      <div v-for="item in items">
        {{msg}} - {{ item.name }} - {{item.age}}
      </div>
      <div>============</div>
      <HongList></HongList>
      <div>============</div>
      <div>{{listLength}}</div>
      <div>============</div>
      <button @click="getList()">callHi()</button>
      <div v-for="item in list">
        {{ item.name }} - {{item.age}}
      </div>
      
  </div>
</template>

<script>
// import axios from 'axios'
import {AXIOS} from './http-common'
import HongList from '@/components/Hong.list'

export default {
  name: 'Hong',

  data () {
    return {
      msg: "what's up",
      items: [
        { name: 'Foo', age:33 },
        { name: 'Bar', age:33 },
        { name: 'Bar', age:33 }
      ],
      list : []
    }
  },
  components: {
    HongList
  },    
  methods: {
    // Fetches posts when the component is created.
    getList () {
      AXIOS.get(`/hong/list`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.list = response.data
          // console.log(response)
        })
        .catch(e => {
          console.log(e)
          alert(e)
          this.errors.push(e)
        })
    }
  },
  created : function(){
    console.log("== Hong.vue created")
    this.getList()
  },
  computed: {
    // a computed getter
    listLength: function () {
      // `this` points to the vm instance
      return this.list.length
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
