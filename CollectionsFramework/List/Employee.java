public class Employee {

    private int empNumber;
    private String empName;
    private int empAge;
    private int empSalary;

    public Employee(int empNumber, String empName, int empAge, int empSalary) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public int getEmpNumber() {
        return this.empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return this.empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "|" + " Employee Number='" + getEmpNumber() + " || " + ",Employee Name='" + getEmpName() + " || "
                + ",Employee Age='" + getEmpAge() + " || " + ",Employee Salary='" + getEmpSalary() + " " + "|";
    }

}
