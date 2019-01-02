
<template>

<div>
  <div>
    <sui-button>Click Here</sui-button>
    <sui-button content="Content as a prop" />
    <div is="sui-button">This is a div</div>
    <sui-button primary>Primary</sui-button>
    <sui-button secondary>Secondary</sui-button>    

    <div class="ui input focus">
      <input type="text" placeholder="Search...">
    </div>    
    <br>
    <button class="ui secondary button">
      Okay
    </button>
    <button class="ui button">
      Cancel
    </button>   

    <button class="ui primary button">
      Save
    </button>
    <button class="ui button">
      Discard
    </button>     

    <div class="ui labeled button" tabindex="0">
      <div class="ui red button">
        <i class="heart icon"></i> Like
      </div>
      <a class="ui basic red left pointing label">
        1,048
      </a>
    </div>
    <div class="ui labeled button" tabindex="0">
      <div class="ui basic blue button">
        <i class="fork icon"></i> Forks
      </div>
      <a class="ui basic left pointing blue label">
        1,048
      </a>
    </div>

  <sui-menu tabular>
    <a
      is="sui-menu-item"
      v-for="item in items"
      :key="item"
      :active="isActive(item)"
      :content="item"
      @click="select(item)"
    />
  </sui-menu>

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
  name: "Hong",

  data() {
    return {
      items: ['Bio', 'Photos'],
      active: 'Bio',      
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
    },
    isActive(name) {
      return this.active === name;
    },
    select(name) {
      this.active = name;
    },    
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
