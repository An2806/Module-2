import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to change: ");
        int rate = sc.nextInt();
        System.out.println("Enter dollars:");
        int USD = sc.nextInt();git
        int VND = rate * USD;
        System.out.println("USD: " + USD + " VND: " + VND);
    }
}
