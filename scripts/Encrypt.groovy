@GrabConfig(systemClassLoader=true)
@GrabResolver(name = 'libs.release', root = 'https://ivyrepo.mutualofomaha.com/artifactory/libs-release/', m2compatible = 'true')
@Grapes([
        @Grab('org.apache.ivy:ivy:2.4.0'),
        @Grab('org.jasypt:jasypt:1.9.3')
])

import org.jasypt.util.text.AES256TextEncryptor


def enc(String s) {
    String myEncryptionPassword = 'testP@ssword'
    AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
    textEncryptor.setPassword(myEncryptionPassword);

    println "Encrypting: $s"
    String myEncryptedText = textEncryptor.encrypt(s);
    println myEncryptedText
    String plainText = textEncryptor.decrypt(myEncryptedText);
    println plainText

}

def dec(String s) {
    String myEncryptionPassword = 'testP@ssword'
    AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
    textEncryptor.setPassword(myEncryptionPassword);

    println "Decrypting: $s"
    String plainText = textEncryptor.decrypt(s);
    println plainText
}

if(args[0] == "-d"){
    dec(args[1])
} else {
    enc(args[0])
}


