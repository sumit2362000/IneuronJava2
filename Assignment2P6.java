package IneuronJava;

public class Assignment2P6 {
	public static void main(String[] args) {
		// declaring two arrays
		int[] arr1 = { 1, 2, 6, 7, 4, 3, 2 };
		System.out.println("First array is : ");
		printArray(arr1);

		int[] arr2 = { 1, 2, 7 };
		System.out.println("Second array is : ");
		printArray(arr2);

		// calling isSubset method
		if (isSubset(arr1, arr2))
			System.out.println("Subset");
		else
			System.out.println("Not Subset");

	}

	static boolean isSubset(int[] arr1, int[] arr2) {
		// If length of two arrays are not same return false
		if (arr1.length < arr2.length)
			return false;

		int j = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (j = 0; j < arr1.length; j++)
				if (arr2[i] == arr1[j])
					break;

			// Checking if the above inner loop was not broken at all,
			// then arr2 isn't a subset of arr1
			if (j == arr1.length)
				return false;
		}
		// if the inner loop was broken, then arr2 is a subset of arr1
		return true;
	}

	// printArray() method to print the array
	static void printArray(int[] arr) {
		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}