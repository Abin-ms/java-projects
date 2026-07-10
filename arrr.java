import java.util.Scanner;
public class arrr {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int i;

        System.out.println("Enter the size of the array");
        int limit = ss.nextInt();

        int[] arrr = new int[limit];

        for(i = 0;i < limit;i++){
            int num = i+1;
            System.out.println("Enter the value of "+num+ " : ");
            arrr[i]=ss.nextInt();

        }

        System.out.println("Entered array is : ");
        for(i= 0;i < limit;i++){
                 System.out.println(arrr[i]);
        }
       ss.close();
    }
    
}
