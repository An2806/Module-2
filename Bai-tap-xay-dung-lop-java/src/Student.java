public class Student {
    private String name = "John";
    private String classes = "C02";

    //Tạo hàm ko tham có tham số
    public Student() {}

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Classes: " + classes);
    }
}
