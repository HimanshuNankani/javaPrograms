import java.util.Scanner;

public class CheckGreatest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers \n");
		
		System.out.print("n1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("n2 : ");
		int n2 = sc.nextInt();

		System.out.print("n3 : ");
		int n3 = sc.nextInt();

		System.out.print("n4 : ");
		int n4 = sc.nextInt();

		String res = (n1 > n2) ? ( (n1 > n3)? ((n1 > n4)? "n1" : "n4")
											 : ((n3 > n4)? "n3" : "n4"))
								: ( (n2 > n3)? ((n2 > n4)? "n2" : "n4")
											 : ((n3 > n4)? "n3" : "n4"));

	  	System.out.println(res + " is the greatest number");	
	}
}
