/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
public class Volkswagen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "a1b2c3";
		String[] tokens = test.split("\\d");
		for(String s:tokens)
			System.out.println(s+" : ");
		
		int arr[] = new int[10];
		int i=5,j=5;
		arr[i++] = ++i + i++;
		System.out.println(arr[5]+" :: "+ ++j+" : "+j++);
		
		Character ch = new Character('A');
		System.out.println(ch+" \t"+(int)ch);
		
        float f = 1.00f/0.00f;
        System.out.println(f);
	}

}
