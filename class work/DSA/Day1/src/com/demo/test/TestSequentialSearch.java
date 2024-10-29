package com.demo.test;

import com.demo.service.Searchservice;

public class TestSequentialSearch {
	public static void main(String[] args) {
		int[] arr= {7,154,13,29,4,15,31,41,54,52,4,70};
		int a= Searchservice.FindIndex(arr,52);
		if(a!=-1) {
			System.out.println("number find at "+a +" index");
		}
		else {
			System.out.println("number not found");
		}
	}
	
}
