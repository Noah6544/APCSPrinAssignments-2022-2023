
package gradecalcnoahbuchanan;
import java.util.Scanner;

public class GradeCalcNoahBuchanan {
    static Scanner input = new Scanner(System.in);
    public static void print(String text){
        System.out.println(text);
    }
    public static int average(int num, int howmany) {
        System.out.println(num);
        System.out.println(howmany);

        return num/howmany;
    }

    public static void calculator() {
        Boolean breakvar = true;
        int count = 1;   
        int sum = 0;
        int grade = 0;
        print("Let\'s calculate your grade. Enter all of your grades and we'll average them.");
        while(breakvar==true){
            System.out.println(count);
            System.out.println("Enter Your Grade (#"+Integer.toString(count) + "): ");
            grade = input.nextInt();
            sum = grade + sum;
            System.out.println("Enter 0 if you want to stop otherwise, enter any other number (this won't be calculated): ");
            int stop = input.nextInt();
            if(stop == 0){
                breakvar = false;
            }
            else{
                count += 1;
                }
            

        }
        int gradeavg = average(sum,count);
        if(gradeavg >= 90){
            print("You have an A. your avg grade is: " + Integer.toString(gradeavg));
        }
        else if(gradeavg >= 80){
            print("You have an B. your avg grade is: " + Integer.toString(gradeavg));
        }
        else if(gradeavg >= 70){
            print("You have an c. your avg grade is: " + Integer.toString(gradeavg));
        } 
        else if(gradeavg >= 60){
            print("You have an D. your avg grade is: " + Integer.toString(gradeavg));
        }
        else{
            print("Lock in you are failing. your avg grade is: " + Integer.toString(gradeavg));
        }     
    }
        

public static void main(String[] args) {       
    calculator();
}
    
}