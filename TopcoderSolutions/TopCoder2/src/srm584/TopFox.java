package srm584;

import java.util.HashSet;

public class TopFox {

	public int possibleHandles(String familyName, String givenName){
		HashSet<String> set = new HashSet<String>();
		for (int i=1; i<=familyName.length(); i++){
			for (int j=1; j<=givenName.length(); j++){
				set.add(familyName.substring(0,i)+givenName.substring(0,j));
			}			
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		TopFox fox = new TopFox();
		String familyName ="abxy";//
		String givenName = "xyxyxc";//
		System.out.println(fox.possibleHandles(familyName, givenName));
	}

}
