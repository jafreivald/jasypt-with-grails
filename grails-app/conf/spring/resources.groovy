import org.jasypt.util.text.AES256TextEncryptor

// Place your Spring DSL code here
beans = {
    String myEncryptionPassword = grailsApplication.config.jasypt.encryptor.password
    AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
    textEncryptor.setPassword(myEncryptionPassword);

    grailsApplication.config.enc.test.prop = textEncryptor.decrypt("${grailsApplication.config.enc.test.prop}")
}