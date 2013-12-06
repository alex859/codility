package org.alex859.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
Given an array A of N integers, we draw N discs in a 2D plane such that the I-th disc is centered on (0,I) and has a radius of A[I]. We say that the J-th disc and K-th disc intersect if J ≠ K and J-th and K-th discs have at least one common point.
Write a function:
int solution(int A[], int N);
that, given an array A describing N discs as explained above, returns the number of pairs of intersecting discs. For example, given N=6 and:
A[0] = 1  A[1] = 5  A[2] = 2 
A[3] = 1  A[4] = 4  A[5] = 0  
intersecting discs appear in eleven pairs of elements:
0 and 1,
0 and 2,
0 and 4,
1 and 2,
1 and 3,
1 and 4,
1 and 5,
2 and 3,
2 and 4,
3 and 4,
4 and 5.
so the function should return 11.
The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
Assume that:
N is an integer within the range [0..100,000];
each element of array A is an integer within the range [0..2147483647].
Complexity:
expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
*/
public class Discs {
	public int solution(int[] A) {
        int result=0;
        int N=A.length;
        for(int j=0;j<N-1;j++){
        	long disk1=j+A[j];
        	//System.out.println(j+" --> "+disk1);
        	for(int k=j+1;k<N;k++){
        		long disk2=k-A[k];
        		//System.out.println(k+" --> "+disk2);
        		if(disk2<=disk1){
        			//System.out.println(j+" "+k);
        			result++;
        			if(result>=10000000){
        				return -1;
        			}
        		}
        	}
        }
        return result;
    }
	
	public int solution2(int[] A) {
        int result=0;
        int N=A.length;
        ArrayList<Long> D1=new ArrayList<Long>();
        for(int i=0;i<N;i++){
        	D1.add((long)i-A[i]);
        }
        Collections.sort(D1);
        Long[] D=D1.toArray(new Long[]{});
        for(int i=0;i<N;i++){
        	long disk1=i+A[i];
        	int pos=binarySearch(D, disk1+1, 0, D.length-1);
        	if(pos<0){
        		pos=-1*pos;
        	}
        	result=result+pos-1;
        	if(result>10000000){
        		return -1;
        	}
        }
        return result/2;
    }
	
	private int binarySearch(Long[] A, long key, int minK, int maxK){
		
		int k=(minK+maxK)/2;
		if(A[k]==key){
			return k;
		}else{
			if(maxK>minK){
				if(key>A[k]){
					return binarySearch(A, key, k+1, maxK);
				}else{
					return binarySearch(A, key, minK, k-1);
				}
			}
		
		}
		return -1*k-1;
	}
	
	public static void main(String[] args) {
		Discs d=new Discs();
		int[] A=new int[]{1,5,2,1,4,0};
		Random rnd=new Random();
		int N=100;
		int[] A1=new int[N];
		for(int i=0;i<N;i++){
			A1[i]=rnd.nextInt(2147483647);
			//System.out.print(A1[i]+" ");
		}
		System.out.println(d.solution2(A));
	}

}
