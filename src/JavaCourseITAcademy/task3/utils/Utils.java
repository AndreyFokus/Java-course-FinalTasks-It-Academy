package JavaCourseITAcademy.task3.utils;

import JavaCourseITAcademy.task3.enums.BoxType;
import JavaCourseITAcademy.task3.box.Box;

import java.util.*;

public class Utils {
    public static List<Box> generateBoxes(int numBoxes) {
        List<Box> boxes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numBoxes; i++) {
            double x = 1 + random.nextDouble() * 9;
            double y = 1 + random.nextDouble() * 9;
            double z = 1 + random.nextDouble() * 9;
            BoxType type = BoxType.values()[random.nextInt(BoxType.values().length)];
            double weight = 1 + random.nextDouble() * 19;

            boxes.add(new Box(x, y, z, type, weight));
        }

        return boxes;
    }

    public static void printBoxes(List<Box> boxes) {
        System.out.println("Сгеннрированные коробки: ");
        for (Box box : boxes) {
            System.out.println(box.getType() + ": (x=" + box.getX() + ", y=" + box.getY() + ", z=" + box.getZ() +
                    ", weight=" + box.getWeight() + ")");
        }
    }

    public static Map<Double, Map<Double, Integer>> groupByVolumeAndWeight(List<Box> boxes) {
        Map<Double, Map<Double, Integer>> volumeWeightMap = new HashMap<>();

        for (Box box : boxes) {
            double volume = box.getVolume();
            double weight = box.getWeight();

            volumeWeightMap.computeIfAbsent(volume, k -> new HashMap<>());
            Map<Double, Integer> weightMap = volumeWeightMap.get(volume);
            weightMap.put(weight, weightMap.getOrDefault(weight, 0) + 1);
        }

        return volumeWeightMap;
    }

    public static void printGroupedBoxes(Map<Double, Map<Double, Integer>> volumeWeightMap) {
        for (Map.Entry<Double, Map<Double, Integer>> entry : volumeWeightMap.entrySet()) {
            double volume = entry.getKey();
            Map<Double, Integer> weightMap = entry.getValue();

            for (Map.Entry<Double, Integer> weightEntry : weightMap.entrySet()) {
                double weight = weightEntry.getKey();
                int count = weightEntry.getValue();

                System.out.println("Volume: " + volume + ", Weight: " + weight + ", Count: " + count);
            }
        }
    }

    public static Map<BoxType, Integer> countBoxesByType(List<Box> boxes) {
        Map<BoxType, Integer> boxTypeCount = new HashMap<>();

        for (Box box : boxes) {
            BoxType type = box.getType();
            boxTypeCount.put(type, boxTypeCount.getOrDefault(type, 0) + 1);
        }

        return boxTypeCount;
    }

    public static void printBoxTypeCount(Map<BoxType, Integer> boxTypeCount) {
        for (Map.Entry<BoxType, Integer> entry : boxTypeCount.entrySet()) {
            BoxType type = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(type + ": " + count + " boxes");
            } else {
                System.out.println(type + ": " + count + " box");
            }
        }
    }
}