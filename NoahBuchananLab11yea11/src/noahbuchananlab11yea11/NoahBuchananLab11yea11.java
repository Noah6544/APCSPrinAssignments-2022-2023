
package noahbuchananlab11yea11;
import java.util.Scanner;

/**
 *
 * @author 9nbuchanan1
 */
public class NoahBuchananLab11yea11 {
    static Scanner input = new Scanner(System.in);
    
    public static void println(String text){
        System.out.println(text);
    }
        
    //problem #1
    public static void onetoonehundred(){
        println("--------------");

        println("Printing Out Each Number From 1 to 99!!!\nBEGIN!\n");
        int num = 1;
        while (num < 100){
            println(Integer.toString(num));
            num +=1;                     
        }
    }
    
    //problem #2
    public static void weirdprocess(){
        println("--------------");

        println("Hey, Enter a number to see some math applied...nerd...");
        println("Enter the number here: ");
        int num = input.nextInt();
        int count = 0;
        while(num!=1){
            count+=1;
            println("Your num is equal to..." + Integer.toString(num));
            
            if(num%2==0){ // if it's even
                println("...Dividing by 2...");
                num = num/2; //divide by 2
            }
            else{              //if its odd
                num = num *3; //multiply by 3
                num+=1;       //add one
                println("...Adding 1...");
                println("...Multiplying by 3...");
            }           
        }
        println("The weird math is done!\nYour number is now equal to 1!"
                + "\nIt just took "+ Integer.toString(count) +" trials of the weird math...");
    }

    public static void multiplesdivisiblisiblieisesdfsd(){
        
        println("--------------");
        println("Find the number...of numberss that are divisible... idk");
        println("Enter the start of the range: ");
        int startrange = input.nextInt();
        println("Enter the end of the range:   ");
        int endrange = input.nextInt();
        println("Enter a number between those 2");
        int divisor = input.nextInt();
        int checkdivisible = endrange;
        int count = 1;
        // my way is to do a loop and subtract from top of loop to see if it's divisible by the third num
        println("Looking for numbers divisible by \' " + Integer.toString(divisor) + "\' within your range");
        while(checkdivisible >= startrange){
            if(checkdivisible%divisor==0){
                count += 1;
                System.out.println(Integer.toString(checkdivisible) + " is divisible!");
            }
            else{
                println("0_0 0_o o_o o_0 0_0");
            }
            checkdivisible -= 1;
        }
        println("\n\nDone! There were " + Integer.toString(count) + " numbers divisible by " + Integer.toString(divisor) + " within your range");

    }   
    
    public static void main(String[] args) {
        onetoonehundred();                   // thing 1
        weirdprocess();                     // thing 2
        multiplesdivisiblisiblieisesdfsd();// thing 3
    }
    
}
