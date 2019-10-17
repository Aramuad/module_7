/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab:			13	←		*/

package lab_13;
import java.util.Scanner;
public class SumArrayColumns {
	
	SumArrayColumns() {
	}

	private int[][] make2D(int row, int col) {
		int[][] arr = new int[row][col];
		return arr;
	}
	private int[][] populate2D(int[][] array2D) {
		int arr[][] = array2D;
		Scanner sc = new Scanner(System.in);
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print("Enter [" + row + "][" + col + "]: ");
				arr[row][col] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
	private int[] sumColumns(int[][] array2D) {
		int arr[][] = array2D;
		int[] summedColumns = new int[arr[0].length];
		int row;
		for(int col = 0; col < arr[0].length; col++) {
			for(row = 0; row < arr.length; row++) {
				summedColumns[col] += arr[row][col];
			}
		}
		return summedColumns;
	}
	private void get2DArray(int[][] array2D) {
		int arr[][] = array2D;
		int col;
		System.out.println();
		System.out.println("The entered matrix:");
		for(int row = 0; row < arr.length; row++) {
			for(col = 0; col < arr[row].length; col++) {
				System.out.print("	" + arr[row][col]);
			}
		System.out.println();
		}
	}
	private void get1DArray(int[] summedColumns) {
		int[] arr = summedColumns;
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Sum of column " + i + " is " + arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SumArrayColumns SAC = new SumArrayColumns();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter number of rows for 2D array: ");
		int row = sc.nextInt();
		System.out.println();
		System.out.print("Enter number of columns for 2D array: ");
		int col = sc.nextInt();
		int [][] array2D = SAC.make2D(row, col);
		array2D = SAC.populate2D(array2D);
		int[] summedColumns = SAC.sumColumns(array2D);
		SAC.get2DArray(array2D);
		SAC.get1DArray(summedColumns);
		sc.close();
	}

}
