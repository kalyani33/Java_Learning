package com.kalyani;

public class OrderAgnosticsBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 32;
		int[] arr = {99,89,32,10,7,5,3};
		System.out.println(oderAgnosticBS(arr,target));

	}
	static int oderAgnosticBS(int[] arr,int target) {
		int start=0;
		int end = arr.length-1;
		//find whether the arr is sorted in ascending or decending order
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			int mid = start +(end-start)/2;
			if(arr[mid] == target)
				return mid;
			if(isAsc) {
				if(target > arr[mid])
					start = mid + 1;
				else
					end = mid -1;
			}
			else {
				if(target < arr[mid])
					start = mid + 1;
				else
					end = mid -1;
			}
		}
		return -1;
	}

}
