//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestCircle {
    public static void main(String[] args) {
        //Tạo đối tượng Circle ko tham số
        Circle circle1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        //Tạo đối Circle có bánh kính tùy chỉnh
        Circle circle2 = new Circle();
        System.out.println("Circle 2: ");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}