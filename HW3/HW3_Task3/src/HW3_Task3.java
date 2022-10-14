import java.util.Arrays;
import java.util.Scanner;

/**
 * Задано 2 масиви цілих чисел довільної довжини.
 * Написати програму, що створює третій масив, що є злиттям 2-х заданих.
 */

public class HW3_Task3 {
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
      Створення нового масиву на основі двох інших, чергуючи їх елементи.
      firstLength та secondLength відповідають за те, щоб не вийти за межи початкових масивів.
    */

    public int[] arrayMerging(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length+secondArray.length];
        int firstLength = 0, secondLength = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i % 2 == 0) {
                if (firstLength < firstArray.length) {
                    newArray[i] = firstArray[firstLength];
                    firstLength++;
                }
                else {
                    newArray[i] = secondArray[secondLength];
                    secondLength++;
                }
            }
            else {
                if (secondLength < secondArray.length) {
                    newArray[i] = secondArray[secondLength];
                    secondLength++;
                }
                else {
                    newArray[i] = firstArray[firstLength];
                    firstLength++;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        HW3_Task3 task = new HW3_Task3();

        System.out.print("Введіть кількість елементів першого масиву: ");
        int countFirst = task.getNumberFromUser();
        System.out.print("Введіть кількість елементів другого масиву: ");
        int countSecond = task.getNumberFromUser();

        int[] firstArray = task.getArrayWithRandomNumbers(countFirst);
        int[] secondArray = task.getArrayWithRandomNumbers(countSecond);
        String str = Arrays.toString(firstArray);
        System.out.println("1-й масив: " + str);
        str = Arrays.toString(secondArray);
        System.out.println("2-й масив: " + str);

        int [] thirdArray = task.arrayMerging(firstArray, secondArray);
        str = Arrays.toString(thirdArray);
        System.out.println("Результат: " + str);
    }
}