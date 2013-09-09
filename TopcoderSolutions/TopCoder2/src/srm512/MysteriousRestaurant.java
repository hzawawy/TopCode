package srm512;

import java.util.Arrays;

public class MysteriousRestaurant {

	public int maxDays(String[] prices, int budget){
		int spending = 0, dayNum =7;
		if (prices.length<7)
			dayNum = prices.length;
		int[][] days = new int[dayNum][prices[0].length()];
		int i =0;
		for (; i<prices.length && spending<=budget; i++){
			if (i<7){
				for (int j=0; j<prices[0].length(); j++)
					days[i][j] = prices[i].charAt(j)-'0';
				int[] todaysprices = days[i];
				Arrays.sort(todaysprices);
				spending += todaysprices[0];
			} else {
				int[] lastprices = days[i%7];
				for (int j=0; j<prices[0].length(); j++)
					days[i%7][j] = days[i%7][j] + prices[i].charAt(j)-'0';
				int[] totalprices = days[i%7];
				Arrays.sort(lastprices);
				Arrays.sort(totalprices);
				int previous = lastprices[0];
				int current = totalprices[0];
				spending += current-previous; 
			}
			//check the plate chosen the week before (if not first week)
			// decide on the new plate and detract the amount based on last week choice
			// add amount on this week choice
		}
		return i-1;
	}
	
	public static void main(String[] args) {
		MysteriousRestaurant restaurant = new MysteriousRestaurant();
		String[] prices = {"Dear", "Code", "rsHa", "veFu", "nInT", "heCh", "alle", "ngeP", "hase", "andb", "ecar", "eful"};
		int budget = 256;
		System.out.println(restaurant.maxDays(prices, budget));
	}

}
