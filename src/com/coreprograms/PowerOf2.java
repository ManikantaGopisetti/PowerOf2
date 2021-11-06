package com.coreprograms;
import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter n value = ");
		int n = scan.nextInt();
		
		if (n>0&&n<31) {	//Only works if 0 <= N < 31 since 2^31 overflows an int
			int i=0;
			for(i=0;i<=n;i++) {
				int power = (int)Math.pow(2, i);
				System.out.println("2^"+i+"="+power);
			}
		}
		else {
			System.out.println("enter value less than 31 as the given value exceeds int range");
		}
		
	}
	

}
