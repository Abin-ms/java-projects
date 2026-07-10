import java.util.Scanner;
public class arr2 {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int row,column;
        int i,j;

        System.out.println("Enter the number of rows");
        row = ss.nextInt();

        System.out.println("Enter the number of columns");
        column = ss.nextInt();

        int[][] arr = new int[row][column];

        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                
                System.out.println("Enter the values : ");
                arr[i][j] = ss.nextInt();
            }
        }

        System.out.println("Entered Array is : \n");
        for(i = 0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(" "+arr[i][j]+" ");
            }
            
                System.out.println();
                
            
        }
        ss.close();

    }
}
