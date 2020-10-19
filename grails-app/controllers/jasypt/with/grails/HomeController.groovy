package jasypt.with.grails

import org.springframework.beans.factory.annotation.Value

class HomeController {
   
    @Value('${enc.test.prop}') 
    String testProp

    @Value('${enc.test.plainprop}') 
    String plainProp

    def index() {
        render testProp
    }

    def plainProp() {
        render plainProp
    }
}
