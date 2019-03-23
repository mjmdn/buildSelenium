package homeWorks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicatechar_FromString {

	public static void main(String[] args) {
		
		
		String input="goodday";
		String output= "";
		System.out.println("Before Remove Duplicate----->"+input);
		char[] takingChar=input.toCharArray();
		Set<Character> myCharValue= new LinkedHashSet<Character>();
		for (Character getchar : takingChar) 
		{

			myCharValue.add(getchar);
		}

		for (Character character : myCharValue)
		{

			output+=character.charValue();
		}		


		System.out.println("Before Remove Duplicate----->"+output);	

	}

}
