/*
Задание 1. Проверка корректности даты

Напишите метод, который проверяет, является ли введенная строка корректной
датой в формате "YYYY-MM-DD". Дата должна быть в пределах от 0001-01-01
до 9999-12-31. Если дата корректна, возвращайте её. Если нет — сообщение
об ошибке.
*/

class DateValidator {
    public static String validateDate(String date) {
        // Введите свое решение ниже
        try {
            if (date.length() != 10) {
                return "Некорректный формат даты. Введите дату в формате YYYY-MM-DD.";
            }
            String yearStr = date.substring(0, 4);
            String monthStr = date.substring(5, 7);
            String dayStr = date.substring(8, 10);
            if (date.charAt(4) != '-' || date.charAt(7) != '-') {
                return "Некорректный формат даты. Введите дату в формате YYYY-MM-DD.";
            }
            int year = Integer.parseInt(yearStr);
            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);
            if (year < 1 || year > 9999) {
                return "Год должен быть в диапазоне от 0001 до 9999.";
            }
            if (month < 1 || month > 12) {
                return "Месяц должен быть в диапазоне от 01 до 12.";
            }
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30,
                    31, 30, 31};
            if (month == 2 && isLeapYear(year)) {
                daysInMonth[1] = 29;
            }
            if (day < 1 || day > daysInMonth[month - 1]) {
                return "День должен быть в диапазоне от 01 до " + daysInMonth[month-1] + " для " + month + " месяца.";
            }
            return date;
        } catch (NumberFormatException e) {
            return "Введены не числа.";
        } catch (Exception e) {
            return "Произошла ошибка.";
        }
    }


    // Метод для проверки високосного года
    private static boolean isLeapYear(int year) {
        // Введите свое решение ниже
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class Main {
    public static void main(String[] args) {
        String date;
        if (args.length > 0) {
            date = args[0];
        } else {
            date = "2024-09-01"; // Значение по умолчанию
        }
        String result = DateValidator.validateDate(date);
        System.out.println(result);
    }
}