class Address
{
String address1
String zipcode
String city
String country
String address2
    static belongsTo = [author:Author]

    static constraints ={
        address1(blank:false,maxSize:30)
        zipcode(blank:false,maxSize:10)
        city(blank: false)
        country(blank: false)
        address2(blank:false)

    }
}
