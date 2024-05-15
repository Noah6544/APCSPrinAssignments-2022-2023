
package hotlipstaketwonoahbuchanan;
    import java.util.Scanner;


public class Hotlipstaketwonoahbuchanan {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hey admin welcome to the booth! It will now open for use!");
        Boolean breakvar = true;
        int count = 1;
        int totalkisses = 0;
        while(breakvar == true){
            System.out.println("Hey you are guest #" + Integer.toString(count) + " today!\nHow many kisses do you want to purchase? Enter here: ");
            int kissesnum = input.nextInt();  
            totalkisses += kissesnum;
            count += 1;
            System.out.println("Hey admin running the booth, if you want to close the booth type \"0\", otherwise, type any number. \nEnter here:");
            int tempvar = input.nextInt();
            if(tempvar == 0){
                System.out.println("We sold: "+ Integer.toString(totalkisses) + " today! great work boss!");
                breakvar = false;
            }
            else{
                System.out.println("Next Guest!");
            }
            
        }
        
    }
}
    
