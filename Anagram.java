import java.util.Scanner;
import java.util.HashMap;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings :");
		System.out.print("String1 = ");
		String str1 = sc.nextLine();
		System.out.print("String2 = ");
		String str2 = sc.nextLine();
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		int i;
		char key;
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for(i = 0; i < str1.length(); i++) {
			key = str1.charAt(i);
			if(key == ' ')
				continue;

			if(hm1.containsKey(key))
				hm1.put(key, hm1.get(key) + 1);
			else
				hm1.put(key, 1);
		}
		for(i = 0; i < str2.length(); i++) {
			key = str2.charAt(i);
			if(key == ' ')
				continue;
			
			if(hm2.containsKey(key))
				hm2.put(key, hm2.get(key) + 1);
			else
				hm2.put(key, 1);
		}

		if(hm1.equals(hm2)) {
			System.out.println("Yes, " + str1 + " and " + str2 + " are Anagrams.");
		} else {
			System.out.println("No, " + str1 + " and " + str2 + " are NOT Anagrams.");
		}
		sc.close();
	}
}