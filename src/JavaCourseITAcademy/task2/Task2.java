package JavaCourseITAcademy.task2;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(600) - 300;
        }

        int mostCommonNumber = 0;
        int mostCommonNumberCount = 0;
        for (int number : array) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    count++;
                }
            }
            if (count > mostCommonNumberCount) {
                mostCommonNumber = number;
                mostCommonNumberCount = count;
            }
        }
        System.out.println("Массив случайных чисел:");
        printArray(array);
        System.out.println("Число, которое встречается в массиве чаще всего: " + mostCommonNumber + "\nОно встречается: " + mostCommonNumberCount + " раз");
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
