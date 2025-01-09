public class Fan {
    //Hằng số
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //Thuộc tính
    private int speed = SLOW;
    private boolean on = false;
    public double radius = 5.0;
    private  String color = "blue";

    //Phương thức khởi tạo mặc định
    public Fan() {}

    //Getter và Setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức toString


    @Override
    public String toString() {
        if (on) {
            return "Fan is on, speed: " + speed + ", radius: " + radius + ", color: " + color;
        } else {
            return "Fan is off, color: " + color + ", speed: " + speed + ", radius: " + radius;
        }
    }
}
