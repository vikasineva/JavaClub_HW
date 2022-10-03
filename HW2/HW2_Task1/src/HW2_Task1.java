/**
 * Напишіть програму на Java для відображення n членів непарного натурального числа та їх суми.
 * (Наприклад, якщо вибрати число 7, на екрані має бути перших 7 непарних чисел 1,3,5,7,9, 11, 13 і їх сума 49).
 * n обрати самостійно, для тих хто вміє, можна використати Scanner.
 */

import java.util.Scanner;

public class HW2_Task1 {
    public static void main(String[] args) {
        //Отримання числа n від користувача
        Scanner input = new Scanner (System.in);
        System.out.print("Введіть число n для кількості чисел ряду: ");
        int n = input.nextInt();

        //Змінна number зберігає непарне число, яке оновлюється на кожній ітерації, збільшуючись на 2
        //У змінній sum зберігається сума чисел ряду; на кожній ітерації циклу до змінної додається number
        int number = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += number;
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println("\nСума чисел цього ряду = " + sum);
    }
}