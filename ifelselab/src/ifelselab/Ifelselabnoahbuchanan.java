
package ifelselab;

import java.util.Scanner;


public class Ifelselab {
    
    static Scanner keyboard = new Scanner(System.in);
    //problem 1 if its > 70 print passing otherwise print not passing
    
    static String lines = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    
    //i HATE java system.out.println(lasdjkfa;lsdjflaskdjflsakdjf) just say print
    public static void print(String thing){
        System.out.println(thing);
    }
    
    public static int getintinput(){
       int num = keyboard.nextInt();
       return num;
    }
    
    public static String getstringinput(String startext){
        print(startext);
        String text = keyboard.nextLine();
        return text;
    }
    public static void problem1(){
        print(lines);
        print("Enter a number for some reason: ");
        int num = getintinput();
        if(num > 70){
            print("you passing");
        }
        else{
            print("you failing");
        }
        print(lines);
    }

    public static void problem2(){
        print(lines);
        print("Enter a number for some reason: ");
        int num = keyboard.nextInt();
        if(num <= 50){
            print("GO");
        }
        else{
            print("STOP");
        }
        print(lines);
    }

    public static void problem3(){
        print(lines);
        print("Enter a num to check if it's even or odd if you're very dumb sorry");

        int num = keyboard.nextInt();
        if(num % 2 == 0){
            print("YOU'RE NUMBER'S EVEN!");
            }
        else{
            print("YOU'RE NUMBER IS ODDD!");
        }
        print(lines);
    
    }
    
    public static void problem4(){
        print(lines);
        print("Enter a number to check if it's divisible by 5: ");
        int num = getintinput();
        if(num % 5 == 0 ){
            print("MULTIPLE OF 5");
        }
        else{
            print("NOT A MULTIPLE OF 5");
        }        
        print(lines);
    }

    public static void problem5(String[] args){
        print(lines);
        print("Enter a number to check its digits: ");
        int num = getintinput();
        if(num < 10){
            print("ONE DIGIT");
        }
        else if(num >99){
            print("THREE DIGITS");
        }
        else{
            print("its probably 2 digits, or more than 3 digits idk");
        }   
        print(lines);
    }

    public static void problem6(String[] args){
        print(lines);
        print("Enter a number cuz im a seahawks fan: ");
        int num = getintinput();
        //+1 java || looks clean
        if(num == 12 || num == 71 || num == 80){
           print("THAT NUMBER IS RETIRED FROM SEATTLE SEAHAWKS!!!");
        }
        else{
            //do nothing
        }
        print(lines);
    }

    public static void problem7(
    ){
        print(lines);
        String state = getstringinput("Enter a state: ");
        state = state.toLowerCase();
        print(state);
        
        if(state.equals("washington") || state.equals("orgon") || state.equals("idaho")){
            print("This state is in the PNW!");
        }
        else{
            print("You should CONSIDER moving to the PNW; it's great here");
        }
        print(lines);
        
        
    }
        
    public static void problem8(){
        print(lines);
        String cupsize = getstringinput("Enter the size of drink you want:\n1. SHORT\n2. TALL\n3. GRANDE\n4. VENTI");
        cupsize = cupsize.toLowerCase();
        if (cupsize.equals("short") || cupsize.equals("1")){
            print("8 ounces");
        }
        else if (cupsize.equals("tall") || cupsize.equals("2")){
            print("8 ounces");
        }
        else if (cupsize.equals("grande") || cupsize.equals("3")){
            print("8 ounces");
        }
        else if (cupsize.equals("venti") || cupsize.equals("4")){
            print("20 ounces");
        }
        else{
            print("Didn't recognize that input");
        }
        print(lines);
    
    }    
    
  
    public static void main(String[] args) {

        problem7();
        problem8();
     }
}
