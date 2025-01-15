package point;

public class Ponit1 {
    private float x1 = 0.0f;
    private float y1 = 0.0f;

    public Ponit1(float x1, float y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public Ponit1() {
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public void setXY(float x, float y) {
        this.x1 = x;
    }

    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = x1;
        xy[1] = y1;
        return xy;
    }

    @Override
    public String toString() {
        return "(" + x1 + ", " + y1 + ")";
    }
}
