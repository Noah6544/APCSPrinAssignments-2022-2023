
package arrayysreviewnoahbuchanan;

import java.util.Scanner;
public class Arrayysreviewnoahbuchanan {
    static Scanner input = new Scanner(System.in);
    public static Int[] get_nums(){
        System.out.println("Enter how many numbers you want: ");
        int how_many = input.nextInt();
        int number_list[] = new int[how_many];
        for(i=0;i<how_many;i++){
            System.out.println("#" + Integer.toString(how_many)+ " Enter a number for your list: ");
            number_list[i] = input.nextint();
        }
        return number_list;
    }
    public static int evens(Int[] list) {
        int counter = 0;
        for(i=0;i<list.length;i++){
            if(list[i] % 2 == 0){
                counter += 1;
        }
        return counter;
    }
    }
    public static void main(String[] args) {
        evens(get_nums);
    }
    
}
