
package noahbuchanancarshopwelcome;

import java.util.Scanner;


public class Noahbuchanancarshopwelcome {

    private static Scanner input = new Scanner(System.in);
    
    public static void print(String text){
        System.out.println(text);
    }
        public static int baseVehicle(){
      print("Take a look at our inventory:");
      print("Model 1 - $15,000");
      print("Model 2 - $24,000");
      print("Model 3 - $40,000");
      print("Which base model did the customer choose?\n(Enter full model name)\n");
      String model = input.nextLine();
      
      if(model.equalsIgnoreCase("Model 1")){
         print("Selected Model 1");
         return 15000;
      }
      else if(model.equalsIgnoreCase("Model 2")){
        print("Selected Model 2");
        return 24000;
      
      }
      else if(model.equalsIgnoreCase("Model 3")){
          print("Selected Model 3");
          return 40000;
      }
      else{
          print("Invalid input. Defaulting price to $20,000");
          return 20000;
      }   
    
    }
       
    // function to make more functions a lot faster with 2 arguments. modularity i think
    public static int BaseAccessoryAdder(String additionName, int additionPrice){
        print("Would you like \"" + (additionName) + "\" for $" + Integer.toString(additionPrice) + "?\n(y/n)?");
        String option = input.nextLine();
        if (option.equalsIgnoreCase("y")){
            print("Selected addition of \"" + additionName + "\" + $" + Integer.toString(additionPrice) + ".\n");
            return additionPrice;
        }
        else{
            print("Selected NO \"" + additionName + "\" + $" + Integer.toString(additionPrice) + ".");
            print("This may also be default for invalid input\n");
            return 0;
        }
    }
    
    public static void main(String[] args) {
       int totalCost = 0;
       totalCost += baseVehicle();
       totalCost += BaseAccessoryAdder("Automatic Windows",500);
       totalCost += BaseAccessoryAdder("OnStart System",1000);
       totalCost += BaseAccessoryAdder("Anti-Lock Brakes (ABS)",500);
       totalCost += BaseAccessoryAdder("Premieum Customizable Rims",1330);
       totalCost += BaseAccessoryAdder("Telescoping steering Wheel with Adjustable Pedals ",100);
       totalCost += BaseAccessoryAdder("Sunroof",800);
       totalCost += BaseAccessoryAdder("Cold Weather Package\n(1. Heated seats\n2.Windsheild Heater)",1500);
       totalCost += BaseAccessoryAdder("GPS Nav System",750);
       totalCost += BaseAccessoryAdder("Cold 12 Pack Sprite",30);
       totalCost += BaseAccessoryAdder("I am out of ideas",2348420);  
       print("Total Cost:\n------\n$" + (totalCost) + "\n------\n");
       
    }
    
