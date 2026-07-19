import java.util.Scanner;
public class lineaesearch {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
       
        System.out.println("__________________");
        System.out.println("Linear search");
        System.out.println("__________________");
        System.out.println("Enter the size of the array");
        int size = ss.nextInt();
         int[] arr = new int[size];
        System.out.println("Enter the array");
        for(int i=0;i<size;i++){
            arr[i] = ss.nextInt();
        }

        
        
    }
}
