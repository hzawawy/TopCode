package srm511;

import java.util.Arrays;

public class Zoo {

	public long theCount(int[] answers){
		long combinations = 2;
		Arrays.sort(answers);
		for (int i=0; i<answers.length; i++){
			if (i<answers.length-2){
				if ((answers[i]==answers[i+1]) && (answers[i+1]==answers[i+2]))
					return 0;
			}
		}
		for (int i=answers.length-1; i>=0; i--){
			if (answers[i])
		}
		for (int i=0; i<answers.length-1; i++){
			if (answers[i]==answers[i-1]){
				
			}
		}
		return combinations;
	}
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		int[] answers = {0, 1, 2, 3, 4};
		System.out.println(zoo.theCount(answers));
	}

}
