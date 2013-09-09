package srm516;

public class NetworkXZeroOne {

	public String reconstruct(String message){
		StringBuilder ans = new StringBuilder();
		boolean startO = false, startX = false;
		for (int i =0; i<message.length(); i++){
			if (message.charAt(i)=='o'){
				if (i%2==0) 
					startO = true;
				else
					startX = true;
				break;
			}
			else if (message.charAt(i)=='x'){
				if (i%2==0) 
					startX = true;
				else 
					startO = true;
				break;
			}
		}
		for (int i=0; i<message.length(); i++){
			if (startO){
				if (i%2==0)
					ans.append('o');
				else 
					ans.append('x');					
			} else {
				if (i%2==0)
					ans.append('x');
				else 
					ans.append('o');									
			}
		}
		return ans.toString();
	}
	
	public static void main(String[] args) {
		NetworkXZeroOne network = new NetworkXZeroOne();
		String message = "???????x";
		System.out.println(network.reconstruct(message));
	}

}
