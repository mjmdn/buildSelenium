package homeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		List<String> ListofStringvalues= new ArrayList<String>();
		List<String> ListofStringvalues1= new ArrayList<String>();
		Set<String>setOfStringvalues=new LinkedHashSet<String>();
		
		String[] Names= {"madhavan", "deepan","Jishnu dev","madhavan"};
		ListofStringvalues=Arrays.asList(Names);
		System.out.println(ListofStringvalues);
		
		setOfStringvalues.addAll(ListofStringvalues);

		for (String getUniqueString : setOfStringvalues)
		{
			ListofStringvalues1.add(getUniqueString);
		}

		Collections.sort(ListofStringvalues1);
		System.out.println(ListofStringvalues1);
	}

}
