package srm586;

public class TeamsSelection {

	public String simulate(int[] preference1, int[] preference2){
		StringBuilder ans = new StringBuilder();
		int[] assign = new int[preference1.length];
		for (int i =0; i<preference1.length; i++){
			if (i%2==0){
				int cnt = 0;
				while (assign[preference1[cnt]-1]!=0)
					cnt++;
				assign[preference1[cnt]-1] = 1;
			} else {
				int cnt = 0;
				while (assign[preference2[cnt]-1]!=0)
					cnt++;
				assign[preference2[cnt]-1] = 2;				
			}
		}
		for (int i=0; i<assign.length; i++)
			ans.append(assign[i]);
		return ans.toString();
	}
	
	
	public static void main(String[] args) {
		TeamsSelection select = new TeamsSelection();
		int[] preference1 = {8, 7, 1, 2, 4, 5, 6, 3, 9};
		int[] preference2 = {7, 2, 4, 8, 1, 5, 9, 6, 3};
		System.out.println(select.simulate(preference1, preference2));
	}

}
