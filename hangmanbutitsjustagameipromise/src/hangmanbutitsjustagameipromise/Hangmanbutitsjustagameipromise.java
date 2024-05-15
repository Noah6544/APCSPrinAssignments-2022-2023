/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanbutitsjustagameipromise;
import java.util.Scanner;
public class Hangmanbutitsjustagameipromise {
    static Scanner input = new Scanner(System.in);
    
    public static Boolean true_array(Boolean[] list){
        for (Boolean item: list) {
            if(item== null || item ==false){
                return false;
            }            
        }
        return true;
    }
 
    public static void main(String[] args) {
            System.out.print("Enter the word to guess: ");
            String guessing_word = input.nextLine();
            System.out.println("|\n|\n|\n|\n\n|\n|\n|\n|\n|\n|\n");
            Boolean letters [] = new Boolean [guessing_word.length()];
            System.out.print("Enter how many chances do you want: ");
            int final_number_ofguess = input.nextInt();
            int guesses = 1;
            while(guesses <= final_number_ofguess){
               try{
                    System.out.print("\nEnter a guess (Only First Letter is Read): ");
                    char guess = input.next().charAt(0);
                    System.out.println("\n~~~~~\n");
                   
                    for(int i=0;i<(letters.length);i++){
                        if(true_array(letters)){
                            guesses = final_number_ofguess +1; //instead of putting a break; here, I do this because it prints the final word out
                        }
                        if(" ".equals(guessing_word.charAt(i))){
                            letters[i] = true;
                            System.out.print(" \' \' ");
                        }
                        if(guess == guessing_word.charAt(i)){
                            letters[i] = true;
                        }
                        else{
                            ;
                            }
                        if(letters[i] == null || letters[i]==false){
                            letters[i] = false;
                            System.out.print(" \' _ \' ");
                        }
                        else if(letters[i]==true){
                            System.out.print(" \' " + guessing_word.charAt(i) + " \' ");
                        }
                        
                      
                      
                    }
                    System.out.print("Try #"+Integer.toString(guesses));

                    guesses+=1;

                }
                catch(Exception e){
                        System.out.println(e);
                        System.out.println("\n~~~\nERROR TRY AGAIN\n~~~\n");
                    }
                }
                if(guesses <= final_number_ofguess){
                    System.out.println("\n~~~~~\nI'm sorry, you lost...better luck next time.\nThe final word was: " + guessing_word);
                }
                else{
                    System.out.println("\n~~~~~\nYou Win! The final word was: '" + guessing_word + "'");

                }

            }

    }
    

