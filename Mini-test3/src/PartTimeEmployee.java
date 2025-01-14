public class PartTimeEmployee extends Employee {
    private int workHour;

    public PartTimeEmployee(int employeeCode, String fullName, int age, String phoneNumber, String email, int workHour) {
        super(employeeCode, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + workHour * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + ", workHour=" + workHour;
    }
}
