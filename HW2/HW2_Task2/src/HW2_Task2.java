/**
 * Напишіть програму на Java для відображення всіх кратних 3 в діапазоні від 10 до 50.
 */

public class HW2_Task2 {
    public static void main(String[] args) {
        //Цикл проходить усі числа від 10 до 50 включно
        //Якщо залишок числа від ділення на 3 дорівнює нулю, то воно кратне 3 та буде виведено у консоль
        for (int i = 10; i <= 50; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}