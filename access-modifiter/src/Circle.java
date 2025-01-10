public class Circle {
    //Thuộc tính private
    private double radius = 1.0;
    private String color = "red";

    //Hàm tạo ko tham số
    public Circle() {}

    //Hàm tạo có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    //Phương thức getRadius
    public double getRadius() {
        return radius;
    }

    //Phương thức getArea
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
