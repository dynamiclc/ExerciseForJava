package CountWays;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountWaysDP2 {
	 private static int fibonacci(int i) {
		if (0 == i) {
			return 0;
		} else if (1 == i) {
			return 1;
		} else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new FileReader("src/CountWays/Test_Cases"));
		while (input.hasNextInt()) {
			int inputInt = input.nextInt();
			int result = fibonacci(inputInt);
			System.out.println(result);
		}
	}
}
