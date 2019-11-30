import java.util.Scanner;

public class CheckVowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");

		char ch = sc.next().charAt(0);

		System.out.println(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'?"vowel":"consonant");		
	}
}
