package practicingarrayseachpartisinamethod;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class PracticingArraysEachPartIsInAMethod {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();


    
    public static void Problem1(){
    System.out.println("Enter 5 names below: ");
    String nameslist[] = new String [5];
    for(int i = 0; i < 5; i+=1){
        System.out.println("Enter name #" + Integer.toString(i+1) + ": ");
        String name = input.next();
        nameslist[i] = name;
    }
    for(int i = 0; i < 5; i+=1){
        System.out.print(nameslist[i].toUpperCase() + "! and... ");
        
    }  
}
    public static void Problem2(){
        Boolean boollist[] = new Boolean[3];
        for(int i = 0; i < 3; i+=1){
            System.out.print("Enter True/False. This is Boolean #" + Integer.toString(i+1) + ": ");
            String userbool = input.next(); // I didn't know nextBoolean exists....doing it the extra long way...
            if ("false".equals(userbool.toLowerCase())){
                Boolean listbooltoadd = false;
                boollist[i] = listbooltoadd;
            }
            else if ("true".equals(userbool.toLowerCase())){
                Boolean listbooltoadd = true;
                boollist[i] = listbooltoadd;
            }
            else {
                System.out.println("Error");
            }
    }
        System.out.println("You entered this string: ");
        
        System.out.println("' "+ Arrays.toString(boollist)+ " '");
    for(int i = 0; i < 3; i+=1){
        Boolean Test = null;
        if(false == boollist[i]){
            System.out.println("No. There's a 'false' in index #" + Integer.toString(i+1) + ". ");
            break;
        }
        else if(true == boollist[i]){
            System.out.println("So far, so good!");
        }
    }
      
    }
    
    public static void Problem3(){
        String [] fire = {"firetruck","fire drill", "fire hydrant","firefighter","fireproof","fire station","fire hose"};
        for(int i = 0; i<fire.length; i++){
            if(fire[i].substring(0,3).equals("fire")){
                fire[i] = fire[i].substring(4);
            }
            else{
                fire[i] = fire[i].substring(5);
            }
            
        }
        
        for(int i = 0; i < fire.length;i++){
            System.out.print(fire[i] + ",");
        }
    }
    public static void Problem4(){
        Double moneylist [] = new Double[4];
        for(int i = 0; i<4; i++){
            System.out.println("Enter Relative #"+Integer.toString(i+1)+"s amount of money spent: ");
            moneylist[i] = input.nextDouble();
        }
        Double sum = 0.00;
        for(int i = 0;i<4;i++){
            sum += moneylist[i];
        }
        System.out.println("You spend $" + Double.toString(sum) + " on family members.");
        

    }
     public static void Problem5(){
        int randomnums [] = new int[5];
        for(int i = 0; i<5; i++){
            randomnums[i] = random.nextInt(10);
            System.out.println(i);
            System.out.println("Square of index #"+Integer.toString(i+1)+" (" + Integer.toString(randomnums[i]) +") is: "+Integer.toString(randomnums[i]*randomnums[i]));
        }
    }
     public static void Problem6(){
        Double decimalarray [] = new Double[20];
        Double sum = 0.0;
        for(int i=0;i<decimalarray.length;i++){
            decimalarray[i] = random.nextDouble();
          
            sum += decimalarray[i];
        }
        
        System.out.println("Mean of this giant array: ");
        System.out.println(sum/decimalarray.length;);
     }
    public static void main(String[] args) {
        Problem1();
        Problem2();
        Problem3();
        Problem4();
        Problem5();
        Problem6();
        }
        
    }
    
    
}
