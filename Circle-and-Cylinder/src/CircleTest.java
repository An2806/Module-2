public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(2.5, "blue");
        System.out.println(circle2);

        circle2.setRadius(3.0);
        circle2.setColor("green");
        System.out.println("Updated Circle: " + circle2);
    }
}
