package otp;

public class Message {

    private String key;
    private String message;

    private String binaryCipher;
    private String binaryText;
    private String binaryKey;
    private String cipherText;

    /*
     * -----------------------------------------------------
     * Encryption
     * -----------------------------------------------------
     * get the message and convert it to binary
     * generate random key and convert it to binary
     * apply OTP algorithms
     * generate cipther binary
     * convert it to string [option]
     */

    public String encrypt(String message) {

        this.message = message;

        this.key = RandomKey.generate(this.message.length());

        this.binaryText = BinarySystem.convertDecimalToBinary(this.message);

        this.binaryKey = BinarySystem.convertDecimalToBinary(this.key);

        this.binaryCipher = Encryption.generateBinaryCipher(this.binaryText, this.binaryKey);

        // should cipher convert to text and diplay it in the screen;
        this.cipherText = BinarySystem.convertBinaryToString(this.binaryCipher);

        return this.cipherText;
    }

    /*
     * -------------------------------------------------------
     * Decryption
     * -------------------------------------------------------
     * get the cipher binary and key binary
     * apply logical operator
     * reverse each 8 bits
     * convert each 8 bits from binary to decimal system
     * return the plain text
     */

    public String decrypt() {

        // it takes key binary and cipher binary

        String textBinaryDecrypted = Decryption.generatePlainText(this.binaryCipher, this.binaryKey);

        return BinarySystem.convertBinaryToString(textBinaryDecrypted);
    }

}
