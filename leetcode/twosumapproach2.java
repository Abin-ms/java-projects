package leetcode;

import java.util.HashMap;

public class twosumapproach2 {
    public static void main(String[] args){

        int[] nums = {2,3,1,7,6};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++){

            int complement = target - nums[i];
            if(map.containsKey(complement)){
                System.out.println("["+map.get(complement)+ ","+i+"]");
            }
            map.put(nums[i], i);

        }
        
    }
}
