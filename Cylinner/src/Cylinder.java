package l4;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}
