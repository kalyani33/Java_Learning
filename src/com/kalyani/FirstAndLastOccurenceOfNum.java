package com.kalyani;

import java.util.Arrays;

public class FirstAndLastOccurenceOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,5,5,6,6,8,9,9,9};
		int target = 5;
		int[] ans = {-1,-1};
		ans[0] = binarySearch(nums,target,true);
		ans[1] = binarySearch(nums,target,false);
		System.out.println(Arrays.toString(ans));

	}
	static int binarySearch(int arr[],int target,boolean isFirstOccurence)
	{
		int start = 0;
		int end = arr.length-1;
		int res = -1;
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			if(arr[mid] == target)
			{
				res = mid;
				if(isFirstOccurence)
					end = mid-1;
				else
					start = mid+1;
			}
			else if(target > arr[mid])
				start = mid+1;
			else
				end = mid-1;
			
		}
		return res;
	}

}
