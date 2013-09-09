package srm515;

public class RotatedClock {

	public String getEarliest(int hourHand, int minuteHand){
		int angleDiff = Math.abs((hourHand-minuteHand));
		int hours = 0, minutes = angleDiff;
		for (int i=0; i<360; i++){
			double hours12 = new Double(hours)/30;
			int hours12h = hours/30;
			double remainder = hours12-hours12h;
			int minutesFromHours = (int)Math.round(remainder*359);
			if ((minutesFromHours-minutes)==0) {
				int minutes60M = minutes/6;
					String hrs = ("00"+hours12h);
					String mnts = ("00"+minutes60M);
					hrs = hrs.substring(hrs.length()-2, hrs.length());
					mnts = mnts.substring(mnts.length()-2, mnts.length());
					return hrs+":"+mnts;
			}
			hours = (hours+1)%360;
			minutes = (minutes+1)%360;
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		RotatedClock clock = new RotatedClock();
		int hourHand = 70;
		int minuteHand = 300;
		System.out.println(clock.getEarliest(hourHand, minuteHand));
	}

}
