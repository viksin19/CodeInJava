import java.util.ArrayList;
import java.util.List;

/* ArrayList provides us with dynamic arrays in Java. 
   Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
   The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. 
   Java ArrayList allows us to randomly access the list. 
   ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases. */

public class ArrayListExample {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        // Adding Employees in empList
        empList.add(new Employee(10001, "Ankit", 25, 40000));
        empList.add(new Employee(10002, "Babbun", 24, 33000));
        empList.add(new Employee(10003, "Uday", 24, 50000));
        empList.add(new Employee(10004, "Sweety", 23, 39000));
        empList.add(new Employee(10005, "Jon", 24, 33000));
        empList.add(new Employee(10006, "Doe", 24, 150000));

        // Iterating over lIst using Stream().
        empList.stream().forEach(emp -> {
            System.out.println(
                    "_____________________________________________________________________________________________________");
            System.out.println(emp.toString());
        });

        // Getting Employee From empList using Index ( object.get(Index))
        System.out.println("\n  Employee at index 3 :: " + empList.get(3).toString());
        System.out.println("\n  Employee at index 4 :: " + empList.get(4).toString());
        System.out.println("\n  Employee at index 1 :: " + empList.get(1).toString());

        // Subset of the arrayList subList(startIndex,LastIndex); LastIndex is exlusive
        System.out.println("\n Subset of Employe List :: ");
        empList.subList(0, 1).stream().forEach(emp -> {
            System.out.println(emp.toString());
        });

        // Sorting empList on basis of salary in decreasing order using comparator.
        empList.sort((a, b) -> {
            return b.getEmpSalary() - a.getEmpSalary();
        });
        // Iterating using forEach to display employees after Sorting.
        empList.forEach(emp -> {
            System.out.println("Employee :: " + emp.getEmpName() + " || Salary :: " + emp.getEmpSalary());
        });

        // Adding from one list to other list
        List<Employee> tempList = new ArrayList<>();
        tempList.addAll(empList);

        tempList.remove(2); // Removing Employee from empList using index;
        tempList.remove(new Employee(10001, "Vikram", 25, 40000)); // Removing Employee Using
        tempList.removeIf(emp -> {
            return emp.getEmpSalary() == 33000;
        }); // Remove based on predicate

        System.out.println("After removing elements from TempList :: ");
        tempList.forEach(emp -> {
            System.out.println(emp.toString());
        });

    }
}