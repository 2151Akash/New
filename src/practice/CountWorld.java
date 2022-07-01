package practice;

import java.util.HashMap;

public class CountWorld {
public static void main(String[] args) {
  String s="HelLo";
	
	String s1=s.toLowerCase();
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(int i=0; i<s1.length();i++) {
		char charvalue = s1.charAt(i);
		if(hm.containsKey(charvalue)) {
			hm.put(charvalue, hm.get(charvalue)+1);
		}
		else {
			hm.put(charvalue, 1);
		}
		
	}
	System.out.println(hm);
}
}
