import java.util.Random;
import java.util.Scanner;

public class Game {

     public static void main(String[] args)  {
      
      Random rand = new Random();
      Scanner scanner =new Scanner(System.in);

      int randomNumber = rand.nextInt(100) + 1;
      
           
      while(true){
         System.out.println("Enter Your Guess(1 - 100):");
      
         int playerGuess = scanner.nextInt();

      if(playerGuess == randomNumber) {
         System.out.println("Correct! You Win!");
          break;
      }
       else if (randomNumber > playerGuess) {
         System.out.println("Nope the number is Higher .Guess again.");

       }
         else {
            System.out.println("Nope the number is Lower .Guess again.");
         }  
      

     }
    }  
   }    

