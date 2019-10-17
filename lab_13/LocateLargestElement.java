/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab:			13	←		*/

package lab_13;
import java.util.Scanner;
public class LocateLargestElement {
	
	
	LocateLargestElement() {	
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
		sc.close();
		return arr;
	}
	private int order2D(int[][] arr) {
		int[][] arrLargest = new int[arr.length][arr[0].length];
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				if(arr[row][col] > arrLargest[0][0]) {
					arrLargest[0][0] = arr[row][col];
				}
			}
		}
		return arrLargest[0][0];
	}
	private int[] locateLargest(int[][] original2D, int arrLargest) {
		int[] location = new int[2];
		OUTER_LOOP:
			for(int row = 0; row < original2D.length; row++) {
				for(int col = 0; col < original2D[0].length; col++) {
					if(original2D[row][col] == arrLargest) {
						location[0] = row;
						location[1] = col;
						break OUTER_LOOP;
					}
				}
			}
		return location;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(); 	
		System.out.print("Enter number of columns in array: ");
		int cols = sc.nextInt();
		System.out.print("Enter the number of rows in array: ");
		int rows = sc.nextInt();
		System.out.println();
		LocateLargestElement LLE = new LocateLargestElement();
		int [][] original = LLE.makeNFill2D(rows, cols);
		int[][]ordered = original;
		int largest = LLE.order2D(ordered);
		int[] location = LLE.locateLargest(original, largest);
		System.out.println();
		System.out.print("The entered matrix: ");
		System.out.println();
		for(int row = 0; row < original.length; row++) {
			for(int col = 0; col < original[0].length; col++) {
				System.out.print("	" + original[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("First largest value located at row " + location[0] + " column " + location[1]);
		System.out.println();
		sc.close();
	}

}
