package com.demo.service;

public class Searchservice {

	public static int FindIndex(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int FindIndexBinery(int[] arr, int i) {
		int low=0,high=arr.length-1;
		int mid=(low+high)/2;
	while(low<=high) {
			if(arr[mid]==i) {
				return mid;
				
			}
			else if(arr[mid]<i) {
				low=mid+1;
				mid=(low+high)/2;
			}
			else {
				high=mid-1;
				mid=(low+high)/2;
			}
		}
		return -1;
	}

	public static int FindIndexBineryrec(Integer[] arr, int low, int high, int num) {
		int l=low;
		int h=high;
		if(l<=h) {
			int mid=(l+h)/2;
			//check whether the number is at mid position
			if(arr[mid]==num) {
				//number found
				return mid;
			}else if(num<arr[mid]) {
				return FindIndexBineryrec(arr, l, mid-1, num);
			}else {
				return FindIndexBineryrec(arr, mid+1, h, num);
			}
		}
			//number not found
		return -1;
	
	}
}
