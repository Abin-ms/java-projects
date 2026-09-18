package leetcode;

import java.util.HashSet;


public class longestConseSequence {
    
    public static void main(String[] args){

        int[] nums = {100,4,200,1,3,2};
        System.out.println(longesssst(nums));

        
    }

    public static int longesssst(int[] nums){
        HashSet<Integer> s = new HashSet<>();
        
        for(int num : nums){
            s.add(num);
        }
        
        int longest = 0;

        for(int num : nums){
            
            if(!s.contains(num - 1)){

                int current = num;
                int length = 1;

                while(s.contains( current + 1)){

                    length++;
                    current++;
                }
                longest = Math.max(length, longest);
            }
        }


        return longest;

    }
}
