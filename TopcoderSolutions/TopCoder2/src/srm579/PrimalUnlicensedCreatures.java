package srm579;

import java.util.Arrays;

public class PrimalUnlicensedCreatures {

	public int maxWins(int initialLevel, int[] grezPower) {
		int max = 0;
		int i =0;
		Arrays.sort(grezPower);
		while ((i<grezPower.length) && (initialLevel>grezPower[i])){
			max++;
			initialLevel+=grezPower[i]/2;
			i++;
		}
		return max;
	}
	
	public static void main(String[] args) {
		PrimalUnlicensedCreatures primal = new PrimalUnlicensedCreatures();
		int initialLevel = 20;
				
		int[] grezPower = {3, 3, 3, 3, 3, 1, 25 };
		System.out.println(primal.maxWins(initialLevel, grezPower));
		
	}

}
