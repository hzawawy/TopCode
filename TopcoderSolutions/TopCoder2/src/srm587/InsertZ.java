package srm587;

public class InsertZ {

	public String canTransform(String init, String goal){
		StringBuilder ans = new StringBuilder();
		for (int i=0; i<goal.length(); i++){
			if (goal.charAt(i)!='z')
				ans.append(goal.charAt(i));
		}
		if (ans.toString().equals(init))
			return "Yes";
		else
			return "No";
	}
	
	public static void main(String[] args) {
		InsertZ insertz = new InsertZ();
		String init = "a";
		String goal = "z";
		System.out.println(insertz.canTransform(init, goal));
	}

}
