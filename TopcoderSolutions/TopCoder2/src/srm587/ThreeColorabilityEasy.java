package srm587;

import java.util.LinkedList;
import java.util.Queue;

public class ThreeColorabilityEasy {

	class Point{
		int x,y;
		Point(int X, int Y){
			x = X;
			y = Y;
		}
	}
	public String isColorable(String[] cells){
		String ans = "Yes";
		int H = cells.length, W = cells[0].length();
		char[][] lattices = new char[H+1][W+1];
		Queue<Point> queue = new LinkedList<Point>();
		Point cur = new Point(0, 0);
		queue.
		for (int i =0; i<H; i++){
			for (int j =0; j<H; j++){
				if (i>0){
					
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		ThreeColorabilityEasy colors = new ThreeColorabilityEasy();
		String[] cells = {"Z"};
		System.out.println(colors.isColorable(cells));
	}

}
