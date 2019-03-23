package homeWorks;

import java.util.Spliterator;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class HW_LowercasetoUppercase {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		char repeatedchar = 0;
		String myName="Madhavan Ramalingam";
		String cancatvalue="";
		String finalString="";
		String lowercaseValue="welcome to java";

		//first letter to change uppercase
		String[] splitingArray=lowercaseValue.split(" ");
		for(int i=0;i<=splitingArray.length-1;i++)
		{
			String fisrstlLetterChange=splitingArray[i].substring(0, 1).toUpperCase();
			cancatvalue=fisrstlLetterChange + splitingArray[i].substring(1);

			finalString+=cancatvalue+" ";
		}

		System.out.println(finalString);


		//Find the Repeated char
		for(int i=0; i<myName.length();i++)
		{
			for( int j=i+1; j<myName.length();j++)
			{
				if(myName.charAt(i)==myName.charAt(j))
				{
					repeatedchar=myName.charAt(j);
					break;
				}


			}
		}

		System.out.println(repeatedchar);
	}


}














