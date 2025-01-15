public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOpenrand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOpenrand + secondOperand;
            case SUBTRACTION:
                return firstOpenrand - secondOperand;
            case MULTIPLICATION :
                return firstOpenrand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOpenrand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
