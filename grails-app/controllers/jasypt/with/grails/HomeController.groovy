package jasypt.with.grails

import org.springframework.beans.factory.annotation.Value

class HomeController {
   
    @Value('${enc.test.prop}') 
    String testProp

    def index() {
        testProp
    }
}
