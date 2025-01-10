import javax.xml.namespace.QName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        //Tạo đối tượng Student
        Student student = new Student();

        //Truy cập và thay đổi thong tin
        student.setName("Alice");
        student.setClasses("C05");

        //Hiển thị thông tin
        student.displayInfo();
    }
}