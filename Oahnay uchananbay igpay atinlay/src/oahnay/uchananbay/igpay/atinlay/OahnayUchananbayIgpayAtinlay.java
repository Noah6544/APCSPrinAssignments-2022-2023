package oahnay.uchananbay.igpay.atinlay;

import java.util.Scanner;
import java.lang.*;
import java.text.StringCharacterIterator;
import java.util.Arrays;
public class OahnayUchananbayIgpayAtinlay {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to my piglatin translator! bananman! yea that tr9ght!IOH!Oihoig hadih faoidsfj oasidjf alskdf");
        System.out.println("Pig Latin Translation: ");
        String pigstring = input.nextLine();
        Character vowels [] = new Character [5]; //PRAKASH helped with this but his version broke mine worked ;)
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';        
        for(int i = 0; i< pigstring.length(); i++){
            String vowel = pigstring.substring(i,i+1);
            String mid = pigstring.substring(i+1);
            String end = pigstring.substring(0,i);
            if(Arrays.asList(vowels).contains(pigstring.charAt(0))){ // IF IT STARTS WITH A VOWEL
                System.out.println(vowel + mid + end + "way");
                break;
            }
            else{                                                      // IF IT DOESN'T VOWEL START WITH
                System.out.println( mid + end + vowel + "ay");
                break;
            }
        }
        
                
    }
    
}
