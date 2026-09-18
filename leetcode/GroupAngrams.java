package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAngrams {
    public static void main(String[] args){

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(granagram(strs));

 
    }

    public static List<List<String>> granagram(String[] strs){

        
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
    
}
