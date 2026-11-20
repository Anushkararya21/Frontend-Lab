public class ReverseAString {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
