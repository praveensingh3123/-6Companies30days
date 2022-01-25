package amazon;
import java.util.*;
public class FirstNonRepeatingCharac {
	 public String FirstNonRepeating(String stream)
	    {
	        // code here
	       StringBuilder ret = new StringBuilder();
			int isRepeated[] = new int[26];
			Deque<Character> queue = new ArrayDeque<>();
			for (int i = 0; i < stream.length(); i++) {
				char ch = stream.charAt(i);
				if (isRepeated[ch - 'a'] == 0)
					queue.add(ch);
				
				isRepeated[ch - 'a']++;
			
				while (!queue.isEmpty() && isRepeated[queue.peek() - 'a'] != 1)
					queue.poll();
				ret.append(queue.isEmpty() ? '#' : queue.peek());

			}
			return  ret.toString();
	}
}
