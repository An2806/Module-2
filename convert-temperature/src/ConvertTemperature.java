import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        //Sử dụng vòng lặp do/while và switch/case để hiển thị in ra menu
        do {
            System.out.println("Menu. ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                //Thực thi CT cho phép ng dùng lựa chọn 1,2,0 để kiểm tra menu
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    //Xây dựng phương thức chuyển đổi C sang độ F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    //Xây dựng phương thức chuyển đổi độ F sang độ C
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius =  (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}