import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        int n = 5;

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập giá trị cần chèn (X): ");
        int x = sc.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = sc.nextInt();

        // Bước 4: Kiểm tra điều kiện hợp lệ của index
        if (index < 0 || index > n) {
            System.out.println("Không thể chèn phần tử vào vị trí này.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào vị trí index
            for (int i = n; i > index; i--) {  // Dồn các phần tử từ vị trí index trở đi sang phải
                array[i] = array[i - 1];
            }
            array[index] = x;
            n++;

            // Bước 6: In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn phần tử " + x + " tại vị trí " + index + ":");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
