/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab:			12	←		*/

package lab_12;
import java.util.Scanner;
public class CompareArrays {
	
	CompareArrays() {
	};
	
	private int[] createArray(int size) {
		int[] arr = new int[size];
		return arr;
	}
	private boolean compare(int[] arr1, int[] arr2) {
		int i = 0;
		boolean result = false;
		while(i < arr1.length) {
			if(arr1[i] == arr2[i]) {
				result = true;
				i++;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		CompareArrays FRTWNTYBLZIT = new CompareArrays();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter length of arrays to compare: ");
		int length = sc.nextInt();
		int[] arr1 = FRTWNTYBLZIT.createArray(length);
		int[] arr2 = FRTWNTYBLZIT.createArray(length);
		System.out.println();
		System.out.println("Enter values for the elements of the first array...");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print("Value at index " + i + " is: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter values for the elements of the second array...");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print("Value at index " + i + " is: ");
			arr2[i] = sc.nextInt();
		}
		System.out.println();
		boolean same = FRTWNTYBLZIT.compare(arr1, arr2);
		System.out.println("Array size:		" + length);
		System.out.print("First array:		");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
			if(arr1[i] == arr1.length) {
				System.out.print(arr1[i]);
			}
		}
		System.out.println();
		System.out.print("Second array:		");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
			if(arr2[i] == arr2.length) {
				System.out.print(arr2[i]);
			}
		}
		System.out.println();
		if(same == true) {
			System.out.println("Judgement: 		The arrays are identical");			
		} else if(same == false) {
			System.out.println("Judgement:		The arrays are not identical");
		}
		System.out.println();
		sc.close();
	}
}
