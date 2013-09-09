package TCHSsrm64;

public class PaternityScandal {

	public 	int getFamily(String[] femaleGeneticTest, String[] maleGeneticTest, String[] personalityTest){
		int num = 0;
		int[][] A = new int[maleGeneticTest.length][femaleGeneticTest.length];
		for (int i=0; i<personalityTest.length; i++){
			for (int j=0; j<personalityTest[i].length(); j++){
				if (personalityTest[i].charAt(j)=='Y'){
					A[i][j] = 2;
					for (int k=0; k<maleGeneticTest[i].length(); k++){
						
					}
				}
				
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		PaternityScandal paternity = new PaternityScandal();
		String[] femaleGeneticTest = {"NYYYN","YYYYY"};
		String[] maleGeneticTest = {"NNYNY","YYYYN"};
		String[] personalityTest = {"YN","NY"};
		System.out.println(paternity.getFamily(femaleGeneticTest, maleGeneticTest, personalityTest));
	}

}
