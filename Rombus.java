package com.patterns.first;

import java.util.Scanner;

public class Rombus {
	public static void main(String[] args) {
		System.out.println("enter the number of rows");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int k=1;k<=num-i+1;k++) {
				System.out.print(" ");
				} 
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		for(int i=2;i<=num;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
				}
			for(int j=1;j<=(2*(num-i+1)-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		
			
	}
scan.close();
 }
}
