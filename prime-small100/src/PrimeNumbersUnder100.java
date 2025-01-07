public class PrimeNumbersUnder100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        // Bước 2: Duyệt các số từ 2 đến 100
        for (int num = 2; num < 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Bước 1: Hàm kiểm tra một số có phải là số nguyên tố hay không
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

