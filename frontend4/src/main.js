import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Vuetify from 'vuetify'
import 'vuetify/dist/vuetify.min.css' // Ensure you are using css-loader
// import 'font-awesome/css/font-awesome.css';
import 'material-design-icons-iconfont/dist/material-design-icons.css' // Ensure you are using css-loade
import '@mdi/font/css/materialdesignicons.css' // Ensure you are using css-loader

Vue.config.productionTip = false
Vue.use(Vuetify)

// Vue.use(Vuetify, {
//   // theme: {
//   //   primary: colors.indigo.base, // #E53935
//   //   secondary: colors.indigo.lighten4, // #FFCDD2
//   //   accent: colors.indigo.base // #3F51B5
//   // },
//   options: {
//     themeVariations: ['primary', 'secondary', 'accent'],
//     extra: {
//       mainToolbar: {
//         color: 'primary',
//       },
//       sideToolbar: {
//       },
//       sideNav: 'primary',
//       mainNav: 'primary lighten-1',
//       bodyBg: '',
//     }
//   }
// });

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
