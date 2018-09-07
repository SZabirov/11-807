import java.util.Scanner;

public class NumberSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("Positive number");
		} else {
			if (n == 0) {
				System.out.println("It's zero");
			} else {
				System.out.println("Negative");
			}
		}
	}
}