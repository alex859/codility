package org.alex859.codility;
import java.util.HashMap;
import java.util.Map;

/*
A string is a palindrome if it has exactly the same sequence of characters when read left-to-right as it has when read right-to-left. For example, the following strings are palindromes:
"kayak",
"codilitytilidoc",
"neveroddoreven".
A string A is an anagram of a string B if A can be obtained from B by rearranging the characters. For example, in each of the following pairs one string is an anagram of the other:
"mary" and "army",
"rocketboys" and "octobersky",
"codility" and "codility".
Write a function:
class Solution { public int solution(String S); }
that, given a non-empty string S consisting of N characters, returns 1 if S is an anagram of some palindrome and returns 0 otherwise.
Assume that:
N is an integer within the range [1..100,000];
string S consists only of lower-case letters (a−z).
For example, given S = "dooernedeevrvn", the function should return 1, because "dooernedeevrvn" is an anagram of the palindrome "neveroddoreven". Given S = "aabcba", the function should return 0.
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
*/

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
