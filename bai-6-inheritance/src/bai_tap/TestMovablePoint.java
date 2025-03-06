package bai_tap;

public class TestMovablePoint {
    public static void main(String[] args) {
        // Kiểm thử lớp Point
        Point p1 = new Point(3.5f, 4.5f);
        System.out.println("Point: " + p1); // Gọi toString()

        // Kiểm thử lớp MovablePoint
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("MovablePoint (trước khi di chuyển): " + mp1);

        // Gọi phương thức move()
        mp1.move();
        System.out.println("MovablePoint (sau khi di chuyển): " + mp1);

        // Thay đổi vận tốc và di chuyển tiếp
        mp1.setSpeed(2.0f, 3.0f);
        mp1.move();
        System.out.println("MovablePoint (sau khi thay đổi vận tốc và di chuyển): " + mp1);
    }
}
