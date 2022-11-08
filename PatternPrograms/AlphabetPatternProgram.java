package PatternPrograms;

//create AlphabetPatternProgram class to print the alphabet  
public class AlphabetPatternProgram {

	public static void main(String[] args) {
//        1.Write a program(WAP) to print INEURON using pattern programming logic.
		int n = 10;
		// I
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == (n - 1) / 2 || i == 0 || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			// N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			// E
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j < n - 2) || (i == n - 1 && j < n - 2)
						|| i == (n - 1) / 2 && j <= (n - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			// U
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			// R
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || j == n - 1 && i < (n - 1) / 2 || i == (n - 1) / 2 || i - j == (n - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			// O
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			// N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.println();
		}

	}
}