package com.demo.test;

import java.util.Scanner;

import com.demo.services.ShapeServices;

public class TestShape {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int count=0;
		for(int i=0;i<3;i++) {
			System.out.println("1.Trigngle\n2.Circle\n3.RTrangle");
			count=sc.nextInt();
			ShapeServices.acceptData();
		}
	}

}
