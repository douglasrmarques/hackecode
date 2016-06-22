package hackerrank;

public class Run {

	public static void main(String[] args) {
		int[] arr = {3,7,8,1,2,5};
		
		int numItems = arr.length;
		
		int temp = arr[0];
		
		for(int i = 0; i <= numItems - 2; i++){
			arr[i] = arr[i + 1];
			System.out.println(i);
		}
		
		arr[numItems - 1] = temp;
		
		for(int value : arr){
			System.out.print(value);
		}
	}
	
}
