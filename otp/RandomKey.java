package otp;
public class RandomKey {

    public static String generate(int length) {
        String charaters = "q7we65rt43y21ui&opa%sdfg%hjkl$z#xcv@bnm!890";
        char[] key = new char[length];
        int max = charaters.length();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * max - 1);
            // ! should store unique char
            key[i] = charaters.charAt(randomIndex);
        }
        return String.valueOf(key);
    }

}
