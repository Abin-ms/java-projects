package leetcode;

public class adddigits {
    public static void main(String[] args){
        int num = 38;
        
        
        while (num >= 10) {
            int result = 0;

            while( num != 0){
            int temp = num % 10;
            result = result + temp;
           num = num / 10;
        }
            num = result;
        }
        System.out.println(num);
    }
}
