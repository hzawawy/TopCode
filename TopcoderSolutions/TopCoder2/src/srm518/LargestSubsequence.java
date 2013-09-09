package srm518;

public class LargestSubsequence {

	public String getLargest(String s){
		StringBuilder ans = new StringBuilder();
		int cnt =0, i=0;
		while (i<s.length()){
			for (i = cnt;i<s.length(); i++ ){
				if (s.charAt(i)>s.charAt(cnt))
					cnt = i;
			}
			ans.append(s.charAt(cnt));
			cnt++;
			i = cnt;
		}
		return ans.toString();
	}
	
	public static void main(String[] args) {
		LargestSubsequence subseq = new LargestSubsequence();
		String s = "aquickbrownfoxjumpsoverthelazydog";
		System.out.println(subseq.getLargest(s));
	}

}
