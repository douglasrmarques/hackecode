package hackerrank.checkprime;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Prime {
	public void checkPrime(int ...number){
		List<String> primes = new ArrayList<>();
		
		for(int i = 0; i < number.length; i++){
			if(number[i] == 2){
				primes.add(String.valueOf(number[i]) + " ");
			} else {
				for(int j = 1; j <= (number[i]/2); j++){
					if((j % number[i])==0){
						primes.add(String.valueOf(number[i]) + " ");
						break;
					}
				}
			}
		}
		
		if(primes.size() == 0){
			System.out.printf("\n");
		} else {
			String result = "";
			for(String prime : primes){
				result += prime;
			}
			
			System.out.printf("%s \n", result);
		}
	}
}

public class Solution {
	
	public static void main(String[] args) {
		try {			
			@SuppressWarnings("unused")
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int value1 = 2;
			int value2 = 1;
			int value3 = 3;
			int value4 = 4;
			int value5 = 5;

			Prime prime = new Prime();
			prime.checkPrime(value1);
			prime.checkPrime(value1, value2);
			prime.checkPrime(value1, value2, value3);
			prime.checkPrime(value1, value2, value3, value4, value5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
