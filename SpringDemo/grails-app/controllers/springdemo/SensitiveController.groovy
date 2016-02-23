package springdemo

import grails.plugins.springsecurity.Secured

class SensitiveController {

    def springSecurityService

    def index() {
//        render view :'link1'
   }

    @Secured(['ROLE_USER'])
    def userPage = {
        render view:'link1'
    }

    @Secured(['ROLE_ADMIN'])
    def adminPage = {
        render "this is  admin page"
    }

    @Secured(["ROLE_USER", "ROLE_ADMIN"])
    def commonPage = {
        render "this is a common page"
    }

    def commonAction = {
//        springSecurityService.currentUser instanceof
//    }

    }
}
