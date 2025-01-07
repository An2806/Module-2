import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(scanner);
                    break;
                case 2:
                    printSquareTriangle(scanner);
                    break;
                case 3:
                    printIsoscelesTriangle(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Enter to continue...");
            scanner.nextLine();
            scanner.nextLine();
        } while (true);
    }

    public static void printRectangle(Scanner scanner) {
        System.out.print("Enter width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter height of the rectangle: ");
        int height = scanner.nextInt();

        for (int i = 0; i < width ; i++) {
            for (int j = 0; j <height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(Scanner scanner) {
        System.out.println("Choose triangle orientation:");
        System.out.println("1. Bottom-left");
        System.out.println("2. Bottom-right");
        System.out.println("3. Top-left");
        System.out.println("4. Top-right");
        System.out.print("Your choice: ");
        int orientation = scanner.nextInt();

        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();

        switch (orientation) {
            case 1: // Bottom-left
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2: // Bottom-right
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3: // Top-left
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 4: // Top-right
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

    }

    public static void printIsoscelesTriangle(Scanner scanner) {
        System.out.print("Enter the height of the isosceles triangle: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


