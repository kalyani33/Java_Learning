package com.kalyani;

public class Leetcode744 {

	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		int target = 'f';
		System.out.println(ceilingOfANumber(letters,target));
		//System.out.println(floringOfANumber(arr,target));
		

	}
	
	static char ceilingOfANumber(char letters[],int target) {
		 int start = 0;
	        int end = letters.length-1;
	        while(start<=end){ 
	        int mid = start + (end-start)/2;
	        if(target < letters[mid])
	        	 end = mid - 1;
	        else 
	            start = mid + 1;
	        }
	        return letters[start%letters.length];
	        
}
}
