import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишіть програму, яка циклічно зсуває елементи масиву вправо на одну позицію та друкує результат.
 * Циклічність означає, що останній елемент масиву стає найпершим його елементом.
 */

public class HW3_Task2 {
    //Отримання кількості елементів масиву від користувача
    public int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    //Створення масиву, заповнення його псевдовипадковими числами
    public int[] getArrayWithRandomNumbers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 + 1)) - 10;
        }
        return array;
    }

    /*
      Зсув масиву вправо на один елемент.
      Але я не зромузіла потрібно зсунути один раз чи поки масив не повернеться до початкового вигляду,
      зробила до початкового вигляду.
      Сам зсув провожу з кінця до початку масиву, привласнюючи елементу значення наступного елементу.
      Останньому ж елементу привласнюю значення першого елементу, яке було збережено до початку нового зсуву
    */

    public void arrayShiftRight(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 1; j >= 0; j--) {
                if (j == 0) array[j] = last;
                else array[j] = array[j - 1];
            }
            String str = Arrays.toString(array);
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HW3_Task2 task = new HW3_Task2();

        System.out.print("Введіть кількість елементів масиву: ");
        int count = task.getNumberFromUser();

        int[] array = task.getArrayWithRandomNumbers(count);
        String str = Arrays.toString(array);
        System.out.println(str + "\n");

        task.arrayShiftRight(array);
    }
}