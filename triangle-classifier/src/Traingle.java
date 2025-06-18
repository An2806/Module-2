public class Triangle {

    public static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "không phải là tam giác";
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            return "không phải là tam giác";
        }
        if (a == b && b == c) {
            return "tam giác đều";
        }
        if (a == b || b == c || c == a) {
            return "tam giác cân";
        }
        return "tam giác thường";
    }
}
