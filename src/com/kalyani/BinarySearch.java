package com.kalyani;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 99;
		int[] arr = {-18,-9,0,12,23,34,45,67,99,100};
		System.out.println(binarySearch(arr,target));

	}
	
	static int binarySearch(int[] arr, int target) {
		int start =0;
		int end = arr.length -1;
		while(start <= end)
		{
			//int mid = (start + end)/2;
			int mid = start +(end-start)/2;
			if(target < arr[mid])
				end = mid-1;
			else if(target > arr[mid])
				start = mid +1;
				else
				return mid;
		}
		return -1;
	}

}
