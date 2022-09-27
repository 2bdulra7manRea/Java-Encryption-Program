package otp;

public class Decryption {

    public static String generatePlainText(String binaryCipher, String binaryKey) {

        int len = 0;
        String sub = "";
        if (binaryCipher.length() < binaryKey.length()) {
            len = binaryCipher.length();
            sub = binaryKey.substring(len);

        } else {
            len = binaryKey.length();
            sub = binaryCipher.substring(len);
        }

        String messageBinary = "";

        for (int i = 0; i < len; i++) {

            if (binaryCipher.charAt(i) == '0') {

                messageBinary += binaryKey.charAt(i);

            } else {

                if (binaryKey.charAt(i) == '1') {

                    messageBinary += '0';

                } else {

                    messageBinary += '1';
                }

            }

        }

        return messageBinary.concat(sub);
    }

}
