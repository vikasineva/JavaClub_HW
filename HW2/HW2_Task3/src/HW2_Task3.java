/**
 * Напишіть програму для перевірки, чи є дане ціле число простим чи ні
 */

import java.util.Scanner;

public class HW2_Task3 {
    public static void main(String[] args) {
        //Отримання числа від користувача
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть ціле число для перевірки: ");
        int number = input.nextInt();

        //Виклик основного методу та виведення результату в консоль
        HW2_Task3 solution = new HW2_Task3();
        if (solution.isPrimeNumber(number)) System.out.println(number + " є простим числом");
        else System.out.println(number + " не є простим числом");
    }

    //Метод перевірки чи є число
    public boolean isPrimeNumber(int number) {
        //Просте число повинно бути більше 1, тобто не менше 2
        if (number < 2)
            return false;

        //Просте число повинно ділитися лише на себе (і на одиницю, але це підходить усім числам)
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }

        //Усі перевірки для простого числа пройдені, значить воно є простим
        return true;
    }
}