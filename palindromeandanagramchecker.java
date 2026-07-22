import java.util.Arrays;
import java.util.Scanner;

public class palindromeandanagramchecker {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int choice = 0;
        String original = "";

        while (true) {

        System.out.println("____________________________________________");
        System.out.println("Enter your choice");
        System.out.println("1.Check if a string is palindrome or not");
        System.out.println("2.Check if a string is Anagram or not");
        System.out.println("3.Exit");
         System.out.println("____________________________________________");
        choice = ss.nextInt();
        ss.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("___________________");
                    System.out.println("Palindrome or not.");
                    System.out.println("___________________");
                    System.out.println("Enter the string");
                    original = ss.nextLine();
                    System.out.println(palindrome(original));
                     System.out.println("___________________");
                    break;
                case 2:
                    System.out.println("___________________");
                    System.out.println("Anagram or not.");
                    System.out.println("___________________");
                    System.out.println("Enter the first string");
                    String firststring = ss.nextLine();
                    System.out.println("Enter the second String");
                    String secondstring = ss.nextLine();
                    firststring = firststring.toLowerCase().replace(" ", "");
                    secondstring = secondstring.toLowerCase().replace(" ", "");
                    if (!anagram(firststring, secondstring)) {
                        System.out.println("The strings are not anagram");
                    }
                    else{
                        System.out.println("The strings are anagram");
                    }
                    
                    break;
                case 3:
                    System.out.println("Thank you!!!");
                    ss.close();
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }
       
        
    }
    

    public static String palindrome(String original) {
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reversed))
            return "The string " + original + " is palindrome";

        else
            return "The string " + original + "is not a plaindrome";
    }

    public static boolean anagram(String firststring,String secondstring){
        if(firststring.length()!=secondstring.length()){
            return false;
        }
        else{
            char[] c1 = firststring.toCharArray();
            char[] c2 = secondstring.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2) ) 
                return true;

            return false;
        }

    }
}
