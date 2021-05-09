import java.util.LinkedList;

/*LinkedList class is an implementation of the LinkedList data structure which is a linear data structure 
where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
The elements are linked using pointers and addresses. Each element is known as a node. 
It implements List and Dequeue interfaces.*/
public class LinkedListExample {

    // Main method of LinkedListExample class.
    public static void main(String[] args) {

        LinkedList<Employee> empLinkedList = new LinkedList<>();
        // Preparing data :: Creadting LinkedList
        empLinkedList.add(new Employee(10001, "Natasha", 25, 40000));
        empLinkedList.add(new Employee(10002, "Sam", 24, 33000));
        empLinkedList.add(new Employee(10003, "Steve", 24, 50000));
        empLinkedList.add(new Employee(10004, "Tony", 23, 39000));
        empLinkedList.add(new Employee(10005, "Banner", 24, 33000));
        empLinkedList.add(new Employee(10006, "Thor", 24, 150000));

        // getting First Node
        System.out.println(empLinkedList.getFirst().toString());
        // getting last Node
        System.out.println(empLinkedList.getLast().toString());

        // getting head element of the list and it will not remove element
        System.out.println(empLinkedList.peek().toString());

        System.out.println("\nSize befor poll() :: " + empLinkedList.size());
        // getting head element and it will remove the first element
        System.out.println(empLinkedList.poll().toString()); // return first Item and remove it from the list
        System.out.println(empLinkedList.pollLast().toString()); // returns last node and remove it from the list.
        System.out.println("Size after poll() :: " + empLinkedList.size() + "\n");

        // returns node using index
        System.out.println(empLinkedList.get(2));

        empLinkedList.addFirst(new Employee(10001, "Natasha", 25, 40000));// Insert node at the starting
        empLinkedList.addLast(new Employee(10006, "Thor", 24, 150000));// Insert Node in the last

        System.out.println(empLinkedList.remove(2).toString()); // removes and return the object at specified Index

    }
}
