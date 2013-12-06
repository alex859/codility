package org.alex859.codility;

import java.util.Random;
/*
 * A zero-indexed array a consisting of n integers is given. the average value of array a is defined as:
(a[0] + a[1] + ... + a[n−1]) / n
the deviation of element a[p] (where 0 ≤ p < n) is defined as |a[p] − m|, where m is the average value of array a.
element a[p] is called extreme if its deviation is maximal among all the elements of a.
for example, consider the following array a consisting of four elements:
  a[0] = 9    a[1] = 4    a[2] = -3    a[3] = -10
the average value of this array is (9 + 4 + (−3) + (−10)) / 4 = 0. the deviation of element a[2] is ((-3) - 0) = (0 - (-3)) = 3. the deviation of element a[3] is 10. it is an extreme element of array a, since no other element has a deviation greater than 10. there are no other extreme elements in this array.
write a function:
class solution { public int solution(int[] a); }
that, given a zero-indexed array a consisting of n integers, returns the index of an extreme element. if more than one extreme element exists, the function may return the index of any of them. if the array is empty (and hence no extreme element exists), the function should return −1.
for example, given array a shown above, the function should return 3, since a[3] is the only extreme element.
assume that:
n is an integer within the range [0..1,000,000];
each element of array a is an integer within the range [−2,147,483,648..2,147,483,647].
complexity:
expected worst-case time complexity is o(n);
expected worst-case space complexity is o(1), beyond input storage (not counting the storage required for input arguments).
elements of input arrays can be modified.
*
*/

public class Test1 {
	public int solution(int[] A) {
		int N=A.length;
		if(N==0) return -1;
		//compute the average value of A
		double M=0;
		for(int i=0;i<N;i++){
			M+=A[i];
		}
		M/=N;
		
		double maxDev=0;
		int maxI=0;
		//compute the standard deviation of each element of A
		for(int i=0;i<N;i++){
			double dev=Math.abs(A[i]-M);
			if(dev>maxDev){
				maxDev=dev;
				maxI=i;
			}
		}
		return maxI;
	}
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		int[] A=new int[]{9,4,-3,-10};
		Random rnd=new Random();
		int N=1000000;
		int[] A1=new int[N];
		for(int i=0;i<N;i++){
			A1[i]=-1*rnd.nextInt(Integer.MAX_VALUE);
			//System.out.print(A1[i]+" ");
		}
		System.out.println(t.solution(A1));
	}

}
