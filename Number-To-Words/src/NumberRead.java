import java.util.Scanner;

public class NumberRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        // Bước 1: Kiểm tra tính hợp lệ của số
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            System.out.println("Kết quả: " + readNumber(number));
        }
    }

    // Hàm đọc số nguyên
    public static String readNumber(int number) {
        if (number < 10) {
            return readOneDigit(number); // Bước 2: Đọc số có 1 chữ số
        } else if (number < 20) {
            return readTwoDigitsLessThan20(number); // Bước 3: Đọc số nhỏ hơn 20
        } else if (number < 100) {
            return readTwoDigitsGreaterThan20(number); // Bước 4: Đọc số từ 20 đến 99
        } else {
            return readThreeDigits(number); // Bước 5: Đọc số có 3 chữ số
        }
    }

    // Bước 2: Đọc số có 1 chữ số
    public static String readOneDigit(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Bước 3: Đọc số nhỏ hơn 20
    public static String readTwoDigitsLessThan20(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    // Bước 4: Đọc số từ 20 đến 99
    public static String readTwoDigitsGreaterThan20(int number) {
        int tens = number / 10; // Hàng chục
        int ones = number % 10; // Hàng đơn vị

        String tensText = "";
        switch (tens) {
            case 2: tensText = "twenty"; break;
            case 3: tensText = "thirty"; break;
            case 4: tensText = "forty"; break;
            case 5: tensText = "fifty"; break;
            case 6: tensText = "sixty"; break;
            case 7: tensText = "seventy"; break;
            case 8: tensText = "eighty"; break;
            case 9: tensText = "ninety"; break;
        }

        if (ones == 0) {
            return tensText;
        } else {
            return tensText + " " + readOneDigit(ones);
        }
    }

    // Bước 5: Đọc số có 3 chữ số
    public static String readThreeDigits(int number) {
        int hundreds = number / 100; // Hàng trăm
        int remainder = number % 100; // Phần còn lại

        String hundredsText = readOneDigit(hundreds) + " hundred";
        if (remainder == 0) {
            return hundredsText;
        } else {
            return hundredsText + " and " + readNumber(remainder);
        }
    }
}
