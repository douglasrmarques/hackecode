package hackerrank.towerbreakers;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	private static String PLAYER_ONE = "1";
	private static String PLAYER_TWO = "2";

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		
		LinkedList<Integer> towerSizeMap = new LinkedList<>();
		
		int numOfTest = scr.nextInt();
		int numOfTower = 0;
		
		for (int i = 0; i < numOfTest; ++i) {
			numOfTower = scr.nextInt();
			
			for (int j = 0; j < numOfTower; j++) {
				towerSizeMap.add(j, scr.nextInt());
			}
			
			Solution.play(towerSizeMap);
		}
	}
	
	public static void play(final List<Integer> towerSizeMap){
		boolean hasWinner = false;
		
		int newHeight = 0;
		int towerHeight = 0;
		int round = 1;
		
		while(!hasWinner){
			newHeight = towerSizeMap.get(0) - 1;
			
			if(newHeight == 0){
				towerSizeMap.remove(towerHeight);
			} else {
				towerSizeMap.add(towerHeight, newHeight);
			}
			
			hasWinner = Solution.hasWinner(towerSizeMap, round);
			round++;
		}
	}
	
	public static boolean hasWinner(final List<Integer> towerSizeMap, final int round){
		if(towerSizeMap.isEmpty()){
			if((round%2)==0){
				System.out.println(PLAYER_TWO);
			} else {
				System.out.println(PLAYER_ONE);
			}
			return true;
		}
		return false;
	}
	
}
