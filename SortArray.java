package info.com;
import java.util.*;
public class SortArray {

	public static void main(String args[]) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {3,4,5,6};
		int[] array3 = {6,1,7,7};
		
		HashSet unique = new HashSet();
		
		int[][] arr = new int[3][];
		arr[0] = array1;
		arr[1] = array2;
		arr[2] = array3;
		
		for (int index = 0; index < arr.length; index++) {
			for (int j = 0; j < arr[index].length; j++) {
				unique.add(Integer.valueOf(arr[index][j]));
			}
		}	
		List list = new ArrayList(unique);
		 Collections.sort(list);
		 System.out.println(list);
	}
}