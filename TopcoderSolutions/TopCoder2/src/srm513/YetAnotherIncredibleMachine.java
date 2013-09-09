package srm513;

import java.util.HashSet;

public class YetAnotherIncredibleMachine {

	public int countWays(int[] platformMount, int[] platformLength, int[] balls){
		int count = 0;
		for (int j=0; j<platformMount.length; j++){
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i=0; i<balls.length; i++){
				if (balls[i]<platformMount[j]){
					if (balls[i]<(platformMount[j]-platformLength[j]))
						localcount = platformLength[j];
					else
						localcount = platformMount[j] - balls[i];
				}
			}
			if (j==0)
				count = set.size();
			else
				count = count*set.size();
		}
		return count;
	}
	
	public static void main(String[] args) {
		YetAnotherIncredibleMachine machine = new YetAnotherIncredibleMachine();
		int[] platformMount = {7};
		int[] platformLength = {10};
		int[] balls = {3,4};
		System.out.println(machine.countWays(platformMount, platformLength, balls));
	}

}
