package hackerrank;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LoadMain {

	public static void main(String[] args) throws Exception {
		LoadMain.convertTime();
	}

	public static void convertTime() throws Exception {
		String time = "07:05:45PM";

		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outDf = new SimpleDateFormat("HH:mm:ss");

		Date date = null;
		String output = null;
		
		date = df.parse(time);
		output = outDf.format(date);

		 System.out.println(output);
	}

	public static void sumFraction() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		int sumPositiveNumbers = 0;
		int sumNegativeNumbers = 0;
		int zeroNumbers = 0;

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();

			if (arr[arr_i] < 0) {
				sumNegativeNumbers++;
			} else if (arr[arr_i] > 0) {
				sumPositiveNumbers++;
			} else {
				zeroNumbers++;
			}
		}

		DecimalFormat format = new DecimalFormat("0.000000");

		String positiveResult = format.format((double) sumPositiveNumbers / n);
		String negativeResult = format.format((double) sumNegativeNumbers / n);
		String zeroResult = format.format((double) zeroNumbers / n);

		System.out.println(String.valueOf(positiveResult));
		System.out.println(String.valueOf(negativeResult));
		System.out.println(String.valueOf(zeroResult));
	}

	public static void sumLong(int a, int b) {
		Long sum = new Long(0);

		sum = (long) (a + b);
	}

	public static void diagonalSum() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];

		int a_diagonalSum = 0;
		int b_diagonalSum = 0;

		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					a_diagonalSum = a_diagonalSum + a[i][j];
				}
			}
		}

		int count = (n - 1);
		for (int i = 0; i < n; i++) {
			b_diagonalSum = b_diagonalSum + a[i][count];
			count--;
		}

		int difference = (a_diagonalSum - b_diagonalSum);
		System.out.println(String.valueOf(difference));
	}

	public static void runn(int x) {
		String[][] array = new String[x][x];
		int count = x - 1;

		for (int i = 0; i < x; i++) {
			for (int j = count; j < x; j++) {
				array[i][j] = "#";
			}
			count--;
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (array[i][j] == null) {
					array[i][j] = " ";
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
