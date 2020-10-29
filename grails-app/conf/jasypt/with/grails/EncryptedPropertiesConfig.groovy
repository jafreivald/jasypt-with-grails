package jasypt.with.grails

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource
import org.springframework.context.annotation.Configuration

@Configuration
@EncryptablePropertySource("application.yml")
class EncryptedPropertiesConfig {
}
