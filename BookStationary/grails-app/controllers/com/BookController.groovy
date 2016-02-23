package com

import bookstationary.Student
class BookController {

//    def index=
//    {
//
//    def r= Student.createCriteria().list()
//            {
//
//                order('name','asc')
//
//
//            }
//
//        println "names are------"+r.name.unique()
//        println r.properties
//    }


def index(){


   println Student.list()
    [student:Student.first()]


}
                      }


