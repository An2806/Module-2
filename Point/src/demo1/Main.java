package demo1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(2, 4);
        System.out.println(point1);
        MovablePoint point2 = point1.move();
        System.out.println(point2);

    }
}