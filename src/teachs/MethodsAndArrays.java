package teachs;
import java.util.Scanner;

public class MethodsAndArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print(add(5 , 7));
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int[] intArray2 = new int[intArray.length];
		for (int i = 0; i < intArray2.length; i++) {
			intArray2[i] = sc.nextInt();
		}
		printArray(intArray2);
		sc.close();
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;

		return sum;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}
}
