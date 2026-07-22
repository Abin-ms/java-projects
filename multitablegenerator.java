import java.util.Scanner;
//level - 1 , printing multiplicationtable upto range 10 of a single number.
public class multitablegenerator {
    public static void main(String[] args){
        int result;
        Scanner ss = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = ss.nextInt();
        for(int i = 1 ; i<11 ; i++){
            result = number*i;

            System.out.println(+number+"X"+i+"="+result);
        }
ss.close();
    }
}
