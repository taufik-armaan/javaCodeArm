package interviewQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharUsingHashMap {

	
	public static void main(String[] args)
    {
        String str = "GeeksForGeeks";
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            al.add(str.charAt(i));
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.putIfAbsent(al.get(i),
                           Collections.frequency(al,al.get(i)));
        }
 
        for (Map.Entry<Character,Integer> e : hm.entrySet()) {
            System.out.println(
                "Character is :"+e.getKey()+ " and its count is string is "+ e.getValue());
        }
    }
}
