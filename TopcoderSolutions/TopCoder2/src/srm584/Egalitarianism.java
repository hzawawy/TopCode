package srm584;

public class Egalitarianism {

	public int maxDifference(String[] isFriend, int d){
		int ans = 0;
		
		isConnected(isFriend);
		
		return ans;
	}
	
	private boolean isConnected(String[] isFriend){
		boolean connected = false;
		int[] nodes = new int[isFriend.length];
		
		while (true) {
			
		}
		
		return connected;
	}
	
	public static void main(String[] args) {
		Egalitarianism egal = new Egalitarianism();
		String[] isFriend = {"NYN",
							 "YNY",
		 					 "NYN"};
		int d = 10;
		System.out.println(egal.maxDifference(isFriend, d));
	}

}
