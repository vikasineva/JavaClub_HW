import java.util.Arrays;
import java.util.Scanner;

/**
 * Визначити суму елементів цілочисленного масиву,
 * розташованих між мінімальними та максимальними значеннями.
 */

public class HW3_Task1 {
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

    //Пошук індексу мінімального числа масиву
    public int getMinIndex(int[] array) {
        int min = 11;
        int imin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
        }
        return imin;
    }

    //Пошук індексу максимального числа масиву
    public int getMaxIndex(int[] array) {
        int max = -11;
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
        }
        return imax;
    }

    //Пошук суми чисел між мінімальним та максимальним числами масиву
    public int getSumBetweenMinAndMax(int[] array, int imin, int imax) {
        int sum = 0;
        if (imin < imax) {
            for (int i = imin + 1; i < imax; i++) {
                sum += array[i];
            }
        }
        else if (imax < imin) {
            for (int i = imax + 1; i < imin; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        HW3_Task1 task = new HW3_Task1();

        System.out.print("Введіть кількість елементів масиву: ");
        int count = task.getNumberFromUser();

        int[] array = task.getArrayWithRandomNumbers(count);
        String str = Arrays.toString(array);
        System.out.println(str);

        int imin = task.getMinIndex(array);
        System.out.println("min index: " + imin);

        int imax = task.getMaxIndex(array);
        System.out.println("max index: " + imax);

        int sum = task.getSumBetweenMinAndMax(array, imin, imax);
        System.out.println("sum: " + sum);
    }
}