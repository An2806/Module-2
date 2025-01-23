public class InsertionSortExample {
    // Phương thức sắp xếp chèn
    public static void insertionSort(int[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int key = list[i]; // Lấy phần tử cần chèn
            int j = i - 1;

            // Dịch chuyển các phần tử lớn hơn key sang bên phải
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào vị trí đúng
            list[j + 1] = key;
        }
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        int[] list = {7, 3, 5, 2, 8, 1};

        System.out.println("Mảng ban đầu:");
        printArray(list);

        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(list);
    }

    // Phương thức in mảng
    public static void printArray(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
