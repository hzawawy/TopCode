package srm517;

public class MonochromaticBoard {

	public int theMin(String[] board){
		int ans = 0;
		int H = board.length, W = board[0].length();
		StringBuilder[] board2 = new StringBuilder[W];
		for (int i=0; i<W; i++){
			board2[i] = new StringBuilder();
			for (int j=0; j<H; j++){
				board2[i].append(board[j].charAt(i));
			}
		}
		if (H<W){
			for (int i=0; i<H; i++){
				if (board[i].indexOf('W')==-1)
					ans++;
			}
			if (ans==H)
				return ans;
			else {
				for (int i=0; i<W; i++){
					if (board2[i].toString().indexOf('W')==-1)
						ans++;
				}
			}
		} else {
			for (int i=0; i<W; i++){
				if (board2[i].toString().indexOf('W')==-1)
					ans++;				
			}
			if (ans==W)
				return ans;
			else {
				for (int i=0; i<H; i++){
					if (board[i].indexOf('W')==-1)
						ans++;
				}
			}
			
		}
		return ans;
	}
	
}
public static void main(String[] args) {
	MonochromaticBoard monoboard = new MonochromaticBoard();
	String[] board = {"WW",
	 "WW"};
	System.out.println(monoboard.theMin(board));
}

