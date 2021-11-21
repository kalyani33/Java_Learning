package com.kalyani;

public class NumberOfTimesTheArrayIsRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,13,14,20,2,4,5,6,8,9};
		System.out.println(search(a));

	}
	static int search(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
		if(arr[start] <= arr[end])
			return start;
		int mid = start + (end-start)/2;
		int next = (mid+1)%arr.length;
		int prev = (mid-1+arr.length) % arr.length;
		if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
			return mid;
		else if(arr[mid] <= arr[end])
			end = mid-1;
		else if(arr[mid] >= arr[end])
			end = mid + 1;
	}
	return -1;

}
}
