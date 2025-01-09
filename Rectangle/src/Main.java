import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai bao bien luu kich thuoc hcn va gan gia tri.
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        //Khoi tao doi tung thuoc lop Rectangle voi phuong thuc chua 2 tham so width, height
        Rectangle rectangle = new Rectangle(width, height);

        //Goi phuong thuc cua lop Rectangle thong qua doi tuong Rectangle da tao de hien thi cac thong so hcn
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
