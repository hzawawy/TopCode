package srm517;

public class CompositeSmash {

	public String thePossible(int N, int target){
		String ans = "Yes";
		if (N==target) return "Yes";
		if ((N%target)!= 0) return "No";
		for (int x=2;x<=N/2; x++){
			if (N%x==0){
				int y = N/x;
				if ((x%target!=0) && (y%target!=0))
					return "No";
				else {
					if ((x%target==0)){
						if (thePossible(x, target)=="No")
							return "No";
					}
					else if (y%target==0)
							if (thePossible(y, target)=="No")
								return "No";
				}
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		CompositeSmash smash = new CompositeSmash();
		int N = 12;
		int target = 4;
		System.out.println(smash.thePossible(N, target));
	}
	
}

