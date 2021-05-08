/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
public class DigitCombination {

	static boolean isPrime(int num1,int num2) {
		boolean isNotFirst = false;
		
		for(int i=2;i<num1;i++) {
			if(num1%i==0) {
				isNotFirst = true;
				break;
			}
		}
		
		if(!isNotFirst)
			return true;
		
		for(int j=2;j<num2;j++) {
			if(num2%j==0)
				return false;
		}
		
		return true;
	}
	static void checkPrime(int num) {
		int last = num%10;
		
		while(num>=10)
			num = num/10;
		
		int first = num;
		int num1 = first*10 + last;
		int num2 = last*10 + first;
		System.out.println(isPrime(num1, num2));
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {30,13,66,231};
		
		for(int num:arr) 
			checkPrime(num);
		
		
	}

}
