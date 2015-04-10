package org.alex859.codility;
import java.util.HashMap;
import java.util.Map;


public class Test2 {
	
	public int solution(String S) {
		//count the occurrences of each letter in S
		Map<Character,Integer> occ=new HashMap<Character, Integer>();
		for(int i=0;i<S.length();i++){
			char c=S.charAt(i);
			Integer n=occ.get(c);
			if(n==null){
				n=0;
			}
			n++;
			occ.put(c, n);
		}
		//check if there is at most one character that occurs a odd number of times
		int count=0;
		for(Integer n:occ.values()){
			if(n%2!=0){
				count++;
			}
			if(count>1){
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		
		String a="neveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddorevenneveroddoreven";
		System.out.println(t.solution(a));
		
	}

}
