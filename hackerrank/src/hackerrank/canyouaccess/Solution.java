package hackerrank.canyouaccess;

public class Solution {

	static class Inner {
		private class Private {
			private String powerof2() {
				int num = 8;
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}

	public static void main(String[] args) {
		try {
			Solution.Inner inner = new Solution.Inner();
			Object object = inner.new Private();
			
			hackerrank.canyouaccess.Solution.Inner.Private private1 = (Solution.Inner.Private) object;
			String s = private1.powerof2();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getCause());
		} 
		
	}

}
