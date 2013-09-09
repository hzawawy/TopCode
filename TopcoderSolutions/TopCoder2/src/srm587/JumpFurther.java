package srm587;

public class JumpFurther {

	public int furthest(int N, int badStep){
		int curPos = 0;
		for (int i=1; i<=N; i++){
			if ((curPos+i)==badStep)
				curPos += i-1;
			else 
				curPos += i;
		}
		return curPos;
	}
	
	public static void main(String[] args) {
		JumpFurther jump = new JumpFurther();
		int N  = 1;
		int badStep = 1;
		System.out.println(jump.furthest(N, badStep));
	}

}
