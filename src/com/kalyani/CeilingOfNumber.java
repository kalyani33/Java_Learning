package com.kalyani;

public class CeilingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		int target = 4;
		System.out.println(ceilingOfANumber(arr,target));
		System.out.println(floringOfANumber(arr,target));
		

	}
	
	static int ceilingOfANumber(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start] < arr[end];
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target)
				return arr[mid];
			if(isAsc)
			{
				if(arr[mid] < target)
					start = mid + 1;
				else
					end = mid -1;
			}
			else {
				if(arr[mid] > target)
					start = mid + 1;
				else
					end = mid -1;
			}
		}
		return arr[start];
	}
	
	static int floringOfANumber(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start] < arr[end];
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target)
				return arr[mid];
			if(isAsc)
			{
				if(arr[mid] < target)
					start = mid + 1;
				else
					end = mid -1;
			}
			else {
				if(arr[mid] > target)
					start = mid + 1;
				else
					end = mid -1;
			}
		}
		return arr[end];
	}

}
