package hackerrank;

import java.util.Scanner;

public class IcecreamParlor {
		
	private static void printArray(int[][] ar) {
		for(int i = 0; i < ar.length; i++){
			for(int j = 0; j < 2; j++){
				System.out.print(String.valueOf(ar[i][j]) + " ");
			}	
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();
		
		int[][] resultList = new int[numTests][2];
		
		for(int i = 0; i < numTests; i++){
			boolean checked = false;
			int amount = in.nextInt();
			int numberOfFlavors = in.nextInt();
			int[] flavorsPrice = new int[numberOfFlavors];
			
			for(int j = 0; j < numberOfFlavors; j++){
				flavorsPrice[j] = in.nextInt();
			}
			
			for(int _i = 0; _i < flavorsPrice.length; _i++){
				if(!checked){
					for(int _j = 0; _j < flavorsPrice.length; _j++){
						if (_i != _j && (flavorsPrice[_i] + flavorsPrice[_j]) == amount) {
							resultList[i][0] = _i + 1;
							resultList[i][1] = _j + 1;							
							
							checked = true;
							
							break;
						} else {
							checked = false;
						}
					}
				} else {
					break;
				}
			}
		}
		printArray(resultList);
	}

}
