class Book
{
    String title
    int price
    int ISBN
    Date datePublish
    static belongsTo = Author
    static hasMany = [authors:Author]
  //static belongsTo =Category
    static constraints = {
        title(blank:false)
        price(nullable:false)
        ISBN(nulllable:false)
    }
}
