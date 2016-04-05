package hackerrank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();
		in.nextLine();
		
		String[] arr = new String[numTests];
		
		for(int i = 0; i < numTests; i++){
			arr[i] = in.nextLine();
		}
		
		Solution solution = new Solution();
		solution.formataData(arr);
	}

	public void formataData(String[] arr) throws Exception {
		for (int i = 0; i < arr.length; i++) {
			String tmp = arr[i];
			tmp = tmp.replaceAll("th", "");
			tmp = tmp.replaceAll(" ", "-");
			
			SimpleDateFormat dfOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
			Date date = dfOut.parse(tmp);
			
			dfOut.applyPattern("dd-MM-yyyy");
			
			System.out.println(dfOut.format(date));
		}
	}

}
