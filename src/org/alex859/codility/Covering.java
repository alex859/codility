package org.alex859.codility;

import java.util.Random;

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
