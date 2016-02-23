package bookstationary

class Student {

    String name
    String address
    int    age


    static constraints = {

        name(blank: false)
        address(blank:false)
        age(max: 30)
    }
}
