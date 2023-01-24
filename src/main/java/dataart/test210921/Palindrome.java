package dataart.test210921;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2332));
    }

    public static boolean isPalindrome(int value) {
        String valueString = String.valueOf(value);
        StringBuilder stringBuilder = new StringBuilder(valueString).reverse();
        return valueString.contentEquals(stringBuilder);
    }
}

