package bookstationary

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body

class DemoTagLib {

    def h = { attrs, body ->
        def student=attrs.student
        println 'zzzzzzzzzzzzzzzzzzz'
        println student
        out << student.name


    }
}