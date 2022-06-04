package strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharFrequency {

	public static void main(String[] args) {
		String str = "abcacbbdddde";
		int strLen = str.length();
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		for(int i=0; i<strLen; i++) {
			char ch = str.charAt(i);
			String chStr = ch+"";
			
			if(map.containsKey(chStr)) {
				int val = map.get(chStr);
				map.replace(chStr, val+1);
			} else {
				map.put(chStr, 1);
			}
		}
		
		List<Map.Entry<String, Integer>> listOfMap = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		
		//Sorting the list on the basis of values
		Collections.sort(listOfMap, new Comparator<Map.Entry<String, Integer>> () {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
				 {
				     return (o1.getValue()).compareTo(o2.getValue());
				 }
		});
		
		//Putting it another map after sorting
		HashMap<String, Integer> finalMap = new LinkedHashMap<String, Integer>();
		
        for (Map.Entry<String, Integer> entry : listOfMap) {
        	finalMap.put(entry.getKey(), entry.getValue());
        }
		
        for (Map.Entry<String, Integer> entry : finalMap.entrySet()) {
        	System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        // Display the keyvalues
        for (Map.Entry<String, Integer> entry : finalMap.entrySet()) {
        	System.out.print(entry.getKey());
        }
	}

}
