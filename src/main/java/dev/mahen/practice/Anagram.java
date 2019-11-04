package dev.mahen.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap();
    Set<String> keySet = new TreeSet<String>();
    List<List<String>> valueList = new ArrayList<>();
    for (String str : strs) {
      keySet.clear();
      char[] cArray = str.toCharArray();
      Arrays.sort(cArray);

      String key = String.valueOf(cArray);
      if (!map.containsKey(key)) {
        map.put(key, Collections.emptyList());
      }
      new ArrayList(map.get(key)).add(str);
    }

    return new ArrayList(map.values());
  }

  /**
   * Complexity Analysis
   *
   * Time Complexity: O(NK \log K)O(NKlogK), where NN is the length of strs, and KK is the maximum length of a string in strs. The outer loop has complexity O(N)O(N) as we iterate through each string. Then, we sort each string in O(K \log K)O(KlogK) time.
   *
   * Space Complexity: O(NK)O(NK), the total information content stored in ans.
   */

}
