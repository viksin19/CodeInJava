/**
 * 
 */
package Array;

import java.sql.Date;

/**
 * @author VikramSingh
 *
 */
public class MaxMinFromArray {

	private static int getMaxLoop(int arr[],int n) {
		int res = arr[0];
		for(int i =1;i<n;i++)
			res = Math.max(res, arr[i]);
		return res;
	}
	private static int getMinLoop(int arr[],int n) {
		int res = arr[0];
		for(int i =1;i<n;i++)
			res = Math.min(res, arr[i]);
		return res;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,1112,4,55,66,77,89,4,53,667,8,0};
		int len = array.length;
		
		System.out.println("Through loop");
		long startTime = System.nanoTime();
		System.out.println("Maximum :: "+getMaxLoop(array,len));
		System.out.println("Time taken ::"+(System.nanoTime()-startTime)+" Nano second");
		
		startTime = System.nanoTime();
		System.out.println("Maximum :: "+getMinLoop(array,len));
		System.out.println("Time taken ::"+(System.nanoTime()-startTime)+" Nano second");
		startTime = System.currentTimeMillis() - 2592000000L;
		Date date = new Date(startTime);
		System.out.println(date.before((new Date(System.currentTimeMillis()))));
	
		
      
	}

}
