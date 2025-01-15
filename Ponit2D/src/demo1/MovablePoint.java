package demo1;

public class MovablePoint extends Point {
   private  float xSpeed = 0.0f;
   private  float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
//        System.out.println("demo1.MovablePoint1");
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        MovablePoint newPoint = new MovablePoint(xSpeed, ySpeed);
       float x = newPoint.getX() + getxSpeed();
       float y = newPoint.getY() + getySpeed();
       newPoint.setX(x);
       newPoint.setY(y);
       return newPoint;

    }

    @Override
    public String toString() {
        return "demo1.MovablePoint1{" +
                this.getX() + ", " +
                this.getY() + ", "
                + this.getxSpeed() +
                ", " + this.getySpeed() + "}";

    }
}
