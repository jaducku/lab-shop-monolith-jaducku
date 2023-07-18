
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MonolithOrderManager from "./components/listers/MonolithOrderCards"
import MonolithOrderDetail from "./components/listers/MonolithOrderDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/monoliths/orders',
                name: 'MonolithOrderManager',
                component: MonolithOrderManager
            },
            {
                path: '/monoliths/orders/:id',
                name: 'MonolithOrderDetail',
                component: MonolithOrderDetail
            },




    ]
})
