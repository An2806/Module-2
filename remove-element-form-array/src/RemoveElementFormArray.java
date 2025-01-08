import java.util.Scanner;

public class RemoveElementFormArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Bước 1: Khai báo và khởi tạo mảng số nguyên N phần tử cho trước.
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int n = array.length;


        //Hiển thị mảng ban đầu .
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        //Yêu cầu người dùng nhập phần tử cần xóa
        System.out.print("Nhập phần tử cần xóa (X): ");
        int x = scanner.nextInt();

        int indexDelete = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                indexDelete = i;
                break;
            }
        }
        if (indexDelete == -1) {
            System.out.println("Phần tử " + x + "không tồn tại trong mảng.");
        } else {
            for (int i = indexDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;

            System.out.println("Mảng sau khi xóa phần tử " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

