package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
//		String[] arr = new String[5];
//		//2. print the third element in the array
//		System.out.println(arr[2]);
//		//3. set the third element to a different value
//		arr[2]="new";
//		//4. print the third element again
//		System.out.println(arr[2]);
//		//5. use a for loop to print all the values in the array
//		//   BE SURE TO USE THE ARRAY'S length VARIABLE
//		for (int i = 0; i < 5; i++) {
//			System.out.println(arr[i]);
//		}
		
		//6. make an array of 50 integers
		int[] ar = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < ar.length; i++) {
			Random r = new Random();
			int something = r.nextInt(50);
			ar[i]=something;
		}
		//8. without printing the entire array, print only the smallest number in the array

		int x = 100;
	
		for (int i = 0; i < ar.length; i++) {
			
			if (x>ar[i]) {
				x=ar[i];
			}
			
		}
	System.out.println(x);
		//9 print the entire array to see if step 8 was correct
	for (int j = 0; j < ar.length; j++) {

		System.out.println(ar[j]);
	}
		//10. print the largest number in the array.
	int g = 0;
	
	for (int i = 0; i < ar.length; i++) {
		
		if (g<ar[i]) {
			g=ar[i];
		}
		
	}
	System.out.println(g);
	}
}
