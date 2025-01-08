import java.util.Scanner;  // Nhập thư viện Scanner để sử dụng cho việc nhập liệu từ bàn phím

public class StudentArray {  // Khai báo lớp StudentArray
    public static void main(String[] args) {  // Phương thức main, điểm bắt đầu của chương trình

        // Khai báo mảng chứa danh sách tên các sinh viên
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor"};

        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // In ra yêu cầu người dùng nhập tên sinh viên
        System.out.print("Enter a name's student: ");

        // Đọc tên sinh viên nhập vào từ bàn phím và lưu vào biến input_name
        String input_name = scanner.nextLine();

        // Khai báo biến logic isExist để kiểm tra xem sinh viên có trong danh sách không
        boolean isExist = false;

        // Vòng lặp duyệt qua tất cả các sinh viên trong mảng students
        for (int i = 0; i < students.length; i++) {  // Duyệt qua tất cả các phần tử của mảng
            // Kiểm tra nếu tên nhập vào khớp với tên sinh viên tại vị trí i trong mảng
            if (input_name.equals(students[i])) {
                // Nếu tìm thấy sinh viên, in ra vị trí của sinh viên trong mảng
                System.out.println("Position of the student in the list " + input_name + " is: " + i);

                // Gán isExist thành true vì đã tìm thấy sinh viên
                isExist = true;

                // Dừng vòng lặp vì đã tìm thấy sinh viên
                break;
            }
        }

        // Nếu sau vòng lặp mà isExist vẫn là false, nghĩa là không tìm thấy sinh viên
        if (!isExist) {
            // In ra thông báo không tìm thấy sinh viên trong mảng
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}
