package srm413d2;

public class Subway2 {

	public double minTime(int length, int maxAcceleration, int maxVelocity){
		double t = Math.sqrt(new Double(length)/new Double(maxAcceleration));
		double v = new Double(length)/t;
		if (v<=new Double(maxVelocity)){
			return 2*t;
		} else {
			double t1 = new Double(maxVelocity)/new Double(maxAcceleration);
			double d1 = new Double(maxAcceleration)*(Math.pow(t1,2));
			double d2 = new Double(length)-d1;
			double t2 = d2/new Double(maxVelocity);
			return (2*t1+t2);
		}
	}
	
	public static void main(String[] args) {
		Subway2 subway = new Subway2();
		int length = 1;
		int maxAcceleration = 10; 
		int maxVelocity = 1;
		System.out.println(subway.minTime(length, maxAcceleration, maxVelocity));
		
	}

}
