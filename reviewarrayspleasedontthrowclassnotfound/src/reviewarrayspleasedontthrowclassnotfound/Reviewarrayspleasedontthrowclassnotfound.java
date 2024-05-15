
package reviewarrayspleasedontthrowclassnotfound;
import java.util.Scanner;
import java.util.*;

public class Reviewarrayspleasedontthrowclassnotfound {
    static Scanner input = new Scanner(System.in);
    public static int[] get_nums(int how_many){
        int number_list[] = new int[how_many];
        for(int i=0;i<how_many;i++){
            System.out.println("#" + Integer.toString(i)+ " Enter a number for your list: ");
            number_list[i] = input.nextInt();
        }
        return number_list;
    }
    public static void evens(int[] list) {
        int counter = 0;
        for(int i=0;i<list.length;i++){
            if(list[i] % 2 == 0){
                counter += 1;
            }
        }
        System.out.println("\n-----\nThere are/is: " + Integer.toString(counter) + " even numbers.\n----\n");
    }
    
    
    public static void contains(int find_num){
        Random randomobj = new Random();
        //generate random array
        System.out.println("Generating random array of 7 integers");
        int[] randomnumlist = new int [7];
        for(int i = 0;i<randomnumlist.length;i++){
            randomnumlist[i] = randomobj.nextInt(10);
        }
        for(int i = 0; i<randomnumlist.length;i++){
            System.out.println("Does randomlist[" + Integer.toString(i) + "] (which = " + Integer.toString(randomnumlist[i]) + ") = our number '" + Integer.toString(find_num) + "'?");

            if(randomnumlist[i] == find_num){
                System.out.println("true");
                break;
            }
            else{
                ;
            }
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want: "); 
        int how_many = input.nextInt();
        int[] number_list = get_nums(how_many);
        evens(number_list);    
        System.out.println("----\nPart of assignment for contains()\n----\n");
        System.out.println("What number do you want to look for in a list: ");
        int num = input.nextInt();
        contains(num);
        }
    }
    

