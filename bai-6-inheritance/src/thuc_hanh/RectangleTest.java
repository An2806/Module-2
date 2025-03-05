package thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.8,2.3);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange",true,3.8, 2.5);
        System.out.println(rectangle);
    }
}
