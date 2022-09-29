/**
 * Напишіть програму для розв’язування квадратних рівнянь (використовуйте if, else if та else).
 * Коефіцієнти a, b, c можна взяти довільні.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Отримуємо від користувача коефіцієнти a, b, c
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть коефіцієнт а: ");
        double coefficientA = input.nextDouble();
        System.out.print("Введіть коефіцієнт b: ");
        double coefficientB = input.nextDouble();
        System.out.print("Введіть коефіцієнт c: ");
        double coefficientC = input.nextDouble();

        //Знаходимо детермінант
        double determinant = (coefficientB * coefficientB) - (4 * coefficientA * coefficientC);

        //Отримуємо корені рівняння по відповідним формулам, залежно від значення детермінанту.
        //Якщо детермінант більше нуля, то буде два корені. Дорівнює нулю - один корінь. Менше нуля - немає коренів.
        double firstRoot, secondRoot;
        if (determinant > 0) {
            firstRoot = (-coefficientB + Math.sqrt(determinant)) / (2 * coefficientA);
            secondRoot = (-coefficientB - Math.sqrt(determinant)) / (2 * coefficientA);
            System.out.println("Рівняння має два корені: х1 = " + firstRoot + ", х2 = " + secondRoot);
        }
        else if (determinant == 0) {
            System.out.println("Рівняння має один корінь: х = " + ((-coefficientB + Math.sqrt(determinant)) / (2 * coefficientA)));
        }
        else System.out.println("Рівняння немає коренів");
    }
}