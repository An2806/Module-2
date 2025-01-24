public class TriangleValidation {
    // Phương thức kiểm tra tính hợp lệ của tam giác
    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác không được là số âm hoặc bằng 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
        }
    }
}