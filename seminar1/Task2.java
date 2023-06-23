package seminar1;

import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у пользователя его возраст.
 * Если введенное значение не является числом, выбросите исключение NumberFormatException
 * с сообщением "Некорректный ввод". Иначе выведите возраст на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Ваш возраст: ");
        String input = sc.nextLine();
        try {
            int age = Integer.parseInt(input);
            System.out.printf("Ваш возраст = %d", age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Некорректный ввод, введите значение целыми цифрами");
        }
    }
}