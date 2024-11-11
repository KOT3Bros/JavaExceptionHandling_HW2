/*
Задача 4. Нахождение среднеарифметического числа

Напишите метод, который находит среднее значение массива целых чисел.
Если массив пустой или null, метод должен вернуть Double.NaN и вывести
сообщение об ошибке.
*/

import java.util.Arrays;

class Statistics {
    public static double findAverage(int[] array) {
        // Напишите свое решение ниже
        try {
            if (array == null || array.length == 0) {
                System.out.println("Массив пуст или null.");
                return Double.NaN;
            }
            double sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum / array.length;
        } catch (Exception e) {
            System.out.println("Ошибка при расчете среднего значения массива.");
            return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array;
        if (args.length > 0) {
            array = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        } else {
            array = new int[]{10, 20, 30, 40, 50}; // Значение по умолчанию
        }
        double average = Statistics.findAverage(array);
        System.out.println(average);
    }
}
