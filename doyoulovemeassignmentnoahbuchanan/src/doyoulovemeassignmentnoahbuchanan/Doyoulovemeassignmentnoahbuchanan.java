
package doyoulovemeassignmentnoahbuchanan;

/**
 *
 * @author 9nbuchanan1
 */
import java.util.Scanner;


public class Doyoulovemeassignmentnoahbuchanan {

static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of pedals: ");
        int pedalnum = input.nextInt();
        int count = 0;
        while(count <= pedalnum){
        System.out.println("Picking petal #" + Integer.toString(count) +"...");
        if(count % 2 == 0){
            
            System.out.println("He loves me!");
        }
        else{
            
            System.out.println("He loves me not...");
        }
        count += 1;
    }
        System.out.println("Done! Does he love you?");
    }
    
}
