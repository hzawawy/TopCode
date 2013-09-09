package srm513;

public class TrainingCamp {

	public String[] determineSolvers(String[] attendance, String[] problemTopics) {
		StringBuilder[] studentProb = new StringBuilder[attendance.length];
		for (int i=0; i<attendance.length; i++){
			studentProb[i] = new StringBuilder();
			for (int j=0; j<problemTopics.length; j++){
				boolean pass = true;
				for (int k=0; k<problemTopics[j].length(); k++){
					if ((problemTopics[j].charAt(k)=='X') && (attendance[i].charAt(k)!='X')) {
						pass = false;
						break;					
					}
				}
				if (pass)
					studentProb[i].append('X');
				else 
					studentProb[i].append('-');
			}
		}
		
		String[] studentProbStrings = new String[attendance.length];
		for (int i=0; i<attendance.length; i++)
			studentProbStrings[i] = studentProb[i].toString();
		return studentProbStrings;
	}
	
}
