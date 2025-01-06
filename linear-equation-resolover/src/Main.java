import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class LinearEquationResolver {
        public static void main(String[] args) {
            System.out.println("Linear Equation Resolver");
            System.out.println("Given a equation as 'a * x + b = c ', please enter constants:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.print("c: ");
            double c = scanner.nextDouble();

            if (a != 0) {
                double answer = (c -b) / a;
                System.out.printf("Equation pass with x = %f!\n", answer);
            } else {
                if ( b == c) {
                    System.out.print("The solution is all x!");
                } else {
                    System.out.print("No solution!");
                }
            }
        }
    }
}