
<template>

<div>
<div class="ui form segment">
  <div class="two fields">
    <div class="field">
<label>Selection Dropdown</label>
<div class="ui selection dropdown">
  <div class="default text">Select</div>
  <i class="dropdown icon"></i>
  <input name="hidden-field" type="hidden">
  <div class="menu">
    <div class="item" data-value="1">Choice 1</div>
    <div class="item" data-value="2">Choice 2</div>
  </div>
</div>
    </div>
    <div class="field">
<label>HTML Select</label>
<select>
  <option value="">Select</option>
  <option value="1">1</option>
  <option value="2">2</option>
</select>
    </div>
  </div>
  <div class="field">
    <label>Text Area</label>
    <textarea></textarea>
  </div>
  <div class="three required fields">
    <div class="field">
<label>Required Input</label>
<input placeholder="Text Input" type="text">
    </div>
    <div class="field">
<label>Required Input</label>
<input placeholder="Text Input" type="text">
    </div>
    <div class="disabled field">
<label>Disabled Input</label>
<input placeholder="Text Input" disabled="disabled" type="text">
    </div>
  </div>
  <div class="grouped fields">
    <label>Radio Selection</label>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit" checked="checked">
  <label>Radio Option</label>
</div>
    </div>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit">
  <label>Radio Option</label>
</div>
    </div>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit">
  <label>Radio Option</label>
</div>
    </div>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit">
  <label>Radio Option</label>
</div>
    </div>
  </div>
  <div class="field">
    <label>Password</label>
    <div class="ui left icon input">
<i class="lock icon"></i>
<input type="password">
    </div>
  </div>
  <div class="inline field">
    <div class="ui checkbox">
<input type="checkbox">
<label>Checkbox</label>
    </div>
  </div>
  <div class="grouped inline fields">
    <label>Inline Radio Selection</label>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit" checked="checked">
  <label>Radio Option</label>
</div>
    </div>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit">
  <label>Radio Option</label>
</div>
    </div>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit">
  <label>Radio Option</label>
</div>
    </div>
    <div class="field">
<div class="ui radio checkbox">
  <input type="radio" name="fruit">
  <label>Radio Option</label>
</div>
    </div>
  </div>
  <div class="inline fields">
    <div class="field">
<label>Multiple Inline Fields</label>
<input placeholder="(xxx)" type="text">
    </div>
    <div class="field">
<input placeholder="xxx" type="text">
    </div>
    <div class="field">
<input placeholder="xxxx" type="text">
    </div>
  </div>
  <div class="inline field">
    <label>Inline Field</label>
    <input placeholder="Text Input" type="text">
  </div>
  <h4 class="ui header">Sub-header</h4>
  <div class="field">
    <div class="ui toggle checkbox">
<input name="privacy" type="radio">
<label>Toggle</label>
    </div>
  </div>
  <div class="field">
    <div class="ui slider checkbox">
<input name="top-posts" type="checkbox">
<label>Option</label>
    </div>
  </div>
  <div class="ui submit button">Submit</div>
</div>
<div class="ui warning form segment">
  <div class="ui warning message">
    <div class="header">Warning Message</div>
    <ul class="list">
<li>Problem #1</li>
<li>Problem #2</li>
    </ul>
  </div>
  <div class="two fields">
    <div class="field">
<label>Input</label>
<input placeholder="Text Input" type="text">
    </div>
    <div class="field">
<label>Input</label>
<input placeholder="Text Input" type="text">
    </div>
  </div>
  <div class="ui submit button">Submit</div>
</div>
<div class="ui error form segment">
  <div class="ui error message">
    <div class="header">Error Message</div>
    <p>Error message long description</p>
  </div>
  <div class="two fields">
    <div class="field error">
<label>Errored Input</label>
<input placeholder="Text Input" type="text">
    </div>
    <div class="field error">
<label>Errored Input</label>
<input placeholder="Text Input" type="text">
    </div>
  </div>
  <div class="ui submit button">Submit</div>
</div>
</div>

</template>

<script>
// import axios from 'axios'
import {AXIOS} from './http-common'

export default {
  name: 'Hong',

  data () {
    return {
      msg: "what's up?",
      items: [
        { name: 'Foo', age:33 },
        { name: 'Bar', age:33 },
        { name: 'Bar', age:33 }
      ],
      list : [],
      val2 : 0
    }
  },
  components: {
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
    // this.getList()
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
