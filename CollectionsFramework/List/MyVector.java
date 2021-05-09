import java.util.Vector;

/*
A vector provides us with dynamic arrays in Java.
 Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
  This is identical to ArrayList in terms of implementation.
 However, the primary difference between a vector and an ArrayList is that a Vector is synchronized and an ArrayList is non-synchronized.
*/
public class MyVector {

    public static void main(String[] args) {

        Vector<Employee> empVector = new Vector<>();

        // Adding Employee in Vector List.
        empVector.add(new Employee(10001, "Ankit", 25, 40000));
        empVector.add(new Employee(10002, "Babbun", 24, 33000));
        empVector.add(new Employee(10003, "Uday", 24, 50000));
        empVector.add(new Employee(10004, "Sweety", 23, 39000));
        empVector.add(new Employee(10005, "Jon", 24, 33000));
        empVector.add(new Employee(10006, "Doe", 24, 150000));

        System.out.println(empVector.indexOf(new Employee(10004, "Sweety", 23, 39000)));

    }
}
