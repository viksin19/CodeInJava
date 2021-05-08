import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
class Employee{
	private int empNo;
	private String empName;
	
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empNo;
		return 12340;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		
		if (empNo != other.empNo)
			return false;
		return true;
	}
	
	public static void printEmploye(Employee emp) {
			System.out.println(emp.empNo+" :: "+emp.empName);
	}
}
public class HashCodeConst {

	public static void main(String[] args) {

		List<Employee> emplList = new ArrayList<>();
		emplList.add(new Employee(1,"Vikram"));
		emplList.add(new Employee(1,"Vikram"));
		emplList.add(new Employee(3,"Jai"));
		HashSet<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(1,"Vikram"));
		empSet.add(new Employee(1,"Jai"));
		empSet.forEach(emp->{Employee.printEmploye(emp);});
		for(Employee emp:emplList)
			Employee.printEmploye(emp);
		
	}

}
