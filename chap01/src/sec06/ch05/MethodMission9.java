package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45 };
		String result = toString(arr);
		System.out.println(result);
	}

	public static String toString(int[] arr) {
		String a = "" + arr[0];
		for (int i = 1; i < arr.length; i++) {
				a += ", " + arr[i]; 
		}
		return "["+a+"]";
	}

}
