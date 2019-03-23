package homeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Remove_CharFromAlLString {

	public static void main(String[] args) {

		List<String>modifiedStringvalues= new ArrayList<String>();
		List<String> ListofStringvalues= new ArrayList<String>();
		String[] Names= {"madhavan", "deepan","Jishnu dev","Raj", "Anbu"};

		ListofStringvalues=Arrays.asList(Names);
		System.out.println(ListofStringvalues);
		for (String replace : ListofStringvalues) {

			if (!replace.contains("d")) {
							
				String getName=replace;
				modifiedStringvalues.add(getName);
				
			}
		}
		Collections.sort(modifiedStringvalues);
		System.out.println(modifiedStringvalues);
	}

}
