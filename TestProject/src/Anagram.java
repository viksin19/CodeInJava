import java.util.Arrays;

/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public String sortString(String str) {
		
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		
		return new String(temp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram ag = new Anagram();
		String str1 = "Vikram";
		String str2 = "Ramvik";
		
		str1 = ag.sortString(str1.toLowerCase());
		str2 = ag.sortString(str2.toLowerCase());
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("String "+str1+" and String "+str2+" is Anagram.");
		else
			System.out.println("String "+str1+" and String "+str2+" is not Anagram.");
		

	}

}
