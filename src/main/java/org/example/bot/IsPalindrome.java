/*
https://stepik.org/lesson/12761/step/10?unit=3109
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
Т.е. русских, китайских и прочих экзотических символов в строке не будет.
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
Подсказки (не читайте, если хотите решить сами):

для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]";
найдите в классе String метод, выполняющий замену по регулярному выражению;
для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
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

    //
}
