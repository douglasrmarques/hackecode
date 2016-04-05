package hackerrank;

public class StringMain {

	public static void main(String[] args) throws Exception {
		StringMain.pangran();
	}
	
	public static void pangran(){
		String s = "We promptly judged antique ivory buckles for the prize";
	    int i=0;
	    for(char c : s.toCharArray()) {
	        int x = Character.toUpperCase(c);
	        if (x >= 'A' && x <= 'Z') {
	            i |= 1 << (x - 'A');
	        }
	    }
	    if (i == (i | ((1 << (1 + 'Z' - 'A')) - 1))) {
	        System.out.println("pangram");
	    } else {
	    	System.out.println("not pangram");
	    }
	}
	
	
	
}
