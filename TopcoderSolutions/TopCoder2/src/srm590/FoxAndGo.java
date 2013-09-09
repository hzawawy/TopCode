package srm590;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class FoxAndGo {

	class Node{
		int x,y;
		Node(int X, int Y){
			x = X;
			y = Y;
		}
	}
	
	public int maxKill(String[] board){
		int height = board.length, width = board[0].length();
		int[][] visited = new int[height][width];
		for (int i=0; i<height; i++)
			Arrays.fill(visited[i], 0);

		LinkedList<Node> queue = new LinkedList<Node>();
		boolean whiteSpaceAlreadyfound = false;
		int[] highestCounts = new int[height*width];
		int counter = -1;
		Arrays.fill(highestCounts, 0);
		for (int i=0; i<height ; i++){
			for (int j=0; j<width; j++){
				counter++;
				if ((board[i].charAt(j)=='o') && (visited[i][j]==0)){
					queue.addLast(new Node(i,j));
					while (!queue.isEmpty()){
						Node cur = queue.removeFirst();
						int x = cur.x, y = cur.y;
						if (board[x].charAt(y)=='.') {
							if (!whiteSpaceAlreadyfound) {
								whiteSpaceAlreadyfound = true;
							} else {
								highestCounts[counter] = 0;// component safe
							}
						} else {
							highestCounts[counter]++;
							if (y>0) {
								if ((board[x].charAt(y-1)=='o') && (visited[x][y-1]==0)){
									queue.addLast(new Node(x, y-1));
									visited[x][y-1] = visited[x][y]+1;
								}
							}						
							if (y<board[0].length()-1) {
								if ((board[x].charAt(y+1)=='o') && (visited[x][y+1]==0)){
									queue.addLast(new Node(x, y+1));
									visited[x][y+1] = visited[x][y]+1;
								}
							}						
							if (x<board.length-1) {
								if ((board[x+1].charAt(y)=='o') && (visited[x+1][y]==0)){
									queue.addLast(new Node(x+1, y));
									visited[x+1][y] = visited[x][y]+1;
								}
							}						
						}
					}
				}
			}
		}
		Arrays.sort(highestCounts);
		if (highestCounts[height*width-1]==1)
			return 1;
		else 
			return highestCounts[height*width-1]-1;
	}
		
	public static void main(String[] args) {
		FoxAndGo div2 = new FoxAndGo();
		String[] board = 
			{"o.xox.o",
				 "..xox..",
				 "xxxoxxx",
				 "ooo.ooo",
				 "xxxoxxx",
				 "..xox..",
				 "o.xox.o"};
				
//			{".......",
//				 ".xxxxx.",
//				 ".xooox.",
//				 ".xo.ox.",
//				 ".xooox.",
//				 ".xxxxx.",
//				 "......."};
		
//			{"ooooo",
//				 "xxxxo",
//				 "xxxx.",
//				 "xxxx.",
//				 "ooooo"};
			
//			{".....",
//				 "..x..",
//				 ".xox.",
//				 ".....",
//				 "....."};
		
		
		System.out.println(div2.maxKill(board));
	}

}
