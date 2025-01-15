package point;

import demo1.MovablePoint;

public class MovablePoint1 extends Ponit1 {
    private float xSpeed1 = 0.0f;
    private float ySpeed1 = 0.0f;

    public MovablePoint1(float xSpeed1, float ySpeed1) {
        this.xSpeed1 = xSpeed1;
        this.ySpeed1 = ySpeed1;
    }

    public MovablePoint1(float x, float y, float xSpeed1, float ySpeed1) {
        super();
        this.xSpeed1 = xSpeed1;
        this.ySpeed1 = ySpeed1;
    }

    public MovablePoint1() {
    }

    public float getxSpeed() {
        return xSpeed1;
    }

    public void setxSpeed(float xSpeed1) {
        this.xSpeed1 = xSpeed1;
    }

    public float getySpeed() {
        return ySpeed1;
    }

    public void setySpeed(float ySpeed1) {
        this.ySpeed1 = ySpeed1;
    }

    public void setSpeed(float xSpeed1, float ySpeed1) {
        this.xSpeed1 = xSpeed1;
        this.ySpeed1 = ySpeed1;
    }

    public float[] getSpeed() {
        float[] speed = new float[2];
        speed[0] = xSpeed1;
        speed[1] = ySpeed1;
        return speed;
    }

    public MovablePoint1 move() {
        MovablePoint1 newPoint1 = new MovablePoint1(xSpeed1, ySpeed1);
        float x1 = newPoint1.getX1() + getxSpeed();
        float y1 = newPoint1.getY1() + getySpeed();
        newPoint1.setX1(x1);
        newPoint1.setY1(y1);
        return newPoint1;
    }

    @Override
    public String toString() {
        return "MovablePoint1{" +
                "xSpeed1=" + xSpeed1 +
                ", ySpeed1=" + ySpeed1 +
                '}';
    }
}
