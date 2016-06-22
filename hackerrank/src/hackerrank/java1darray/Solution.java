package hackerrank.java1darray;

import java.util.Scanner;

public class Solution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		Solution.getCountNegativeCountiguosArray(arr);
		Solution.getSumOfLargestSubSet(arr);
	}

	/**
	 * @author Douglas Marques
	 * 
	 *         Find the largest subset in a N arrays of ints.
	 * 
	 *         Sample Input 9 −2 1 −3 4 −1 2 1 −5 4
	 * 
	 *         Sample Output Sum: 6 Subset: 4, −1, 2, 1
	 * 
	 */
	public static int getSumOfLargestSubSet(int[] arr) {
		int length = arr.length;
		int largestSum = 0;
		int sum = 0;

		for (int j = 0; j < length; j++) {
			for (int i = j; i < length; i++) {
				sum += arr[i];

				if (arr[i] > largestSum) {
					largestSum = arr[i];
				}
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
			sum = 0;
		}
			
		System.out.printf("The largest sum of a subset is: %d\n", largestSum);

		return largestSum;
	}

	/**
	 * 
	 * @author Douglas Marques
	 * 
	 *         Array is a very simple data structure which is used to store a
	 *         collection of data, for example roll number of all the students
	 *         in a class or name of all the countries in the world. To create
	 *         an array of integer that can hold 10 values, you can write code
	 *         like this:
	 * 
	 *         int[] myList = new int[10]; This problem will test your knowledge
	 *         on java array. You are given an array of integers. A sub-array is
	 *         "Negative" if sum of all the integers in that sub-array is
	 *         negative. Count the number of "Negative sub-arrays" in the input
	 *         array.
	 * 
	 *         Note: Subarrays are contiguous chunks of the main array. For
	 *         example if the array is {1,2,3,5} then some of the subarrays are
	 *         {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. But {1,2,5} is not an
	 *         subarray as it is not contiguous.
	 * 
	 *         Input Format The first line consists an integer. The next line
	 *         will contain space separated integers. Value of n will be at most
	 *         100. The numbers in the array will range between -10000 to 10000.
	 * 
	 *         Output Format Print the answer to the problem.
	 * 
	 *         Sample Input 5 1 -2 4 -5 1
	 * 
	 *         Sample Output 9
	 */
	public static int getCountNegativeCountiguosArray(int[] arr) {
		int numberOfNegArray = 0;
		int arrLength = arr.length;
		int loopCount = 0;
		int sum = 0;

		do {
			sum = 0;
			for (int i = loopCount; i < arrLength; i++) {
				sum += arr[i];

				if (sum < 0) {
					numberOfNegArray++;
				}
			}

			loopCount++;
		} while (loopCount < arrLength);

		System.out.printf("The number of negative contiguos arrays is: %d \n", numberOfNegArray);
		return numberOfNegArray;
	}

}
