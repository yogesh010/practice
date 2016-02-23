

class Author {

    String name
    Long age
    Address address
    Long mobile
    Gender gender
    String email

    static hasMany = [books: Book]
    static constraints = {

        name(blank: false)

        mobile(null:false)
        gender(blank:false)
        email(blank:false)



    }
}

