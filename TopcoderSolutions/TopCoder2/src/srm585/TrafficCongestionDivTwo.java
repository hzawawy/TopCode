package srm585;

public class TrafficCongestionDivTwo {

	public long theMinCars(int treeHeight){
		long ans = 0;
		double d = Math.pow(2, new Double(treeHeight+1))-1;
		if (d%3==0)
			ans = (long)d/3;
		else 
			ans = ((long)d/3) + 1;
		return ans;
	}
	
	public static void main(String[] args) {
		TrafficCongestionDivTwo traffic = new TrafficCongestionDivTwo();
		int treeHeight = 53;
		System.out.println(traffic.theMinCars(treeHeight));
	}

}
