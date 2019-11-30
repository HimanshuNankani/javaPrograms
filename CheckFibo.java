import java.util.Scanner;

public class CheckFibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		if(chkFibo(num)) {
			System.out.println("\n" + num + " belongs to the fibonacci series");
		} else {
			System.out.println("\n No, " + num + " does NOT belongs to the fibonacci series");
		}
	}
	public static boolean chkFibo(int num) {
		int a = 0;
		int b = 1;
		int c = a + b;
		while(c <= num) {
			System.out.print(c + " ");
			if(c == num) {
				return true;
			}
			a = b;
			b = c;
			c = a + b;
		}
		return false;
	}
}