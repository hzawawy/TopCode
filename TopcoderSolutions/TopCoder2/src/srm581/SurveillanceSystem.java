package srm581;

import java.util.Arrays;

public class SurveillanceSystem {

	public String getContainerInfo(String containers, int[] reports, int L){
		StringBuilder monitored = new StringBuilder();
		Arrays.sort(reports);
		for (int i=0; i<containers.length(); i++)
			monitored.append('-');
		StringBuilder contiguous = new StringBuilder();
		int i=0;
		while (i<containers.length()){
			if (containers.charAt(i)=='X') {
				contiguous.append(containers.charAt(i));
			}
			else if ((containers.charAt(i)=='-') && (containers.length()>0)) {
				int max = 0;
				for (int j=0; j<reports.length; j++){
					if (reports[j]<L) 
						max = reports[j];
					else
						break;
				} 
				int l = (i-max+1 >= 0)? i-max+1 : 0;
				int r = (i+max+1 < containers.length()-1)? i+max : containers.length()-1; 
				for (int j=l; j<=r; j++ ){
					if (j==r)
						monitored.setCharAt(j, '+');
					else if (monitored.charAt(j)!='+') 
						monitored.setCharAt(j, '?');
				}
				
				contiguous = new StringBuilder();// reset contiguous
			}
			i++;
		}
		return monitored.toString();
	}
	
	public static void main(String[] args) {
		SurveillanceSystem surveillance = new SurveillanceSystem();
		String containers = "-X--XX";
		int[] reports = {1, 2};
		int L = 3;
		System.out.println(surveillance.getContainerInfo(containers, reports, L));
	}

}
