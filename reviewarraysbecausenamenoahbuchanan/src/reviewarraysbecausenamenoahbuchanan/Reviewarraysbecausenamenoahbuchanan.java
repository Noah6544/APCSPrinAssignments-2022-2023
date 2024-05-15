


package reviewarraysbecausenamenoahbuchanan;
import java.util.Scanner;

public class Reviewarraysbecausenamenoahbuchanan {

    static Scanner input = new Scanner(System.in);
    public static int[] get_nums(int how_many){
        int number_list[] = new int[how_many];
        for(int i=0;i<how_many;i++){
            System.out.println("#" + Integer.toString(i)+ " Enter a number for your list: ");
            number_list[i] = input.nextInt();
        }
        return number_list;
    }
    public static int evens(int[] list) {
        int counter = 0;
        for(int i=0;i<list.length;i++){
            if(list[i] % 2 == 0){
                counter += 1;
        }
        return counter;
    }
    }
    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want: "); 
        int how_many = input.nextInt();
        int[] number_list = get_nums(how_many);
        evens(number_list);
    }
    
}
    
}
