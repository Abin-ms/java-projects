package leetcode;

public class reverseinteger {
    public static void main(String[] args){
        int num = -123;
        long temp = 0;

        while(num!= 0){

            int digit = num % 10;
            temp = temp * 10 + digit;

            num = num / 10;



        }
        System.out.println(temp);

    }
}
