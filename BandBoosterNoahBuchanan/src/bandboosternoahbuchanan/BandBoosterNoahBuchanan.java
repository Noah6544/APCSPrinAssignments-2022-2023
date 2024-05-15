
package bandboosternoahbuchanan;

import java.util.Scanner;

public class BandBoosterNoahBuchanan {
    static Scanner input = new Scanner(System.in);

    //Step 1: define attributes
    
    String name;
    int boxessold;
        

    //Step 2: Parameter constructor
    public BandBoosterNoahBuchanan(String name, int boxesssold){
        this.name = name;
        this.boxessold = boxessold;
    }
    
    //Step 4: Accessors/Mutators
    public double getName(){
        return name;
    }
    public double updateSales(int sales){
        this.boxessold += sales;
        return this.boxessold;
    }
    public String toString(){
        return this.name + " sold " + this.boxessold + " boxes.";
    }

    public static void main(String[] args) {
        BandBoosterNoahBuchanan objects[] = new BandBoosterNoahBuchanan[2];
        for(int i=0;i<2;i++){ //reading in names
            System.out.print("Enter user #" + (i+1) + "'s name: ");
            String name = input.nextLine();
            BandBoosterNoahBuchanan user = new BandBoosterNoahBuchanan(name,0);  //let's go solution to my issue. figured out u can make an array of a class
            objects[i] = user;
        }
        for(int i=0;i<2;i++){// the number of users to read in the weeks
            BandBoosterNoahBuchanan user = objects[i];
            for(int z=0;z<3;z++){
                System.out.print("Enter the number of boxes sold by " + user.name + " this week. (week #" + (z+1) + "):");
                int boxessold_thisweek = input.nextInt();
                user.updateSales(boxessold_thisweek);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

    }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(objects[0].toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(objects[1].toString());
    }
    
}
