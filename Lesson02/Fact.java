import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int i = 1;
		int f = 1;
		while (i <= n) {
			f = f * i;
			i = i + 1;//i++;
		}
		System.out.println(f);
	}
}
