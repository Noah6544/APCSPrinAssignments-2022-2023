
package noaohbuchandsumaritve;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;



public class NoaohBuchandsumaritve {
    static Scanner input = new Scanner(System.in);
    public static void println(String text){
        System.out.println(text);
    }
    public static void TwoRocketsBuchanan(){
        println("  /\\        /\\");
        println(" /  \\      /  \\");
        println("/    \\    /    \\");
        println("+------+ +------+");
        println("|      | |      |");
        println("|      | |      |");
        println("+------+ +------+");
        println("|United| |United|");
        println("|States| |States|");
        println("+------+ +------+");
        println("|      | |      |");
        println("|      | |      |");
        println("+------+ +------+");
        println("   /\\       /");
        println("  /  \\     /  \\");
        println(" /    \\   /    \\");

        
        
    } //colla[se thse ias dao;elfs 
    public static void showTwos(){
        println("Find the factors of a number of 2.");
        println("Enter a number to find its factors: ");
        int num = input.nextInt(); 
        if(num%2!=0){            //if num is odd do nothing
            println("No factors with 2");
        }
        else {                      // if number is even
            int currentfactor = num;
            int count = 1;
            while(currentfactor%2==0){
                println("Factor #" +Integer.toString(count) + ": " + Integer.toString(currentfactor/2) + " * " + (Math.pow(2,count))); //this took too long to get the math right
                
                currentfactor = currentfactor/2;
                count += 1;
            }
        }
    }
    public static void diceSum(){
        println("We\'ll look for your randomly desired sum of 2 numbers from a dice");
        println("Enter your number sum: ");
        int goalsum = input.nextInt();
        if(goalsum > 12 || goalsum < 2){
            println("Make sure your number is greater than 12 and greater than 1.");
        }
        else {
            int attemptnum = 0;
            int firstdice, seconddice = 0;
            while(attemptnum!=goalsum){
                firstdice = ThreadLocalRandom.current().nextInt(1,6);
                seconddice = ThreadLocalRandom.current().nextInt(1,6);
                println(Integer.toString(firstdice) + " + " + Integer.toString(seconddice)
                + " = " + Integer.toString(firstdice + seconddice));
                attemptnum = firstdice + seconddice;
            }
            println("We got it!");
  
        }
     
        
    }
    public static void main(String[] args) {
        TwoRocketsBuchanan();
        showTwos();
        diceSum();
        // TODO code application logic here
    }
    
    
    
}


//WWWWWWWWWW