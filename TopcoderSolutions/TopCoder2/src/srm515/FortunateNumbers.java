package srm515;

import java.util.HashSet;

public class FortunateNumbers {

	public int getFortunate(int[] a, int[] b, int[] c){
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0; i<a.length; i++){
			for (int j=0; j<b.length; j++){
				for (int k=0; k<c.length; k++){
					int sum = a[i]+b[j]+c[k];
					String sumString = Integer.toString(sum);
					if ((sumString.indexOf('0')==-1)&&(sumString.indexOf('1')==-1)&&(sumString.indexOf('2')==-1)
							&&(sumString.indexOf('3')==-1)&&(sumString.indexOf('4')==-1)&&(sumString.indexOf('6')==-1)
							&&(sumString.indexOf('7')==-1)&&(sumString.indexOf('9')==-1)){
						set.add(new Integer(sum));
					}
				}
			}
		}
		
		return set.size();
	}
	
	public static void main(String[] args) {
		FortunateNumbers fortunate = new FortunateNumbers();
		int[] a = { 30000, 26264 };
		int[] b = { 30000, 29294 };
		int[] c = { 30000, 29594 };
		System.out.println(fortunate.getFortunate(a, b, c));
	}

}
