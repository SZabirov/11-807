import java.util.Scanner;

public class IncreasingSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int prev = -1;
		boolean isIncreasing = true;
		for(int i = 0; i < n & isIncreasing; i++) {
			int x = sc.nextInt();
			if (x <= prev) {
				isIncreasing = false;
			}
			prev = x;
		}
		if (isIncreasing) {
			System.out.println("Increasing");
		} else {
			System.out.println("It's not increasing");
		}
	}
}






