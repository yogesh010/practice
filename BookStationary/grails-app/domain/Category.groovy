class Category {

    String name

static hasMany = [books:Book]
    static constraints = {

        name(blank: false)
        }
    }


