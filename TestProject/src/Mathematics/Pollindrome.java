/**
 * 
 */
package Mathematics;

import java.util.Scanner;

/**
 * @author VikramSingh
 *
 */
public class Pollindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		
		int num = sc.nextInt();
		int on = num;
		int revers =0 ;
		while(num>0) {
			revers = revers*10 + num%10;
			num/=10;
		}

		if(on==revers)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
