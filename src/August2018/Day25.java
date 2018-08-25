package August2018;

import java.util.Arrays;

/*
 * This problem was asked by Uber.
 * 
 * Given an array of integers, return a new array such that each element at 
 * index i of the new array is the product of all the numbers in the original array 
 * except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], 
 * the expected output would be [120, 60, 40, 30, 24]. 
 * 
 * If our input was [3, 2, 1], 
 * the expected output would be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 */

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1, 2, 3, 4, 5};
		int[] input2 = {3, 2, 1};
		int[] out = productArray(input);
		int[] out2= productArray(input2);
		
		System.out.println("Input: "+Arrays.toString(input));
		System.out.println("Output: "+Arrays.toString(out));
		System.out.println("\n");
		System.out.println("Input: "+Arrays.toString(input2));
		System.out.println("Output: "+Arrays.toString(out2));
	}
	
	public static int[] productArray(int[] in) {
		int[] out = new int[in.length];
		for( int i = 0; i < in.length; i++) {
			int product = 1;
			for( int j = 0; j < in.length; j++) {
				if( i == j ) {
					continue;
				}
				else if( j == 0 ) {
					product = in[j];
				}
				else {
					product = product*in[j];
				}
			}
			out[i] = product;
		}
		
		return out;
	}

}
