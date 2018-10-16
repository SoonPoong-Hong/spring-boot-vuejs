import Vue from 'vue'
import App from './App.vue'
import router from './router'
// import BootstrapVue from 'bootstrap-vue'
// import 'bootstrap/dist/css/bootstrap.css'
// import 'bootstrap-vue/dist/bootstrap-vue.css'

import SuiVue from 'semantic-ui-vue';
// import 'semantic-ui-css/semantic.min.css'
// import 'semantic-ui-css/semantic.min.css'
import 'semantic-ui-css/semantic.min.css';
import '../semantic/dist/semantic.min.css';

// import SuiVue from 'semantic-ui-vue';
Vue.use(SuiVue);

Vue.config.productionTip = false

// Bootstrap
// Vue.use(BootstrapVue)

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')

