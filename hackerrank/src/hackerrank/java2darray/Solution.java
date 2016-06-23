package hackerrank.java2darray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {

	/**
	 *  You are given lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in position of line.

		Take your input from System.in.
		
		Input Format
		The first line has an integer . In each of the next lines there will be an integer denoting number of integers on that line and then there will be space-separated integers. In the next line there will be an integer denoting number of queries. Each query will consist of two integers and .
		
		Each number will fit in signed integer.
		Total number of integers in lines will not cross 100000.
		
		Output Format
		In each line, output the number located in position of line. If there is no such position, just print "ERROR!"
		
		Sample Input
		5
		5 41 77 74 22 44
		1 12
		4 37 34 36 52
		0
		3 20 22 33
		5
		1 3
		3 4
		3 1
		4 3
		5 5
		
		Sample Output
		74
		52
		37
		ERROR!
		ERROR!
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numOfArray = sc.nextInt();
		int sizeArray = 0;
		
		HashMap<Integer, List<Integer>> mapOfArrays = new HashMap<>();
		
		for (int i = 0; i < numOfArray; i++) {
			sizeArray = sc.nextInt();
			
			List<Integer> tempList = new ArrayList<>();
			tempList.add(0, sizeArray);
									
			for (int j = 1; j <= sizeArray; j++) {
				tempList.add(j, sc.nextInt());
			}

			mapOfArrays.put(i, tempList);
		}
		
		int numOfTest = sc.nextInt();
		List<Integer> lstOfCoordinate = new ArrayList<>();
		
		for (int i = 0; i < numOfTest; i++) {
			for (int j = 0; j < 2; j++) {
				lstOfCoordinate.add(j, sc.nextInt());
			}
			
			int x = lstOfCoordinate.get(0);
			int y = lstOfCoordinate.get(1);
			
			if(mapOfArrays.containsKey(x-1)){
				List<Integer> listToTest = mapOfArrays.get(x-1);
				
				if(listToTest.size() >= (y + 1)){
					System.out.printf("%d", listToTest.get(y));
				} else {
					System.out.printf("%s\n", "ERROR!");
				}
			} else {
				System.out.printf("%s\n", "ERROR!");
			}
		}
	}
}
