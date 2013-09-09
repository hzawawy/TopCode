package srm518;

public class TwiceString {

	public String getShortest(String s){
		String twice = s;
		int max=0;
		for (int i=1; i<s.length(); i++){
			if (s.substring(0,i).equals(s.substring(s.length()-i)))
				max = i;
		}
		if (max==s.length())
			twice = s + s.substring(s.length()-1);
		else 
			twice = s + s.substring(max);
		return twice;
	}
	
	
	public static void main(String[] args) {
		TwiceString twice = new TwiceString();
		String s = "aa";//abracadabracadabra
		System.out.println(twice.getShortest(s));
	}

}
