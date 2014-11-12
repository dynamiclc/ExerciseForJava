package CountWays;

public class CountWaysDP {
	public int fibonacci(int i) {
		if (0 == i) {
			return 0;
		} else if (1 == i) {
			return 1;
		} else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}
}
