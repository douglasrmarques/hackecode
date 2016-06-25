package hackerrank.javalist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	/**
	 * Given a list, , of integers, perform queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

		Input Format
		
		The first line contains an integer, (the initial number of elements in ).
		The second line contains space-separated integers describing .
		The third line contains an integer, (the number of queries).
		The subsequent lines describe the queries, and each query is described over two lines:
		    If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value must be inserted into at index .
		    If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
		
		Each element in is a 32-bit integer.
		
		Output Format
		Print the updated list as a single line of space-separated integers.
		
		Sample Input
		5
		12 0 1 78 12
		2
		Insert
		5 23
		Delete
		0
		
		Sample Output
		0 1 78 12 23
	 */
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		
		int sizeOfList = scr.nextInt();
		List<Integer> lstOfInt = new ArrayList<>();
		
		for (int i = 0; i < sizeOfList; i++) {
			lstOfInt.add(i, scr.nextInt());
		}
		
		int numOfTestCase = scr.nextInt();
		int index = 0;
		int valueToInsert = 0;
		
		String testCase = "Insert";
		
		for (int i = 0; i < numOfTestCase; i++) {
			if(scr.next().equals(testCase)){
				// insert element
				index = scr.nextInt();
				valueToInsert = scr.nextInt();
				
				if(index <= sizeOfList){
					lstOfInt.add(index, valueToInsert);
				}
			} else {
				// delete element
				index = scr.nextInt();
				if(index <= sizeOfList){
					lstOfInt.remove(index);
				}
			}
		}
		
		// Print stdout
		for (Integer integer : lstOfInt) {
			System.out.print(String.valueOf(integer) + " ");
		}
	}
	
}
