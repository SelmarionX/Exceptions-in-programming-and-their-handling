package seminar3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию
 * возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление на ноль,
 * необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
 * Важно! С использованием принципа одного уровня абстракции!
 * *В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
 * выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль)
 * и отрицательная степень, выбрасывается исключение InvalidInputException.
 * <p>
 * В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower()
 * и выводим результат. Если введены некорректные числа или происходит ошибка ввода,
 * соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.
 * <p>
 * Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException,
 * чтобы явно указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**
 */
public class task1 {

    public static double inputNum() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static double calculatePower(double num1, double num2) throws InvalidInputException {
        if (num1 == 0) throw new InvalidInputException("Число не должно быть равно нулю !");
        if (num2 < 0) throw new InvalidInputException("Степень не может быть отрицательной !");
        return Math.pow(num1, num2);
    }


    public static void main(String[] args) {
        try {
            System.out.print("Введите число: ");
            double num1 = inputNum();
            System.out.print("Введите степень: ");
            double num2 = inputNum();
            double result = calculatePower(num1, num2);
            System.out.printf("%.1f в степени %.1f = %.1f", num1, num2, result);
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод !");
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}