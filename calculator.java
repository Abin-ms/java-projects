import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner ss = new Scanner(System.in);



        while (true) {
            System.out.println("\nMenu\n");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division\n");
            System.out.println("5.Exit");

            System.out.println("Enter your choice");
            
            int choice = ss.nextInt();

            if(choice<1||choice>5){
                System.out.println("Invalid choice");
                continue;
            }
            if(choice==5){
                System.out.println("Thank you!");
                break;
            }

            System.out.println("\nEnter the first number");
            double num1 = ss.nextDouble();
            System.out.println("\nEnter the second number");
            double num2 = ss.nextDouble();

            switch(choice){
                case 1: 
                    System.out.println("Output is : " +add(num1,num2));
                    break;
                case 2:
                    System.out.println( "Output is : " +sub( num1,num2));
                    break;
                case 3:
                    System.out.println( "Output is : " +mul(num1,num2));
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("Zero cannot be divided");
                    }
                    else
                    System.out.println( "Output is : " +div(num1,num2));
                    break;
                default:
                    System.out.println("Invalid output");
                

                
            }

            
        }
        ss.close();

    }
    public static double add(double num1,double num2){
        return num1+num2;
    }
    public static double sub(double num1,double num2){
        return num1-num2;
    }
    public static double mul(double num1,double num2){
        return num1*num2;
    }
    public static double  div(double num1,double num2){
        return num1/num2; 
    }
    
   
}
