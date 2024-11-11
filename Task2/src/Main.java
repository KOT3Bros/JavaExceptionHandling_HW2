/*
Задача 2. Проверка строки на палиндром

Напишите метод, который проверяет, является ли введенная строка
палиндромом. Если строка палиндром, возвращайте "Palindrome". Если нет
— "Not a palindrome".
*/

class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Введите свое решение ниже
        try {
            input.replace(" ", "").toLowerCase();
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            System.err.println("Произошла ошибка.");
            return false;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        String input;
        if (args.length > 0) {
            input = args[0];
        } else {
            input = "A man a plan a canal Panama"; // Значение по умолчанию
        }
        boolean result = PalindromeChecker.isPalindrome(input);
        System.out.println("Is the input a palindrome? " + result);
    }
}
