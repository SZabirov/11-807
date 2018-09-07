import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of numbers:");
		int n = sc.nextInt();
		System.out.println("Enter numbers:");
		int sum = 0;
		int i = 0;
		while (i < n) {
			int x = sc.nextInt();
			sum = sum + x;//sum += x;
			i++;
		}
		System.out.println(sum);
	}
}






