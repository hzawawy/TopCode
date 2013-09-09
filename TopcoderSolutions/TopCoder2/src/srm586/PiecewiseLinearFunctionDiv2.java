package srm586;

import java.util.Arrays;
import java.util.HashMap;

public class PiecewiseLinearFunctionDiv2 {

	public int[] countSolutions(int[] Y, int[] query){
		int[] ans = new int[query.length];
		Arrays.fill(ans, 0);
		for (int i=0; i<query.length; i++){
			HashMap<Double, Double> map = new HashMap<Double, Double>();
			for (int j=0; j<Y.length-1; j++){
				int y1 = Y[j], y2 = Y[j+1];
				int min = (y1 < y2)? y1 : y2;
				int max = (y1 > y2)? y1 : y2;
				if ((query[i]>=min) && (query[i]<=max)){
					double x = -1;
					if ((Y[j+1]-Y[j])!=0){
						x = ((query[i]-Y[j])/(Y[j+1]-Y[j]))+j;
						map.put(new Double(x), new Double(query[i]));
					} else {
						ans[i] = -1;
						break;
					}
				}
				
			}
			if (ans[i]!=-1)
				ans[i] = map.size();
			map = new HashMap<Double, Double>();
		}
		return ans;
	}
	
	public static void main(String[] args) {
		PiecewiseLinearFunctionDiv2 piece = new PiecewiseLinearFunctionDiv2();
		int[] Y = {1, 4, -1, 2};
		int[] query = 
			{-2, -1, 0, 1};
		int[] ans = piece.countSolutions(Y, query);
		for (int i=0; i<ans.length; i++)
			System.out.print(ans[i]+ " ");
	}

}
