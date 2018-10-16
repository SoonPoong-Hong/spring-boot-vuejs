import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Service from '@/components/Service'
import Bootstrap from '@/components/Bootstrap'
import User from '@/components/User'
import Hong from '@/components/Hong'
import Hong2 from '@/components/Hong2'
import SemanticTest from '@/components/Semantic-test'
import SemanticTest2 from '@/components/Semantic-test2'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/callservice',
      name: 'Service',
      component: Service
    },
    {
      path: '/bootstrap',
      name: 'Bootstrap',
      component: Bootstrap
    },
    {
      path: '/user',
      name: 'User',
      component: User
    },
    {
      path: '/hong',
      name: 'Hong',
      component: Hong
    },
    {
      path: '/hong2',
      name: 'Hong2',
      component: Hong2
    },
    {
      path: '/semantic-test',
      name: 'Semantic-test',
      component: SemanticTest
    },
    {
      path: '/semantic-test2',
      name: 'Semantic-test2',
      component: SemanticTest2
    }

  ]
})
