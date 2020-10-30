package jasypt.with.grails

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import org.springframework.beans.factory.annotation.Value

class HomeController implements GrailsConfigurationAware {

    String testProp

    @Value('${enc.test.plainprop}')
    String plainProp

    def index() {
        render "Hello $testProp"
    }

    def plainProp() {
        render plainProp
    }

    void setConfiguration(Config config) {
        testProp = config.getProperty('enc.test.prop', String)
    }
}
