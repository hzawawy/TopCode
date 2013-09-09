package srm581;

public class BlackAndWhiteSolitaire {

	public int minimumTurns(String cardFront){
		int min1 = 0, min2 = 0;
		for (int i =0; i<cardFront.length(); i++){
			if (i%2==0){
				if (cardFront.charAt(i)=='B') 
					min1++;
				else 
					min2++;
			} else {
				if (cardFront.charAt(i)=='W') 
					min1++;
				else 
					min2++;				
			}
		}
		
		int min = (min1 < min2)? min1 : min2;
		return min;
	}
	
	public static void main(String[] args) {
		BlackAndWhiteSolitaire solitaire = new BlackAndWhiteSolitaire();
		String cardFront = "BBWBWWBWBWWBBBWBWBWBBWBBW";//"BBWBWBWBBWBWBBWBBBWBWBBWWBB";
		System.out.println(solitaire.minimumTurns(cardFront));
		
	}

}