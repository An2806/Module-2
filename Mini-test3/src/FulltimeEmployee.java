public class FulltimeEmployee extends Employee {
    private double salary;
    private double bonus;
    private double penalty;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int employeeCode, String fullName, int age, String phoneNumber, String email, double salary, double bonus, double penalty) {
        super(employeeCode, fullName, age, phoneNumber, email);
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    @Override
    public double calculateSalary() {
        return salary + (bonus - penalty);
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + ", bonus: " + bonus;
    }

}
