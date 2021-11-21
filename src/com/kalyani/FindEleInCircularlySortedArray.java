package com.kalyani;

public class FindEleInCircularlySortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {8,9,10,2,5,6};
		int target = 10;
		System.out.println(search(nums,target));

	}
	static int search(int a[],int target)
	{
		int start = 0;
		int end = a.length-1;
		while(start <= end)
		{
			int mid = start + (end-start)/2;
			if(target == a[mid])
				return mid;
			if(a[mid] <= a[end])
			{
				if(target > a[mid] && target <= a[end])
					start = mid + 1;
				else
					end = mid - 1;
			}
			else
			{
				if(target >= a[start] && target <= a[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}

}
