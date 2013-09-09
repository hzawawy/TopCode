package srm585;

public class LISNumberDivTwo {

	public int calculate(int[] seq) {
		int min = 1, cur = seq[0];
		for (int i =1; i<seq.length; i++){
			if (seq[i]<=cur){
				min++;
			}
			cur = seq[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		LISNumberDivTwo lis = new LISNumberDivTwo();
		int[] seq ={42};//{50, 40, 30, 20, 10};// {1, 1, 9, 9, 2, 2, 3, 3};//{5, 8, 9, 12, 16, 32, 50};// {10,20,10};//{1, 4, 4, 2, 6, 3};		
		System.out.println(lis.calculate(seq));
	}

}
