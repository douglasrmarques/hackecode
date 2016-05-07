package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AmazonChallenge {
	
	interface LogEntry {
		String getDate();
		String getCustomerId();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LogEntry> lst = new ArrayList<LogEntry>();
		
		Set<String> visitors = new HashSet<String>();
		
		for(int i = 0; i < lst.size(); i++){
			LogEntry log = lst.get(i);
//			visitors.add(lst.get)
		}
		
		
	}

}
