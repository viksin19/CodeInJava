import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(10001, "Vikram", 25, 40000));
        empList.add(new Employee(10002, "Jai", 24, 33000));
        empList.add(new Employee(10003, "Vivek", 24, 50000));
        empList.add(new Employee(10004, "Smriti", 23, 39000));
        empList.add(new Employee(10005, "Anuj", 24, 33000));
        empList.add(new Employee(10006, "Suraj", 24, 150000));

        empList.stream().forEach(emp -> {
            System.out.println(
                    "_____________________________________________________________________________________________________");
            System.out.println(emp.toString());
        });

        System.out.println("\n  Employee at index 3 :: " + empList.get(3).toString());
        System.out.println("\n  Employee at index 4 :: " + empList.get(4).toString());
        System.out.println("\n  Employee at index 1 :: " + empList.get(1).toString());

        // Subset of the arrayList
        System.out.println("\n Subset of Employe List :: ");
        empList.subList(0, 1).stream().forEach(emp -> {
            System.out.println(emp.toString());
        });

        // Sorting empList on basis of salary in decreasing order.
        empList.sort((a, b) -> {
            return b.getEmpSalary() - a.getEmpSalary();
        });
        empList.forEach(emp -> {
            System.out.println("Employee :: " + emp.getEmpName() + " || Salary :: " + emp.getEmpSalary());
        });
    }
}