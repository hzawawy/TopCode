package srm589;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class GooseTattarrattatDiv2 {

	public int getmin(String S){
		int res = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i =0; i<S.length(); i++){
			Character c = new Character(S.charAt(i));
			Integer count = map.get(c);
			if (count == null){
				map.put(c, 1);
			} else {
				count++;
				map.put(c, count);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> iter = map.values().iterator();
		while (iter.hasNext()){
			Integer count = iter.next();
			list.add(count);
		}
		Arrays.sort(list);
		return res;
	}
	
	public static void main(String[] args) {
		GooseTattarrattatDiv2 div2 = new GooseTattarrattatDiv2();
		String S = "geese";
		System.out.println(div2.getmin(S));
	}

}
