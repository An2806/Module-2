public class TestCylinder {
    public static void main(String[] args) {
        //Tao đối tượng mặc định
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        //tạo đối tượng có tham số
        Cylinder cylinder2 = new Cylinder(2.5, "yellow", 5.0);
        System.out.println(cylinder2);

        //Thay đổi bán kính, màu sắc và chiều cao
        cylinder2.setRadius(3.0);
        cylinder2.setColor("purple");
        cylinder2.setHeight(5.0);
        System.out.println(cylinder2);
    }
}
