//import the Random function
//import the Scanner function
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
   public static void guessingNumberGame(){
    //create a Randam object  
    Random rand = new Random();
    //create a Scanner object
       Scanner sc = new Scanner(System.in);
       //create the user input
       int rand_int = rand.nextInt(10000);
       //print the Random integer 
       System.out.println("Random Integers: "+rand_int);
       //int number =1 + (int)(100 * Math.random());

       //int numberToGuess = 76; 

       int i , guess;

       
       System.out.println("pleace gess the number i have in my mind:");

       for(i=0; i < rand_int; i++){
          System.out.println("Gess the number:");
                      // Take input for guessing
          guess = sc.nextInt();
 
                      // If the number is guessed
        if (rand_int == guess) {
         System.out.println("You got it! was the Right number");
         break;
        }
         else if(rand_int > guess && i != rand_int - 1){
            System.out.println("No! the guess was wrong my number is higher:" + guess);
            System.out.println("pleace make nwe guess");
        }  
        else if (rand_int < guess && i != rand_int - 1){
            System.out.println("No! the guess was Wrong my numbr is lower:" + guess);
            System.out.println("pleace make nwe guess");
        }
        if (i == rand_int) {
            System.out.println(
                "You have exhausted"
                + " K trials.");
 
            System.out.println(
                "The number was " + rand_int);
        }

    }

   }
    // Driver Code
    public static void
    main(String arg[])
    {
 
        // Function Call
        guessingNumberGame();
    }
}


