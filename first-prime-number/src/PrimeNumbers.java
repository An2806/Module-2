import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng số nguyên tố cần in ra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khởi tạo biến count để đếm số lượng số nguyên tố đã tìm được
        int count = 0;

        // Bước 3: Khởi tạo biến N bắt đầu từ 2
        int N = 2;

        // Bước 4: Tìm và in ra số nguyên tố
        System.out.println(numbers + " số nguyên tố đầu tiên là:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    // Hàm kiểm tra một số có phải là số nguyên tố hay không
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
