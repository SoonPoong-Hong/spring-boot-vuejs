
<template>

<div>
  <div>



<div class="ui pagination menu">
  <a class="item">
    1
  </a>
  <div class="disabled item">
    ...
  </div>
  <a class="item">
    10
  </a>
  <a class="item active">
    11
  </a>
  <a class="item">
    12
  </a>
</div>


    
  </div>  
</div>

</template>

<script>
// import axios from 'axios'
import { AXIOS } from "./http-common";
// import SuiVue from "semantic-ui-vue";

// import SuiVue from 'semantic-ui-vue'
// import 'semantic-ui-css/semantic.min.css'

// import 'semantic-ui-css/semantic.min.css'
// import 'semantic-ui-less/semantic.less';

// import SuiVue from "semantic-ui-vue";

export default {
  name: "Hong2",

  data() {
    return {
      msg: "what's up?",
      items: [
        { name: "Foo", age: 33 },
        { name: "Bar", age: 33 },
        { name: "Bar", age: 33 }
      ],
      list: [],
      val2: 0
    };
  },
  components: {},
  methods: {
    // Fetches posts when the component is created.
    getList() {
      AXIOS.get(`/hong/list`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.list = response.data;
          // console.log(response)
        })
        .catch(e => {
          console.log(e);
          alert(e);
          this.errors.push(e);
        });
    }
  },
  created: function() {
    console.log("== Hong.vue created");
    // this.getList()
  },
  computed: {
    // a computed getter
    listLength: function() {
      // `this` points to the vm instance
      //return this.list.length
      return 0;
    }
  }
};
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
