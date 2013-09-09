package srm511;

public class GameOfLifeDivTwo {

	public String theSimulation(String initial, int T){
		StringBuilder init = new StringBuilder(initial);
		StringBuilder current = new StringBuilder();
		int N = init.length();
		for (int i=0; i < T; i++){
			current = new StringBuilder();
			for (int j=0; j<init.length(); j++){
				int c1 = (init.charAt((j-1+N)%N)-'0');
				int c2 = (init.charAt((j+N)%N)-'0');
				int c3 = (init.charAt((j+1+N)%N)-'0');
				if ((c1+c2+c3)>=2)
					current.append('1');
				else
					current.append('0');					
			}
			init = current;
		}
		return init.toString();
	}
	
	public static void main(String[] args) {
		GameOfLifeDivTwo game = new GameOfLifeDivTwo();
		String init = "110010000010111110010100001001";
		int T = 1000;
		System.out.println(game.theSimulation(init, T));
	}

}
