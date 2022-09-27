package otp;

public class BinarySystem {

    // (American Standard Code for Information Interchange) ASCII

    public static String convertDecimalToBinary(String plainText) {

        return stringtoBinary(plainText);

    }

    private static String reverse(String binary) {

        String reversedBinary = "";

        for (int i = binary.length() - 1; i >= 0; i--) {
            reversedBinary += binary.charAt(i);
        }
        return reversedBinary;
    }

    private static String getBinary(char a) {
        String binary = "";
        int intgerValue = Integer.valueOf(a);
        // System.out.println(intgerValue);
        while (intgerValue > 0) {

            if (intgerValue % 2 == 0) {
                binary += "0";
            } else {
                binary += "1";
            }

            intgerValue = (int) intgerValue / 2;
        }

        if (binary.length() < 8) {
            while (binary.length() < 8) {
                binary += "0";
            }
        }
        return reverse(binary);
    }

    private static String stringtoBinary(String text) {

        String binaryFull = "";

        for (int i = 0; i < text.length(); i++) {

            binaryFull += getBinary(text.charAt(i));

        }

        return binaryFull;
    }

    public static int getASCIIForBinaryChar(String binaryChar) {
        String binary = reverse(binaryChar);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            int a = Integer.parseInt(String.valueOf(binary.charAt(i)));

            sum += Math.pow(2, i) * a;

        }
        return sum;
    }

    public static String convertBinaryToString(String binary) {

        // get each 8
        // reverse
        // apply pow math
        // get number value
        String plainText = "";
        for (int i = 0; i < binary.length()/8; i++) {
            int start = i*8;
            int end = (i*8)+8;
            String charBinary = binary.substring(start,end);
            int acsiiValue = getASCIIForBinaryChar(charBinary);
            plainText += (char) acsiiValue;
        }

        return plainText;
    }

}
