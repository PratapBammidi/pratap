/**
 * programs to use data types
 * @author Pratap
 * @since 27th July 2023
 */



package com.techzenure.day2;

public class DataTypes {

	public static void main(String[] args) {
//  Programs using byte, Short, int and long
		byte b = -128;
		System.out.println(b);
		b = 12;
		System.out.println(b);
		b = 0127;
		System.out.println(b);
		b = (byte) 128;
		System.out.println(b);
		short s = 98;
		System.out.println(s);
		s = (short)327684;
		System.out.println(s);
		int i = 258;
		System.out.println(i);
		i = (Integer)549626495;
		System.out.println(i);
		long nan = 8074817115l;
		System.out.println(nan);
		
//		Programs using Boolean data type
		
		int a = 25 ;
		int c = 58 ;
		
		boolean result = a>c;
		System.out.println(result);
		
		int x = 102;
		int y = 201;
		boolean result1 = x==y;
		System.out.println(result1);
		
		int e = 41;
		int f = 412;
		boolean val = e!=f;
		System.out.println(val);
		
//		Programs using Real types
		
		float vall = 39.39f;
		 System.out.println("my value = "+ vall);
		 float num = (float)78.654;
		 System.out.println("this is my num =" + num);
		 double vale = 76.46;
		 System.out.println(vale);
		 
//		 Programs using Character data type
		 
		 char b1 = 'B';
			System.out.println(b1);
			
			b1 = 66;//implici typecasting
			System.out.println(b1);
			


	}

}
