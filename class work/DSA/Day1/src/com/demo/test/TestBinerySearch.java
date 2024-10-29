package com.demo.test;

import com.demo.service.Searchservice;

public class TestBinerySearch {

	public static void main(String[] args) {
		int[] arr= {2,5,20,40,45,50,64,81};
		int a= Searchservice.FindIndexBinery(arr,45);
		if(a!=-1) {
			System.out.println("number find at "+a +" index");
		}
		else {
			System.out.println("number not found");
		}

	}

}
