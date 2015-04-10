package org.alex859.codility;

import java.util.Random;


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
