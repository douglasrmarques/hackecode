package hackerrank.varargs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Add {

	public void add(int ...value) {
		String result = "";
		int sum = 0;
		int count = 1;

		for(int number : value){
			sum += number;
			
			if(count == value.length){
				result += String.valueOf(number) + "=";
				break;
			}
			
			result += String.valueOf(number) + "+";
			count++;
		}
		
		System.out.printf("%s%d\n", result, sum);
	}

}

public class Solution {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int value1 = Integer.parseInt(br.readLine());
			int value2 = Integer.parseInt(br.readLine());
			int value3 = Integer.parseInt(br.readLine());
			int value4 = Integer.parseInt(br.readLine());
			int value5 = Integer.parseInt(br.readLine());
			int value6 = Integer.parseInt(br.readLine());

			Add addSum = new Add();
			addSum.add(value1, value2);
			addSum.add(value1, value2, value3);
			addSum.add(value1, value2, value3, value4, value5);
			addSum.add(value1, value2, value3, value4, value5, value6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
