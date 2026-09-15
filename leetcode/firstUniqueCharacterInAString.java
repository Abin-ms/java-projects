package leetcode;

public class firstUniqueCharacterInAString {

    public static void main(String[] args) {
        String s = "hello";
        

        
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            
            if(count[index] == 1){
                System.out.println(i);
                break;
            }
        }

        
    }
}
