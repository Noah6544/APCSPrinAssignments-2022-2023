package keyboard.input;
import java.util.Scanner;
public class KeyboardInput {
    //global area
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many daysd of school have we had?");
        int days = keyboard.nextInt();
      
        System.out.println("There have been " + days + " of school!!!");
        //double exmpale
        System.out.println("What is an example of a decimal?");
        double decimalNumber = keyboard.nextDouble();
        System.out.println("Here\'s and example of a decimal number: " + decimalNumber);
    }
    
}
