
package noahbuchananlab9exercises;

import java.util.Scanner;


//packages for random num gen
import java.util.Arrays;
import java.util.Random;

    

public class NoahBuchananLab9Exercises {
    //public variables
    static String clean = "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    static Scanner keyboard = new Scanner(System.in);
    
    // Functions     
    
    //basic print because python >>
    public static void print(String text){
        System.out.println(text);
        }
    
    //guessinggamegame
    public static int checkMaxNum(int winningNum){
        if (winningNum <=2){
            print(clean+"INVALID INPUT\n"+clean+"Defaulting to 100"+clean);
            return 100;
        }
        else{
            return winningNum;
        }

        }
    
    
    public static int randomNumRange(int maximumNum){
        print(clean+"Loading...."+clean);
        Random random = new Random();
        int rand = 0;
        while (true){
            
           rand = random.nextInt(maximumNum);
           if(rand >=0){
               return rand;
           }
           else{
               print("wow lucky");
           }
           
           
        }
            
            
        
    }
    public static void guessingGame(){
        print(clean + "Welcome to my guessing game! Python was so much easier but yea " + clean);
        print("Decide the range you want to play! 1 - 100 or 1 - 1,000,000!!!");
        print("Enter the maximum number you want to guess: ");
        int maxNum = keyboard.nextInt();
        maxNum = checkMaxNum(maxNum);

        int winningNum = randomNumRange(maxNum);
        
        print(clean+"Winnning number generated!"+clean);
        print("Enter how many chances do you want to give yourself to guess the number?");
        print("Enter # of guesses: ");
        int numofGuesses = keyboard.nextInt();
        print(clean+"Loading"+clean);
        print(clean+"                    STARTING GAME                    "+clean);
        Boolean running = true;
        print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        int count = -1;
        while (running){
            count ++;
       
            print("Enter Your Guess!");
            int userGuess = keyboard.nextInt();
            if (userGuess > winningNum){
                print("Too High! Try Again!");
                }
            else if(userGuess < winningNum){
                print("Too Low!! Try Again!!!");
                }
            else if (userGuess == winningNum){
                print(clean+"CONGRAGULATIONS!!! YOU WIN!!!"+clean);
                break;
            }
            else{
                print("Something went wrong");
            }
            if (count > numofGuesses){
                print(clean+"YOU RAN OUT OF GUESSES!");
                break;
            }
        }
        
        print("The winning number was: " + Integer.toString(winningNum));

            
    }
    
    public static Double DeliMarketwhileloop(String condition,double price){
        String variable = "0";
        double sum = 0.0;
        while(!variable.equals(condition)){
            print(condition);
            print("How many pounds of meat do you want: ");
            int pounds = keyboard.nextInt();
            sum = sum + price * pounds;
            print("You are going to pay $" + Double.toString(sum) + " for " + Integer.toString(pounds) + " pounds of meat");
            keyboard.next();
            System.out.print("Do you want to continue? \" stop\" if not: ");
            variable = keyboard.nextLine();
            keyboard.next();
            print(variable);
            print(Boolean.toString(variable.equals(condition)));
            
        }
        return sum;
    }
    public static void DeliMarket() {
        print("yo what deli meat do you want?");
        print("1.) Mysterious Meat: $1.30 per pound");
        print("2.) Ham: $1.70 per pound");
        print("3.) Turkey: $2.00 per pound");
        print("Which one do you want: ");
        int input = keyboard.nextInt();
        if (input == 1){
            print("hmm");
            Double sum = DeliMarketwhileloop("stop",1.3);
            print("You spent $" + Double.toString(sum) + " on Mysterious Meat (it\'s horse meat)");
        }
        else if(input == 2){
            Double summ = DeliMarketwhileloop("stop",1.7);
            print("You spent $" + Double.toString(summ) + " on Ham");
        }
        else if(input == 3){
            Double summm = DeliMarketwhileloop("stop",2.00);
            print("You spent $" + Double.toString(summm) + " on Turkey");
        }
    }        
    
    public static void JumpRopeForHeart(){
        print("How much money per jump do you wanna donate?");
        print("Enter $$ per jump:");
        double DonationRate = keyboard.nextDouble();
        int count = 1;
        int sum = 0;
        Boolean breakstringbool = false;
        while (breakstringbool != true){
            print("Enter how many jumps were made by person " + Integer.toString(count) + "?");
            int Jumps = keyboard.nextInt();
            sum +=  (DonationRate * Jumps);
            print("$" + Double.toString(DonationRate*Jumps) + " has been raised by person #" + Integer.toString(count));
            System.out.println("Do you want another person to jump? Type \"stop\" if not:");
            String breakstring = keyboard.next();

            count += 1;
            print(breakstring);
            if(breakstring.equals("stop")){
                breakstringbool = true;
                print("trued");
          
            }
        }
        
        
        print("You\'ve raised $" + Integer.toString(sum) + "");
    }
    public static void main(String[] args) {
        JumpRopeForHeart();
    }
}
