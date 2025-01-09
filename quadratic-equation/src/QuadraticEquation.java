public class QuadraticEquation {

    //thuộc tính private
    private double a;
    private double b;
    private double c;

    // contructors 3 tham số để khởi tạo các giá trị cho a,b và c.
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Phương thức gettter cho a,b và c.
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //Tính delta.
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    //Tính nghiệm 1
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }

    //Tinh nghiệm 2
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }
}