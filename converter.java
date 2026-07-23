import java.util.Scanner;

public class converter {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int choice;
        while (true) {
            menu();
            choice = ss.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("__________________");
                    System.out.println(" Length converter");
                    System.out.println("__________________");

                    System.out.println("1.meter");
                    System.out.println("2.kilometer");
                    System.out.println("3.Centimeter");
                    System.out.println("4.Mile");    
                    System.out.println("5.Exit");
                    System.out.println("From(Enter your choice from the above):");
                    int choice2 = ss.nextInt();
                    System.out.println("TO (Choose one option from above) :");
                    int choice3 = ss.nextInt();
                    switch (choice2) {
                        case 1:
                            //meter to corresponding.
                            
                            break;
                        case 2:
                            //kilometer to corresponding.
                            break;
                        case 3:
                            //Centimeter to corresponding.
                            break;
                        case 4:
                            //Mile to corresponding.
                            break;
                        case 5:
                            break;
                        default:
                            break;
                    }
                    
                    
                    break;
                
                case 2:
                    break;

                case 3:
                    break;

                
                default:
                    break;
            }
            
            
        }
    }
    public static void menu(){
        System.out.println("Choose your Option");
        System.out.println("1.Length Converter.");
        System.out.println("2.Weight Converter");
        System.out.println("3.Currency Converter");
        System.out.println("4.Exit");
    }

}
