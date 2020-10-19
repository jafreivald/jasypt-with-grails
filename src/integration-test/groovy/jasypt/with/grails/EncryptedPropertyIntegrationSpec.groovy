package jasypt.with.grails

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import spock.lang.Specification

@Integration
@Rollback
class EncryptedPropertyIntegrationSpec extends Specification {
    
    @Autowired
    HomeController homeController

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"Property is properly decrypted"
            "test" == homeController.index()
    }
}
