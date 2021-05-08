/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
class Parent{
	void method1() {
		System.out.println("Parent method 1 ::");
	}
}
class Child extends Parent{
	@Override
	void method1() {
		System.out.println("Child method 1 ::");
	}
	
	void method2() {
		System.out.println("Child method 2 ::");
	}
}
public class InheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Parent pr = new Child();
		pr.method1();
		Child ch = new Child();
		ch.method2();
		

	}

}
