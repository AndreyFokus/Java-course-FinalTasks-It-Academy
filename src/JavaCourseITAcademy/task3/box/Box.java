package JavaCourseITAcademy.task3.box;

import JavaCourseITAcademy.task3.enums.BoxType;

public class Box {
    private double x;
    private double y;
    private double z;
    private BoxType type;
    private double weight;

    public Box(double x, double y, double z, BoxType type, double weight) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
        this.weight = weight;
    }

    public Box() {
    }

    public double getVolume() {
        return x * y * z;
    }

    public BoxType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
