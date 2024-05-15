
package vendingmachinenoah;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

//sleep stuff
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendingMachineNoah {
    
    static String clean = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    static Scanner keyboard = new Scanner(System.in);

    // Functions 
    
    //basic print because python >>
    //print without linebreak cuz for stu
    public static void print(String text){
        System.out.print(text);
    }
    
    public static void println(String text){
        System.out.println(text);
    }
    
    public static void takeYourItem(String itemName){
        print(clean);
        println("You have purchased the:");
        println(clean);
        typewrite(itemName + "\n",250);
        println(clean);
    }
    
    public static void checkBalanceandGiveItem(int moneyRemaining, int itemCost, String itemName){
        print(clean);
        if (moneyRemaining > 0){
            println("You have enough money for me to steal!");
            println("You have $" + moneyRemaining + " left.");
            takeYourItem(itemName);
    }
        else if (moneyRemaining == 0){
            println("Hey, thanks for giving us all your money cuz you have $0 left. and I'm not giving you anything. Come back with more so we can scam you even more");
            sleep(100);
            println("I'm not giving you your item get out of here.");
            sleep(10000);
            println("Wow you're persistent take your junk");
            takeYourItem(itemName);
        }
        else if (moneyRemaining <0){
            println("Hey...I thought you said you have money? Alright, since you don't have enough this time, pay me back triple in 3 days. If not I'll find you");
            println("You're gonna have to owe me....$" + 3*moneyRemaining);
            typewrite("IM SERIOUS 3 DAYS!!\n",150);
            takeYourItem(itemName);
                    
        }
                    
                    
    }
    
    public static void sleep(int time){
    //it only works with a try catch for some rason

        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(VendingMachineNoah.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //typewriter to type each digit out. python is better and easier i despise this
    public static void typewrite(String text, int time) {
        //convert string to list
        //print out each character in list 
        //delay half a second
        //convert it all to caps
        
        String[] textsplit = text.split("");
        
        ArrayList<String> textlist = new ArrayList<String>(Arrays.asList(textsplit));
        
        for (String character : textlist) {
            //character = character.toUpperCase();
            print(character);
            sleep(250);
           
        }
      }
    
    
    public static void SnackMenu(){
        println(clean);
        println("That's what we're talking about! Finally someone with deep pockets! Here's what we got");
        sleep(2000);
        println("");
        println(clean);
        println("1. Full Bag of chips (no air): $450");
        println("2. 24k Snickers: $500");
        println("3. Actually Golden Wagyu: $1,500");
        println("4. Three Freezers of Ice Cream: $3,000");
        println("5. Water from the bottom of the ocean (we can't prove this): $10,000\n");
        print(clean);
    }
    
    public static void VendingMachineIfOptions(int option, int money){
        if (option == 1){
            int moneyRemaining = money - 450;
            
            checkBalanceandGiveItem(moneyRemaining,450,"Bag of $1.50 Doritors (don't tell customer)");
            }
        
   
        
        else if (option == 2){
            int moneyRemaining = money - 500;
            
            checkBalanceandGiveItem(moneyRemaining,500,"Normal Snickers bar");
            }
        
        else if (option == 3){
            int moneyRemaining = money - 1500;
            
            checkBalanceandGiveItem(moneyRemaining,1500,"Rotten steak outside restaraunt dumpster");
            }
        
        else if (option == 4){
            int moneyRemaining = money - 3000;
            
            checkBalanceandGiveItem(moneyRemaining,3000,"if anyone buys this take their money and close down *change food name later*");
            }
        
        else if (option == 5){
            int moneyRemaining = money - 10000;
            
            checkBalanceandGiveItem(moneyRemaining,10000,"Lake water");
            }
            

        typewrite("Thanks For Shopping With Us! Come Again And Get Scammed!!!",250);

        }
        
    
    
    public static void main(String[] args) {
        typewrite("Hey! Welcome to the shop!\n",50);
        println(clean);
        typewrite("How much $$$ do you have?\nEnter here please: ",100);
        int money = keyboard.nextInt();
        if (money < 400){
            println("Sorry...we don't have any products for....a broke person");
        }
        else if (money >= 400){
            
            SnackMenu();
            println("Please enter the number (1, 2, 3...) of your option!");
            int option = keyboard.nextInt();
            VendingMachineIfOptions(option,money);
            
        }
            
    }
    
}
