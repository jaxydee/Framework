package org.matrix;

public class TwoDarray {
public static void main(String[] args) {
	int [][] a=new int [2][2];
	a [0][0]=11;
	a[0][1]=22;
	a[1][0]=33;
	a[1][1]=44;

	int length = a.length;
	System.out.println(length);
	System.out.println(a[1][1]);
	System.out.println("-------------------");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[i][j]);
			System.out.println("-------------------");
		}
		for (int[] is : a) {
			for (int j : is) {
				System.out.println(j);
			}
		}
		
	}
	
}
}
