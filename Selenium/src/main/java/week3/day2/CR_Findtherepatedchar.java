package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CR_Findtherepatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cityName="Tamilnadu d";
		char[] changechar=cityName.toCharArray();


        
		Map<Character, Integer> obj=new HashMap<Character, Integer>();

		for (char c : changechar) {
			if (obj.containsKey(c)) {
				obj.put(c, obj.get(c)+1);
			} else {
				obj.put(c, 1);

			}


		}
		System.out.println(obj);



	}



}

