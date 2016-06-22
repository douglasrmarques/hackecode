package hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String valueOfInt = "";
			String valueOfString = sc.next();

			int strSize = valueOfString.length();

			for (int j = strSize; j < 15; j++) {
				valueOfString += " ";
			}

			int x = sc.nextInt();
			int intSize = Integer.toString(x).length();

			while (intSize < 3) {
				valueOfInt += "0";
				intSize++;
			}
			valueOfInt += Integer.toString(x);

			System.out.printf("%s", valueOfString + valueOfInt);
		}
		System.out.println("================================");

	}

}
