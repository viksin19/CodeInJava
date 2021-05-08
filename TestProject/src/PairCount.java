import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
public class PairCount {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	private static void usingArrayList(int[] arr) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int index = list.indexOf(arr[i]);
			if(index!=-1) {
				count++;
				list.remove(index);
			}else {
				list.add(arr[i]);
			}
		}
		System.out.println("ArrayList count :: "+count);
	}
	public static void main(String[] args) {
		int arr[] = {1,4,4,2,3,2,7,6,9,6};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.put(arr[i], 1)!=null) {
				int val = map.get(arr[i]) +1;
				map.put(arr[i], val);
			}
		}
		System.out.println(map.get(100));
		int count  = 0 ;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			//System.out.println(entry.getKey()+" :: "+ entry.getValue());
		    count+=entry.getValue()/2;
		}

		System.out.println("Total Count :: "+count);
		usingArrayList(arr);
		
		SimpleDateFormat sDf = new SimpleDateFormat("dd-MMM-yyyy");
		String str = "2021-01-20 14:19:56";
		System.out.println(sDf.format(Date.valueOf(str.split(" ")[0])));
	}

}
