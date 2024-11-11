/*
Задача 3. Сортировка массива строк

Напишите метод, который принимает массив строк и сортирует его в
алфавитном порядке. Если входной массив null, метод должен вернуть пустой
массив и вывести сообщение об ошибке
*/

import java.util.Arrays;

class StringSorter {
    public static String[] sortStrings(String[] strings) {
        // Введите свое решение ниже
        try {
            if (strings.length == 0 || strings == null) {
                System.out.println("Массив пуст или null.");
                return new String[0];
            }
            Arrays.sort(strings);
            return strings;
        } catch (Exception e) {
            System.out.println("Ошибка при сортировке массива.");
            return new String[0];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strings;
        if (args.length > 0) {
            strings = args[0].split(",");
        } else {
            strings = new String[]{"banana", "apple", "cherry"}; // Значение по умолчанию
        }
        String[] result = StringSorter.sortStrings(strings);
        System.out.println(Arrays.toString(result));
    }
}