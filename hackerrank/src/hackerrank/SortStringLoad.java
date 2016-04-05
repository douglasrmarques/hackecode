package hackerrank;

import java.util.Scanner;

public class SortStringLoad {

	public static void b_insertIntoSorted(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			insertIntoSortedArray(ar, i);
		}
	}

	public static void insertIntoSortedArray(int[] ar, int i) {
		int n = ar[i];
		i--;
		while (i >= 0 && ar[i] > n) {
			ar[i + 1] = ar[i]; // shift right
			i--;
		}
		
		ar[i + 1] = n;
		printArray(ar);
	}

	public static void insertIntoSorted(int[] array) {
		boolean swapped = true;
		int j = 0;
		int tmp;

		while (swapped) {
			swapped = false;
			j++;

			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swapped = true;
				}
			}
		}
		printArray(array);
	}

	public void bubbleSort(int[] array) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swapped = true;
				}
			}
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		b_insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
