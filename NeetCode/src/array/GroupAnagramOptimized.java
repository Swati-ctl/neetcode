package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagramOptimized ga= new GroupAnagramOptimized();
		List<List<String>> lls=ga.groupAnagrams(new String[] {"act","pots","tops","cat","stop","hat"});
		for(List<String> ls :lls)
		{
			for(String str: ls)
			{
				System.out.println(str);
			
			}
			System.out.println("       ");
		}

	}
	  public List<List<String>> groupAnagrams(String[] strs) {
	       HashMap<String, List<String>> hm= new HashMap();
	       for(String s : strs)
	       {
	           char [] sArray= s.toCharArray();
	           Arrays.sort(sArray);
	           String sorts= new String(sArray);
	           hm.putIfAbsent(sorts, new ArrayList());
	           hm.get(sorts).add(s);
	       }
	       return new ArrayList<>(hm.values());
	    }
}
