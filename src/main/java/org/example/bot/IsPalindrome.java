/*
https://stepik.org/lesson/12761/step/10?unit=3109
 */
 /**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

public void main() {
//    System.out.println(isPalindrome("Madam, I'm Adam!"));
//    System.out.println(isPalindrome("12Madam, I'm Adam!21"));
//    System.out.println(isPalindrome("Madam,^ I'm Adam!"));
//    System.out.println(isPalindrome("21321"));
//    System.out.println(isPalindrome("я русский"));
//    System.out.println(isPalindrome("_1"));

    System.out.println(isPalindrome("Ma0damImAdam"));

}

public static boolean isPalindrome(String text) {
    String newText = text.replaceAll("[^a-zA-Z0-9]","");
    StringBuilder builder = new StringBuilder(newText);
    String reversed = builder.reverse().toString();
    return newText.equalsIgnoreCase(reversed);
}
