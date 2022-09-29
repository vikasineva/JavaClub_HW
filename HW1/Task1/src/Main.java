/**
 * Дано ціле число. Перевірити чи є останньою цифрою цього числа - цифра 3.
 * Перевірте коли це дійсно так, і ні.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Отримуємо від користувача ціле число, яке буде зберігатися у numberToCheck
        Scanner input = new Scanner (System.in);
        System.out.print("Введіть ціле число: ");
        int numberToCheck = input.nextInt();

        //Тернарний оператор для перевірки. Дві умови, так як ціле число може бути і додатнім, і від'ємним
        boolean isEndsWithThree = (numberToCheck % 10 == 3 || numberToCheck % 10 == -3) ? true : false;

        //Виведення відповідного результату
        if (isEndsWithThree)
            System.out.println("Цифра 3 є останньою цифрою цього числа");
        else
            System.out.println("Цифра 3 не є останньою цифрою цього числа");
    }
}