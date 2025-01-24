import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào 3 cạnh của tam giác
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập cạnh thứ hai: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập cạnh thứ ba: ");
            double c = scanner.nextDouble();

            // Kiểm tra tam giác bằng phương thức validateTriangle
            TriangleValidation.validateTriangle(a, b, c);
            System.out.println("Ba cạnh nhập vào tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            // Bắt ngoại lệ IllegalTriangleException
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            // Bắt các ngoại lệ khác (nếu có)
            System.out.println("Lỗi không mong muốn: " + e.getMessage());
        } finally {
            // Đóng scanner và kết thúc chương trình
            scanner.close();
            System.out.println("Kết thúc chương trình.");
        }
    }
}