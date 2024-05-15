
package noahbswitchpractice;

import java.util.Scanner;

public class NoahBSwitchPractice {
    static Scanner keyboard = new Scanner(System.in);
    
    public static void print(String input){
        System.out.println(input);
    }
        
    public static void main(String[] args) {
        print("Drink Machine");
        print("1 - Koolaid");
        print("2 - Sprite");
        print("3 - Fanta");
        print("Choice: ");
        
        int choice = keyboard.nextInt();
        
        switch(choice){
            case 1: print("Vending Koolaid");
                    break;
            case 2:
                print("Vending Sprite");
                    break;
            default:
                print("INVALID TRY AGAIN");
                    break;
                    
        }
            
    }
    
}
