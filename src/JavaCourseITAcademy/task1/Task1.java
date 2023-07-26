package JavaCourseITAcademy.task1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        int y = random.nextInt();
        int z = random.nextInt();

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);

        if (x > z) {
            System.out.println("X больше Z, сумма X и Y: " + x + y);
        } else {
            System.out.println("X не больше Z, значение Z: " + z);
        }

        double average = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое: " + average);
    }
}
