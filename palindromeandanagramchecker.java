import java.util.Scanner;

public class palindromeandanagramchecker {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        String original;
        String reversed="";

        System.out.println("Enter the string");
        original = ss.nextLine();
        
        for(int i=original.length()-1;i>=0;i--){
            reversed=original.charAt(i);
        }

        if(original.equalsIgnoreCase(reversed)){
            System.out.println("Entered string : "+original+" is palindrome.");
        }



    ss.close();
    }
}
