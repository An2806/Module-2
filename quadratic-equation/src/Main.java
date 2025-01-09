import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập giá trị a,b,c:
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        //Tạo đối tượng QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        //Tính delta
        double delta = equation.getDiscriminant();

        //Hiển thị kết quả
        if (delta >= 0) {
            System.out.println("The equation has two roots:");
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root:");
            System.out.println("Root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no  roots.");
        }
    }
}