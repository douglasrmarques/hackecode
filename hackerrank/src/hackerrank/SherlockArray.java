package hackerrank;

import java.util.Scanner;

public class SherlockArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfTests = in.nextInt();
		
		for (int i = 0; i < numberOfTests; i++) {
			String result = "NO";
			
			int arrSize = in.nextInt();
			int[] arr = new int[arrSize];
			
			int rightSum = 0;
			
			for(int j = 0; j < arrSize; j++){
				arr[j] = in.nextInt();
				rightSum += arr[j];
			}
			
			int leftSum = 0;
			
			for(int _i = 0; _i < arrSize; _i++){
				rightSum -= arr[_i];
				
				if(rightSum == leftSum){
					result = "YES";
					break;
				} else {
					leftSum += arr[_i];
				}
			}
			System.out.println(result);
		}
	}

}