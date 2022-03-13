package org.matrix;

public class Sample {
public static void main(String[] args) {
	int s[]= new int[11];
	s[1]=20;
	s[2]=30;
	s[3]=40;
	s[4]=50;
	s[5]=60;
	s[6]=70;
	s[7]=80;
	s[8]=90;
	s[9]=20;
	s[10]=50;
	
	int length = s.length;
	System.out.println(length);
	
	System.out.println(s[8]);
	System.out.println("==============");
	for (int i = 0; i < 11; i++) {
		
			System.out.println(s[i]);
			
}
	System.out.println("==============");
	
	for (int i : s) {
		System.out.println(i);
		
	}
	}
	
}

