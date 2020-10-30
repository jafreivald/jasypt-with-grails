package jasypt.with.grails

import org.springframework.beans.factory.annotation.Value

class HomeController {
   


    @Value('${enc.test.plainprop}') 
    String plainProp

    def index() {
        render "${grailsApplication.config.enc.test.prop}"
    }

    def plainProp() {
        render plainProp
    }
}
