public class Rectangle {
    double width, height;

    public Rectangle() {
    }
    //Khai báo các thuộc tính (properties) định nghĩa các phương thức khởi tạo (contructors)
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Phương thức tính diện tích
    public double getArea() {
        return this.width * this.height;
    }

    //Phương thức tính chu vi
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    //Phương thức hiển thị
    public String display() {
        return "Rectangle{"  + "width=" + width + ", height=" + height + "}";
    }
}
