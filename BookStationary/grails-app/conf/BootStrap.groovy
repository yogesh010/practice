
import bookstationary.Student
class BootStrap {

    def init = { servletContext ->



      Author au=new Author(name:"yogesh",age:"24",Address:"j-89")
        Student s=new Student(name:"yogesh",age:"24",address: "j-45")
        Student s1=new Student(name:"akash",age:"23",address: "p-44").save()

        Student s2=new Student(name:"rohit",age:"26",address: "q-44").save()



    }
    def destroy = {
    }
}
