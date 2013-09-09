package srm512;

import java.util.Arrays;

public class MarbleDecoration {

	public int maxLength(int R, int G, int B){
		int[] array = new int[3];
		array[0] = R;
		array[1] = G;
		array[2] = B;
		Arrays.sort(array);
		int mid = array[1], max = array[2];
		if (mid==max)
			return (mid*2);
		else
			return (mid*2+1);
	}
	
	public static void main(String[] args) {
		MarbleDecoration marble = new MarbleDecoration();
		int R = 13;
		int G = 13;
		int B = 13;
		System.out.println(marble.maxLength(R, G, B));
	}

}
