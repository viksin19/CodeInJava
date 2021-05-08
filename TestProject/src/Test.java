import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> res = new ArrayList<>();
	    int[][] arr1 = {{1,2,3},
	                   {4,5,6},
	                   {7,8,9}};
	    
	    res = calculateDiagonalSum(arr1,3);
	    System.out.println(res.get(0) == 1 && res.get(1) == 6 && res.get(2) == 15 && res.get(3) == 14 && res.get(4) == 9);
	    int[][] arr2 = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
	    res = calculateDiagonalSum(arr2,4);
	    System.out.println(res.get(0) == 1 && res.get(1) == 7 && res.get(2) == 18 && res.get(3) == 34 
	    		&& res.get(4) == 33 && res.get(5) == 27 && res.get(6) == 16);
	    
//	    Failure scenario 
	    System.out.println(res.get(0) == 10 && res.get(1) == 70 
	    		           && res.get(2) == 18 && res.get(3) == 34);
	}
	
//	Code for NXN matrix 
	private static List<Integer> calculateDiagonalSum(int[][] arr,int dimension) {
		List<Integer> list = new ArrayList<Integer>();
		int diagSumIndex = dimension*2 - 1; // from my observation size of array required is this much only
		int[] res  = new int[diagSumIndex];
		Arrays.fill(res, 0);  
		for(int i=0;i<dimension;i++) {
			for(int j=0;j<dimension;j++) {
				res[i+j]+=arr[i][j];
			}
		}
		for(int k=0;k<diagSumIndex;k++) {
			list.add(res[k]);
		}
	    return list;
	}

}
