package JavaCourseITAcademy.task3;

import JavaCourseITAcademy.task3.box.Box;
import JavaCourseITAcademy.task3.enums.BoxType;
import JavaCourseITAcademy.task3.utils.Utils;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Box> boxes = Utils.generateBoxes(10);
        Utils utils = new Utils();
        utils.printBoxes(boxes);

        Map<Double, Map<Double, Integer>> volumeWeightMap = utils.groupByVolumeAndWeight(boxes);
        System.out.println("\nСгрупиированные по объему и весу:");
        utils.printGroupedBoxes(volumeWeightMap);

        Map<BoxType, Integer> boxTypeCount = utils.countBoxesByType(boxes);
        System.out.println("\nКоличество коробок по типу:");
        utils.printBoxTypeCount(boxTypeCount);
    }
}
