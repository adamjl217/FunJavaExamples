package lahey.implementation;

public class StringModifiers {

    public static String reverseString(String toBeReversed) {
        int size = 0;

        try {
            while(true) {
                toBeReversed.charAt(size);
                size++;
            }
        } catch(IndexOutOfBoundsException iobe) {
            iobe.getMessage();
        }

        char[] at = new char[size];

        for(int i = 0; i < size; i++) {
            at[i] = toBeReversed.charAt(size - i - 1);
        }

        String reversed = new String (at);

        return reversed;
    }

    public static boolean isPalindrome(String palindrome) {
        if(reverseString(palindrome).equals(palindrome))
            return true;
        else
            return false;

    }

    public static String switchString(String modify) {
        return modify.substring(1, 2).concat(modify.substring(0, 1)).concat(" ").concat(modify.substring(2));
    }

}
