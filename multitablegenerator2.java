import java.util.Scanner;
//multiplication table level - 2.

public class multitablegenerator2 {
    public static void main(String[] args){
        int result;
        Scanner ss = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = ss.nextInt();

        System.out.println("Enter the range");
        int range = ss.nextInt();

        for(int i = 1 ; i<=range ; i++){
            result = number * i;
            System.out.println(+number+"X"+i+"="+result);
        }
        ss.close();
    }

}
