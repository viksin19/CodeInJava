/**
 * 
 */
package Array;

/**
 * @author VikramSingh
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long fact = 1L;
		long num = 14L;
		
		while(num>1) {
			fact*=num;
			num-=1;
		}
		System.out.println(fact);			

	}

}
