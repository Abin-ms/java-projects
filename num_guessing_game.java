import java.util.Random;
import java.util.Scanner;
class num_guessing_game{
    public static void main(String []args){
        Random rand = new Random();
        Scanner ss = new Scanner(System.in);

        int randomnum = rand.nextInt(101);

        while (true) {

        System.out.println("Enter your guess");
        int guess = ss.nextInt();
 
        if(randomnum==guess){
            System.out.println("Congratulations your guess : "+randomnum+ " was right");
            break;

        }
        else if (randomnum<guess) {
            System.out.println("Your guess was too high");
        }  
        else{
            System.out.println("your guess was too low");
        }
        }
        ss.close();
    }
}