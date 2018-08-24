package August2018;

import java.util.HashMap;

/*
 * 2 sum problem
 * 
 * This problem was recently asked by Google.
 * 
 * Given a list of numbers and a number k, 
 * return whether any two numbers from the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * 
 * Bonus: Can you do this in one pass?
 */

public class Day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {10, 15, 3, 7};
		int k = 17;
		boolean ret = findSum(input, k);
		boolean ret2= findSumOnePass(input, k);
		System.out.println("Found Sum 2 forloops: "+ret);
		System.out.println("Found Sum 1 pass: "+ret2);
		
	}
	
	public static boolean findSumOnePass(int[] in, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for( int i = 0; i < in.length; i++) {
			if( map.containsKey(k-in[i]) ) {
				System.out.println("I: "+in[i]+", J: "+(k-in[i])+", K: "+k);
				return true;
			}
			else {
				map.put(in[i], in[i]);
			}
		}
		return false;
	}
	
	public static boolean findSum(int[] in, int k) {
		for( int i = 0; i < in.length; i++) {
			for(int j = i+1; j < in.length; j++) {
				if( in[i]+in[j] == k) {
					System.out.println("I: "+in[i]+", J: "+in[j]+", K: "+k);
					return true;
				}
			}
		}
		return false;
	}

}
