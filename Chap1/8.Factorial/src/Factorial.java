import java.util.Scanner;

public class Factorial {

	public static long f(int n) {
		long ans = 1;
		for (int i = 1; i <= n; i++)
			ans *= i;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên n: ");
		int n = sc.nextInt();
		System.out.println("n! = " + f(n));
		sc.close();
	}

}
