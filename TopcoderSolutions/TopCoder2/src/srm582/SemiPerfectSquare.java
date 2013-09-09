package srm582;

public class SemiPerfectSquare {

	public String check(int N) {
		double b1 = Math.sqrt(N);
		int b = (int)(b1);
		int a = 1;
		while ((a<b) && (b>1)){
			if ((b==b1) && (N==(a*b*b)))
				return "Yes";
			else {
				a++;
				b1 = Math.sqrt(N/a);
				b = (int) b1;
			}
		}
		
		return "No";
	}
	
	public static void main(String[] args) {
		SemiPerfectSquare semi = new SemiPerfectSquare();
		int N = 33;
		System.out.println(semi.check(N));
	}

}
