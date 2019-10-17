/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab:			13	←		*/

package lab_13;
import java.util.Scanner;
public class AddMatrices {

	AddMatrices() {
	}
	
	private int[][] makeNFill2D(int rows, int cols) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[rows][cols];
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				System.out.print("Enter digit for [" + row + "][" + col + "]: " );
				arr[row][col] = sc.nextInt();
			}
		}
		return arr;
	}
	private int[][] addition(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[arr1.length][arr1[0].length];
		for(int row = 0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[0].length; col++) {
				arr[row][col] = arr1[row][col] + arr2[row][col];
			}
		}
		return arr;
	}
	private void getArray(int[][] arr) {
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				System.out.print("  " + arr[row][col]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter number of columns array will have: ");
		int cols = sc.nextInt();
		System.out.println();
		System.out.print("Enter number of rows array will have: ");
		int rows = sc.nextInt();
		System.out.println();
		AddMatrices AM = new AddMatrices();
		int[][] arr1 = AM.makeNFill2D(rows, cols);
		int[][] arr2 = AM.makeNFill2D(rows, cols);
		int[][] sum = AM.addition(arr1, arr2);
		System.out.println();
		System.out.println("Matrix A: ");
		AM.getArray(arr1);
		System.out.println();
		System.out.println("Matrix B: ");
		AM.getArray(arr2);
		System.out.println();
		System.out.println("A + B: ");
		AM.getArray(sum);
		System.out.println();
		sc.close();
	}

}
