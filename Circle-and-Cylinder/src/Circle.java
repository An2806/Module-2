public class Circle {
    private double radius;
    private String color;

    //Contructor ko tham so
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //Contructor co tham so
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", area=" + getArea() + '}';
    }
}