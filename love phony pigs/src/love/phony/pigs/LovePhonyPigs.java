
package love.phony.pigs;
import java.util.Scanner;

public class LovePhonyPigs {
    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        
        System.out.println("Love Name #1: ");
        String loveName1 = keyboard.nextLine().toUpperCase();
        System.out.println("Love Name #2: ");
        String loveName2 = keyboard.nextLine().toUpperCase();
        
        for(int i = 0; i < loveName1.length(); i++){
            if(loveName1.charAt(i) == 'L' ||
               loveName1.charAt(i) == 'O' ||
               loveName1.charAt(i) == 'V' ||
               loveName1.charAt(i) == 'E'){
                count1++;
            }
        }
        
        for(int i = 0; i < loveName2.length(); i++){
            if(loveName2.charAt(i) == 'L' ||
               loveName2.charAt(i) == 'O' ||
               loveName2.charAt(i) == 'V' ||
               loveName2.charAt(i) == 'E'){
                count2++;
            }
        }//
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        if((count1 + count2)%2 != 0 ){
            System.out.println("They will fall madly in love, that they are made for each other.");
        }
        else{
            System.out.println("They were not destined to be together, like every high schooler..");
        }
    }
}