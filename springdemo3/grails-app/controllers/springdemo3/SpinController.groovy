package springdemo3
import grails.plugin.springsecurity.annotation.Secured


class SpinController {

    def springSecurityService

    @Secured(["ROLE_USER"])
    def index() {
        render "this is public page"
    }


    @Secured(["ROLE_USER"])
    def userPage () {
        render "this is user page"
    }

    @Secured(['ROLE_ADMIN'])
    def adminPage () {
        render "this is  admin page"
    }

    @Secured(["ROLE_USER", "ROLE_ADMIN"])
    def commonPage () {
        render "this is a common page"
    }

}
