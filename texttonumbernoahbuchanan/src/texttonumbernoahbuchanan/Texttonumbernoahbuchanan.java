package texttonumbernoahbuchanan;

import java.util.Scanner;
public class Texttonumbernoahbuchanan {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What's the phone number? Enter Here: ");
        String PhoneNumberString = input.next().toUpperCase();
        
        for(int i = 0; i < PhoneNumberString.length(); i++){
            if(PhoneNumberString.charAt(i)=='A'|| PhoneNumberString.charAt(i)=='B'||PhoneNumberString.charAt(i)=='C'){
                System.out.print("2");
            }
            else if(PhoneNumberString.charAt(i)=='D'|| PhoneNumberString.charAt(i)=='E'||PhoneNumberString.charAt(i)=='F'){
                System.out.print("3");
            }
            else if(PhoneNumberString.charAt(i)=='G'|| PhoneNumberString.charAt(i)=='H'||PhoneNumberString.charAt(i)=='I'){
                System.out.print("4");
            }
            else if(PhoneNumberString.charAt(i)=='j'|| PhoneNumberString.charAt(i)=='K'||PhoneNumberString.charAt(i)=='L'){
                System.out.print("5");
            }
            else if(PhoneNumberString.charAt(i)=='M'|| PhoneNumberString.charAt(i)=='N'||PhoneNumberString.charAt(i)=='O'){
                System.out.print("6");
            }
            else if(PhoneNumberString.charAt(i)=='P'|| PhoneNumberString.charAt(i)=='Q'||PhoneNumberString.charAt(i)=='R'||PhoneNumberString.charAt(i)=='S'){
                System.out.print("7");
            }
            else if(PhoneNumberString.charAt(i)=='T'|| PhoneNumberString.charAt(i)=='U'||PhoneNumberString.charAt(i)=='V'){
                System.out.print("8");
            }
            
            else if(PhoneNumberString.charAt(i)=='W'|| PhoneNumberString.charAt(i)=='X'||PhoneNumberString.charAt(i)=='Y'||PhoneNumberString.charAt(i)=='Z'){
                System.out.print("9");
            
            }
            else if(PhoneNumberString.charAt(i)=='0'|| PhoneNumberString.charAt(i)=='O'){
                System.out.print("0");
            }
            else if(PhoneNumberString.charAt(i)=='1'){
                System.out.print("1");
            }
            else{
                System.out.print(PhoneNumberString.charAt(i));
            }

            
        }
        
        
                
    }
    
}
