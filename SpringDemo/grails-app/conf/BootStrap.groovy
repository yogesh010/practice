import com.springdemo.Role
import com.springdemo.User
import com.springdemo.UserRole

class BootStrap {

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def userRole = new Role(authority: "ROLE_USER").save()

        def testUser = new User(username: 'yogesh',password: '1234', enabled: true).save()

        UserRole.create testUser, userRole, true

    }
    def destroy = {
    }
}
