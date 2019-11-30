import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");

		int year = sc.nextInt();

		System.out.println(year%4==0 && year>=0 ? "YES, it's a leap year" : "No, it's NOT a leap year");

	}
}
