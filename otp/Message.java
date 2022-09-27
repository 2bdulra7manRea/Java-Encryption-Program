package otp;

public class Message {
    
private String key;
private String binaryCipher;
private String message;
private String binaryText;
private String binaryKey;
private String cipherText;
public String encrypt(String message){
this.message=message;
this.key= RandomKey.generate();
this.binaryText = BinarySystem.convertDecimalToBinary(this.message);
this.binaryKey= BinarySystem.convertDecimalToBinary(this.key);
this.binaryCipher= Encryption.generateBinaryCipher(this.binaryText,this.binaryKey);

// should cipher convert to text and diplay it in the screen;
 this.cipherText= BinarySystem.convertBinaryToString(binaryCipher);

return this.cipherText;
}


public void decrypt(){

// this.plainText = Decryption.generatePlainText(this.binaryCipher, this.binaryKey);
// // this is a plain text after decryption
// System.out.println(this.plainText);

}




}
