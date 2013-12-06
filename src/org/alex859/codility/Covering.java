package org.alex859.codility;

import java.util.Random;
/*
A non-empty zero-indexed array A consisting of N integers is given. The first covering prefix of array A is the smallest integer P such that 0≤P<N and such that every value that occurs in array A also occurs in sequence A[0], A[1], ..., A[P].
For example, the first covering prefix of the following 5−element array A:
A[0] = 2  A[1] = 2  A[2] = 1
A[3] = 0  A[4] = 1
is 3, because sequence [ A[0], A[1], A[2], A[3] ] equal to [2, 2, 1, 0], contains all values that occur in array A.
Write a function
class Solution { public int solution(int[] A); }
that, given a zero-indexed non-empty array A consisting of N integers, returns the first covering prefix of A.
Assume that:
N is an integer within the range [1..1,000,000];
each element of array A is an integer within the range [0..N−1].
For example, given array A such that
A[0] = 2  A[1] = 2  A[2] = 1
A[3] = 0  A[4] = 1
the function should return 3, as explained above.
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
*/
public class Covering {
	public int solution(int[] A) {
        int P=0;
        int N=A.length;
        int[] foundValues=new int[N];
        
        for(int i=0;i<N;i++){
        	if(foundValues[A[i]]==0){
        		//i found an new value, this could be a solution
        		P=i;
        	}
        	
        	foundValues[A[i]]++;
        }
        
        return P;
    }
	
	public static void main(String[] args) {
		Covering c=new Covering();
		int[] A=new int[]{};
		Random rnd=new Random();
		int N=1000000;
		int[] A1=new int[N];
		for(int i=0;i<N;i++){
			A1[i]=rnd.nextInt(20);
			//System.out.print(A1[i]+" ");
		}
		System.out.println();
		System.out.println(c.solution(A1));
	}
	
	

}
