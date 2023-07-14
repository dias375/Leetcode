package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {


    public boolean isAnagram(String s, String t) {

        char[] source = s.toCharArray();
        char[] target = t.toCharArray();

        Arrays.sort(source);
        Arrays.sort(target);

        return Arrays.equals(source, target);
    }

    public boolean HashMap(String s, String t) {

        HashMap<Character, Integer> mapS = arrayToMap(s.toCharArray());
        HashMap<Character, Integer> mapT = arrayToMap(t.toCharArray());

        for (Character c : mapS.keySet()) {
            if (!mapT.containsKey(c)) return false;
            if (!mapS.get(c).equals(mapT.get(c))) return false;
            mapT.remove(c);
        }
        return mapT.isEmpty();
    }

    private HashMap<Character, Integer> arrayToMap(char[] array) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.replace(c, map.get(c) + 1);
        }
        return map;
    }
}