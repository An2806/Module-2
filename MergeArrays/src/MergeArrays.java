import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        System.out.print("Nhập số phần tử của mảng thứ nhất: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.print("Nhập số phần tử của mảng thứ hai: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        // Bước 2: Sử dụng vòng lặp để nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập các phần tử của mảng thứ nhất:");
        for (int i = 0; i < n1; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt(); // Nhập giá trị từng phần tử của mảng thứ nhất
        }

        System.out.println("Nhập các phần tử của mảng thứ hai:");
        for (int i = 0; i < n2; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt(); // Nhập giá trị từng phần tử của mảng thứ hai
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[n1 + n2];

        // Bước 4: Sử dụng vòng lặp để gán các phần tử của mảng 1 vào mảng 3
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i]; // Gán phần tử từ mảng 1 vào mảng 3
        }

        // Bước 5: Sử dụng vòng lặp để gán các phần tử của mảng 2 vào mảng 3
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i]; // Gán phần tử từ mảng 2 vào vị trí tiếp theo của mảng 3
        }

        // Hiển thị mảng thứ 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }
}
