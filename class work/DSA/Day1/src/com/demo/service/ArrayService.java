package com.demo.service;

public class ArrayService {

	public static int findMin( int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}	
		return max;
	}

	public static int findSecondMin(int[] arr) {
		int min,smin;
		if(arr[0]<arr[1]) {
			min=arr[0];
			smin=arr[1];		
		}
		else {
			min=arr[1];
			smin=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(min>arr[i]) {
				smin=min;
				min=arr[i];
				
			}
			else if(smin>arr[i] && min!=arr[i]){
				smin=arr[i];
			}
		}
		return smin;
	}

	public static int findSecondMax(int[] arr) {
		int max,smax;
		if(arr[0]>arr[1]) {
			max=arr[0];
			smax=arr[1];		
		}
		else {
			max=arr[1];
			smax=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(max<arr[i]) {
				smax=max;
				max=arr[i];
				
			}
			else if(smax<arr[i] && max!=arr[i]){
				smax=arr[i];
			}
		}
		return smax;
	}

	public static int findAdditionPrime(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			boolean a= isPrime(arr[i]);
			if(a) {
				
				sum+=arr[i];
			}
		}
		return sum;
	}

	private static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	
}
