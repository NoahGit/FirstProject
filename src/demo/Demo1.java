package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	
	public static void main(String[] args) {
		String[] str = {"a","b","c","d","e","f","g","h","i","j","k",};
		int[] int_key = {1,2,3,4,5,6,7,8,9,10,11};
		
		List<String> list = new ArrayList<String>();
		for(int i=0; i<str.length; i++){
			list.add(i, str[i]);
		}
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		System.out.println("+++++++++");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()){
			String o = ite.next();
			System.out.print(o+"  ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Map<Integer, String> map = new HashMap<>();
		for(int i=0; i<int_key.length; i++){
			map.put(int_key[i],str[i]);
		}
		for(int i=0; i<map.size(); i++){
			System.out.print(map.get(int_key[i])+"  ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Set<Integer> s = map.keySet();
		Iterator<Integer> ite1 = s.iterator();
		while(ite1.hasNext()){
			Object o = ite1.next();
			System.out.print(o+"  ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Collection<String> col =  map.values();
		System.out.println(col);
		
		
	}
}
