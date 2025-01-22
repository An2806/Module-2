import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        //Tạo chuỗi con tăng dần
        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0)); //Thêm ký tự đầu tiên vài chuỗi kết quả

        //Duyệt qua từng ký tự trong chuỗi
        for (int i = 1; i < input.length(); i++) {
            ////Nếu ký tự hiện tại lớn hơn ký tự cuối cùng trong chuỗi kết quả
            if (input.charAt(i) > result.charAt(result.length() - 1)) {
                result.append(input.charAt(i)); //Them ky tu vao chuoi ket qua
            }
        }

        System.out.println("Chuỗi tăng dần là: " + result.toString());

        scanner.close();
    }
}