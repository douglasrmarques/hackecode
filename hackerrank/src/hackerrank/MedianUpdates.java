package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianUpdates {

	private static List<Integer> lst = new ArrayList<Integer>();
	private static int elemsSize = 0;

	public static void calcMedian() {
		if (elemsSize > 0){
            if (elemsSize % 2 == 1)
                System.out.println(lst.get(elemsSize/2));
            else{
                long median = (long)lst.get(elemsSize/2) + (long)lst.get((elemsSize/2) - 1);
                if (median % 2 == 0)
                    System.out.format("%d%n", median/2);
                else
                    System.out.format("%.1f%n", median/2.0);
            }
        }
        else{
            System.out.println("Wrong!");
            return;
    	}
	}

	public static void add(int value) {
		int pos = Collections.binarySearch(lst, value);
        if (pos < 0)
            pos = -pos - 1;
        
        lst.add(pos, value);
    	elemsSize++;
    	calcMedian();
	}

	public static void remove(int value) {
		int pos = Collections.binarySearch(lst, value);
        if (pos < 0)
            System.out.println("Wrong!");
        else{
        	lst.remove(pos);
            elemsSize--;
            calcMedian();
        }
	}

	public static void main(String args[]) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numOfTests = Integer.parseInt(br.readLine().trim());

		String[] command = null;
		for (int i = 0; i < numOfTests; i++) {
			command = br.readLine().trim().split(" ");
			if (command[0].equals("a"))
				add(Integer.parseInt(command[1]));
			else
				remove(Integer.parseInt(command[1]));
		}
	}
}
