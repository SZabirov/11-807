import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter k:");
		int k = sc.nextInt();
		int power = 1;
		for(int i = 0; i < k; i++) {
			power *= n;
		}
		System.out.println(power);
	}
}






