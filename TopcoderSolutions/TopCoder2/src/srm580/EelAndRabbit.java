package srm580;

import java.util.Arrays;

public class EelAndRabbit {

	public int getmax(int[] l, int[] t){
		int start = l[0];
		int end = l[0]+t[0];
		for (int i=0; i<l.length; i++){
			if (t[i]<start)
				start = t[i];
			if ((l[i]+t[i])>end)
				end = l[i]+t[i];
		}
		int[] array = new int[end-start+1];
		for (int i=0; i<l.length; i++){
			for (int j=t[i]-start; j<=t[i]+l[i]-start; j++)
				array[j]++; 
		}
		Arrays.sort(array);
		if (l.length==0) 
			return 0;
		else if (l.length==1) 
			return array[array.length-1];

		return array[array.length-1]+array[array.length-2];
	}
	
	public static void main(String[] args) {
		EelAndRabbit eel = new EelAndRabbit();
		int[] l =  
//			{1};
//			{1,1,1};
			{2, 4, 3, 2, 2, 1, 10};
//			{8, 2, 1, 10, 8, 6, 3, 1, 2, 5};
		int[] t =
//			{1};
//			{2,0,4};
			{2, 6, 3, 7, 0, 2, 0}; 
//			{17, 27, 26, 11, 1, 27, 23, 12, 11, 13};
		System.out.println(eel.getmax(l, t));
	}

}
