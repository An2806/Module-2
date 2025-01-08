import java.util.Scanner;

public class RemoveELementFormArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = {10, 4, 6, 7, 8, 6, 0, 0,0};
        int n = array.length;

        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập phần tử cần xóa (X): ");
        int x = sc.nextInt();

        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Phần tử " + x+ "không tồn tại trong mảng.");
        } else {
            for (int i = index_del; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;

            System.out.println("Mảng sau khi xóa phần tử " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

