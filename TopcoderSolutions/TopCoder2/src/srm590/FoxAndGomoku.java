package srm590;

public class FoxAndGomoku {

	public String win(String[] board){
		for (int i=0; i<board.length; i++){
			if (board[i].indexOf('o')<0)
				continue;
			for (int j=0; j<board[i].length(); j++){
				int k =0;
				// go right
				while ((k<5) && ((j+k)<board[i].length())){
					if (board[i].charAt(j+k)=='o')
						k++;
					else 
						break;
				}
				if (k==5)
					return "found";
				// go down
				k =0;
				while ((k<5) && ((i+k)<board.length)){
					if (board[i+k].charAt(j)=='o')
						k++;
					else 
						break;
				}
				if (k==5)
					return "found";				
				
				// go left down
				k=0;
				while ((k<5) && ((j+k)<board[i].length())&& ((i+k)<board.length)){
					if (board[i+k].charAt(j+k)=='o')
						k++;
					else 
						break;
				}
				if (k==5)
					return "found";				
				
				// go right down
				k=0;
				while ((k<5) && ((j-k)>=0)&& ((i+k)<board.length)){
					if (board[i+k].charAt(j-k)=='o')
						k++;
					else 
						break;
				}
				if (k==5)
					return "found";				
			}
			
		}
		return "not found";
	}
	
	public static void main(String[] args) {
		FoxAndGomoku div2 = new FoxAndGomoku();
		String[] board = 
//			{"ooooo",
//				 "ooooo",
//				 "ooooo",
//				 "ooooo",
//				 "ooooo"};
//			{"..........",
//				 "..........",
//				 "..oooooo..",
//				 "..o.......",
//				 "..o.......",
//				 "..oooooo..",
//				 ".......o..",
//				 ".......o..",
//				 "..oooooo..",
//				 ".........."};
			
//			{"oooo.",
//				 ".oooo",
//				 "oooo.",
//				 ".oooo",
//				 "..o.."};
			{"....o.",
				 "...o..",
				 "..o...",
				 ".o....",
				 "o.....",
				 "......"};
		System.out.println(div2.win(board));
	}

}
