import java.util.Scanner;
//Multiplication table generator level - 3 (displaying multiplicayion tables of multiple nummbers)

public class multiplicationtablegenerator3 {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int range1;
        int range2;
        int result;
        System.out.println("Enter the starting number : ");
        range1 = ss.nextInt();
        System.out.println("Enter the ending number : ");
        range2 = ss.nextInt();

        int i;
        for(i = range1 ; i<=range2; i++){
            for(int j = 1 ; j<11 ; j++){
                result = j * i;
                System.out.println(+i+"X"+j+"="+result);
            }
        }
        


ss.close();
    }
}
