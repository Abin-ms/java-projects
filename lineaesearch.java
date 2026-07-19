import java.util.Scanner;
public class lineaesearch {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int i=0;
       
        System.out.println("__________________");
        System.out.println("Linear search");
        System.out.println("__________________");
        System.out.println("Enter the size of the array");
        int size = ss.nextInt();
         int[] arr = new int[size];
        System.out.println("Enter the array");
        for(i=0;i<size;i++){
            arr[i] = ss.nextInt();
        }

        System.out.println("The entered array is : ");
        for(i=0;i< size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element to be fetched : ");
        int key = ss.nextInt();
        if




ss.close();
        
    }
    
    public static int Check(int size,int arr,int key ){
        for(int i = 0;i<size;i++){
            if(arr[i]==key){
                return 1;
            }
            else{
                return 0;
            }
        }

    }
    
}
