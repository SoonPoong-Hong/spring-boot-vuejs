
<template>

<div>
  <div>
    <sui-button>Click Here</sui-button>
    <sui-button content="Content as a prop" />
    <div is="sui-button">This is a div</div>
    <sui-button primary>Primary</sui-button>
    <sui-button secondary>Secondary</sui-button>    
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

export default {
  name: "Hong",

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
