package thuc_hanh;

public class Rectangle extends Shape {
    private double length= 1.0;
    private double width= 1.0;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "
                + getWidth()
                + " and length= "
                + getLength()
                + " Which is a subclass of "
                + super.toString();
    }
}
