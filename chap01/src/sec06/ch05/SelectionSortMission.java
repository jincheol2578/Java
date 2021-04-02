package sec06.ch05;

import java.util.Arrays;

public class SelectionSortMission {
	public static void main(String[] args) {
		int[] arr = {8,7,3,1,6,0};
		
		for (int i = 0; i< arr.length-1; i++ ) {
			
			for( int z = i+1; z <arr.length; z++) {
				int temp = 0;
				if (arr[i] > arr[z]) {
					temp = arr[z];
				}
				arr[z] = arr[i];
				arr[i] = temp;
			
				System.out.println(Arrays.toString(arr));
//				TOTO : 다시하기
			}
		}
	}
}
