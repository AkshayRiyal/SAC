//7. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a 
//a)while statement 
//b)do-while statement
package ttnd;

import java.util.*;

public class E7 {
	public static void main(String[] args) {
		String word;
		System.out.println("Enter Text:");
		Scanner input = new Scanner(System.in);
		word = input.next();
		//BY WHILE LOOP
		/*while (!word.equals("done")) {

			if (word.charAt(0) == word.charAt(word.length() - 1)) {
				System.out.println("First and last character are equals for :" + word);
			} else {
				System.out.println("First and last character are NOT equals for: " + word);
			}
			word = input.next();
		}
		*/
        
		
		//BY DO WHILE LOOP
		do {
		    
			if (word.charAt(0) == word.charAt(word.length() - 1)) {
				System.out.println("First and last character are equals for: " + word);
			}
			else {
				System.out.println("First and last character are NOT equals for : " + word);
			}
			 word = input.next();
		} while (!word.equals("done"));
        
	}
}
