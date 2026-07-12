import java.util.Scanner;

public class palindromeandanagramchecker {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        

        System.out.println("Enter the string");
        String original = ss.nextLine();
        
        String reversed = new StringBuilder(original).reverse().toString();

        if(original.equalsIgnoreCase(reversed)){
            System.out.println("Entered string : "+original+" is palindrome.");
        }
        else{
            System.out.println("Entered string : "+original+" is not palindrome.");
        }



    ss.close();
    }
}
