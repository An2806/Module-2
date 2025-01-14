public abstract class Employee {
    private int employeeCode;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(int employeeCode, String fullName, int age, String phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public double calculateSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "EmployeeCode: " + employeeCode + ", FullName: " + fullName + ", Age: " + age + ", PhoneNumber: " + phoneNumber + ", Email: " + email;
    }
}
