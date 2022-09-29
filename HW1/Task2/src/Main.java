/**
 * Дано ціле число в межах до 10, введене користувачем з консолі
 * (для тих хто знає роботу зі Scanner, можете додати ввод цього числа).
 * Це число - сума грошей в гривнях. Виведіть це число, додавши до нього
 * слово «гривня» у потрібному відмінку («гривня», «гривні», «гривень»).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Отримуємо від користувача ціле число у діапазоні від 0 до 10 включно,
        //яке буде зберігатися у amountOfMoney
        Scanner input = new Scanner (System.in);
        System.out.print("Введіть ціле число від 0 до 10: ");
        int amountOfMoney;
        while (true) {
            amountOfMoney = input.nextInt();
            if(!(amountOfMoney <= 10 && amountOfMoney >= 0)) {
                System.out.println("Введене число за межами діапазону!");
                System.out.print("Ще раз введіть ціле число від 0 до 10: ");
            }
            else break;
        }

        //У hryvnia запишеться слово "гривня" у потрібному відмінку
        String hryvnia;
        if (amountOfMoney == 1)
            hryvnia = " гривня";
        else if (amountOfMoney == 2 || amountOfMoney == 3 || amountOfMoney == 4)
            hryvnia = " гривні";
        else
            hryvnia = " гривень";

        //Виведення суми гривень зі словом "гривня" у потрібному відмінку
        System.out.println("Сума = " + amountOfMoney + hryvnia);
    }
}