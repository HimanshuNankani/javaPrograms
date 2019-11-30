import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0, sum = 0;
		while(temp > 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		while(temp > 0) {
			sum += (int) Math.pow(temp%10, count);
			temp /= 10;
		}

		if(sum == num) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println("No, " + num + " is NOT an Armstrong number.");
		}
		sc.close();
	}
}