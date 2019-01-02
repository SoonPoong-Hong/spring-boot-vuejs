import Vue from 'vue'
import './plugins/vuetify'
import App from './App.vue'
import router from './router'
// import BootstrapVue from 'bootstrap-vue'
// import 'bootstrap/dist/css/bootstrap.css'
// import 'bootstrap-vue/dist/bootstrap-vue.css'

// import SuiVue from 'semantic-ui-vue';
// import 'semantic-ui-css/semantic.min.css'
// import 'semantic-ui-css/semantic.min.css'

// light wieght semantic
// import 'semantic-ui-css/semantic.min.css';
// full semantic
import '../semantic/dist/semantic.min.css';

// semantic-ui-vue 를 사용할때
import SuiVue from 'semantic-ui-vue';
Vue.use(SuiVue);

Vue.config.productionTip = true

// Bootstrap
// Vue.use(BootstrapVue)

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')

