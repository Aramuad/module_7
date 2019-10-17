/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab:			12	←		*/

package lab_12;
public class ArrayMethods {
	
	ArrayMethods() {
	}
	
	private int arrayMax(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[0] < arr[i]) {
				arr[0] = arr[i];
			}
		}
		return arr[0];
	}
	private int arrayMin(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[0] > arr[i]) {
				arr[0] = arr[i];
			}
		}
		return arr[0];
	}
	private int[] arraySquared(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		return arr;
	}
	private int[] arrayReverse(int[] arr) {
		int[] reversed = new int[arr.length];
		for(int i = 0, j = arr.length - 1; i < reversed.length; i++, j--) {
			reversed[i] = arr[j];
		}
		return reversed;
	}
	private void getArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if(i == arr.length) {
				System.out.print(arr[i]);
			}
		}
	}
	private int random() {
		int random = (int)Math.floor(Math.random() * 5) + 1;
		return random;
	}
	
	public static void main(String[] args) {
		ArrayMethods AM = new ArrayMethods();
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = AM.random();
		}
		System.out.println();
		System.out.print("Original array:	");
		AM.getArray(arr);
		System.out.println();
		System.out.println("Max value:	" + AM.arrayMax(arr));
		System.out.println("Min value:	" + AM.arrayMin(arr));
		System.out.print("Squared array:	");
		AM.getArray(AM.arraySquared(arr));
		System.out.println();
		System.out.print("Reversed array:	");
		AM.getArray(AM.arrayReverse(arr));
		System.out.println();
		System.out.println();
	}
}
