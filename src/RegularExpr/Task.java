package RegularExpr;

import java.util.Scanner;

public class Task {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String sentence = sc.nextLine();
		String [] words = sentence.split(" ");
	
		String longWord = "";
		for(int i =0; i < words.length; i++)
			for ( int j = 1+i; j< words.length; j ++)
				if (words [i].length() >= words[j].length())
					longWord = words[i];
		System.out.println(longWord + " is the longest word with " + longWord.length() + " charaecters.");
		
 

	StringBuilder reverseString = new StringBuilder();
	reverseString.append(words[1]);
	 System.out.println("reverseOrderOfWordsString = " + reverseString.append(reverseString));
      
}
}