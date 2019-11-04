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


}
