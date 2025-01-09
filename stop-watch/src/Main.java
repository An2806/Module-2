import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng 100,000 số ngẫu nhiên
        int size = 100000;
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100000);
        }

        // Tạo đối tượng StopWatch
        StopWatch stopwatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopwatch.Start();

        // Thực hiện thuật toán sắp xếp chọn (selection sort)
        selectionSort(numbers);

        // Dừng đo thời gian
        stopwatch.Stop();

        // Hiển thị thời gian thực thi
        System.out.println("Elapsed time for selection sort: " + stopwatch.GetElapsedTime() + " milliseconds");
    }

    // Thuật toán sắp xếp chọn (selection sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Tìm chỉ số của phần tử nhỏ nhất
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử hiện tại
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
