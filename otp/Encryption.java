package otp;
public class Encryption {

    public static String generateBinaryCipher(String binaryText, String binaryKey) {

        // Applying XOR logical operator;

        String binaryCipher = "";
        int len;
        String sub = "";
        // substring should not include the last index of shorter string
        if (binaryText.length() < binaryKey.length()) {
            len = binaryText.length();
            sub = binaryKey.substring(len);
        } else {
            len = binaryKey.length();
            sub = binaryText.substring(len);
        }

        for (int i = 0; i < len; i++) {

            int result = binaryText.charAt(i) ^ binaryKey.charAt(i);

            binaryCipher += String.valueOf(result);

        }
        return binaryCipher.concat(sub);
    }

}
