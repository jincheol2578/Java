package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = {8, 7, 3, 1 ,6,0,4,5,9};
		int temp;
		for(int i = 0; i<arr.length; i++) {
			for(int z = 0; z<arr.length-1; z++) {
				if (arr[z] > arr[z+1]) {
					temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				} else {
					continue;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
