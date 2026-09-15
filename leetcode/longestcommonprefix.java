package leetcode;

public class longestcommonprefix {
    public static void main(String[] args){
        String[] s = { "flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));

    }
    public static String longestCommonPrefix(String[] s){

        int minlength = s[0].length();
        for( int i = 0 ; i < s.length ; i++){
            if(s[i].length() < minlength){
                minlength = s[i].length();
            }
        }
        for( int i = 0 ; i < minlength ; i++){
            char reference = s[0].charAt(i);
            for( int j = 1 ; j < s.length; j++){
                if( s[j].charAt(i) != reference){
                    return s[0].substring(0,i);
                }
            }
        }

        return s[0].substring(0,minlength);

    }
}
