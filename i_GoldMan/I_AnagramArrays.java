package i_GoldMan;
import java.util.*;
public class I_AnagramArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"aabb", "cddd", "baba", "ddcd", "cat"};
		List<List<String>> ans = Anagrams(arr);
		System.out.println(ans);
	}
	public static List<List<String>> Anagrams(String[] ls) {
        HashMap<String, List<String>> map = new HashMap<>();
        String[] str = new String[ls.length];
        for(int i = 0; i<ls.length; i++){
            char[] ch = ls[i].toCharArray();
            Arrays.sort(ch);
            str[i] = String.valueOf(ch);
        }
        for(int i = 0; i<str.length; i++){
            if(!map.containsKey(str[i])){
                map.put(str[i], new ArrayList<>());
            }
            map.get(str[i]).add(ls[i]);
        }
        return new ArrayList<>(map.values());
    }
}
