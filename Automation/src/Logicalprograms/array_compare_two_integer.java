package Logicalprograms;

import java.util.Arrays;

public class array_compare_two_integer {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30};
		int arr1[]= {20,30,40};
		int arr2 []= {10,20,30};
		
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.deepEquals(args, args));
	}

}
