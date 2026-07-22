import java.util.Scanner;
public class atmsimu {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);        int balance = 1000;
        int choice;
        int deposite;
        int amount;

        while (true) {

            
            showMenu();
            choice = ss.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available balance is : "+balance);
                    break;

                case 2:
                    System.out.println("Enter the amount to Deposite");
                    deposite = ss.nextInt();
                    if(!validateAmount(deposite)){
                        System.out.println("Invalid Amount!!");
                    }
                    else{
                        balance = balance + deposite;
                        System.out.println("Balance : "+balance);
                    }
                    break;

                case 3:
                    System.out.println("Enter the amount to be Withdrawn");
                    amount = ss.nextInt();
                    if(!balanceValidation(amount, balance)){
                        System.out.println("Insufficient Balance !!!!");
                    }
                    else{
                        System.out.println("Withdrawal Succesfull!!");
                        balance = balance - amount;
                        System.out.println("Balance : "+balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank You For Choosing Our Bank , Have A Nice Day");
                    ss.close();
                    return;
            
                default:
                    System.out.println("Invalid Option");

                    break;
            }


        }

    }

    public static void showMenu(){
        System.out.println("1.Check Balance.");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");

    }
    public static  boolean validateAmount(int deposite){
        if(deposite<=0){
            return false;
        }
        else{
            
            return true;
        }
    }
    public static boolean balanceValidation(int amount,int balance){
        if(amount>balance || amount<0 ){
            return false;
        }
        else{
            return true;
        }
    }

}
