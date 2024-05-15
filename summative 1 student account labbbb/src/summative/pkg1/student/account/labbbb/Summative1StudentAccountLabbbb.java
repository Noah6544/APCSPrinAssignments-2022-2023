
package summative.pkg1.student.account.labbbb;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Summative1StudentAccountLabbbb {

static Scanner input = new Scanner(System.in);
static Random random = new Random();
    public static void showroster(String [] names, int [] numbers,String[] emails){
        int i = 0;
        while(i<names.length){
            System.out.println("----------\nDisplaying Student Database\n-----\n----------");
            System.out.println("Information For \'"+names[i]+".\'");
            System.out.println("Student's Name: "+ names[i]);
            System.out.println("Student's ID: "+ Integer.toString(numbers[i]));
            System.out.println("Student's Email: "+ emails[i]);
            System.out.println("\n-----");
            i++;
            
        }
        System.out.println("Compete. Enjoy Your Day ADMIN_USER: Jessie Smith!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome, ADMIN_USER: Jessie, Smith");
        String student_names [] = new String [5];
        int student_numbers [] = new int [5];
        String student_emails [] = new String [5];
        int loop_counter = 0;
        System.out.println("-----");
        while(loop_counter < student_names.length){
            System.out.println("Enter Student first and last name #"+Integer.toString(loop_counter+1)+ ": ");
            student_names[loop_counter] = input.nextLine().toUpperCase();
            int random_student_num = random.nextInt(999999-111111+1)+111111;
            student_numbers[loop_counter] = random_student_num;
            System.out.println("Generating Unique Student Number. It is: "+Integer.toString(random_student_num));
            loop_counter += 1;
        }
        System.out.println("------\nComleted Student Name Registration: Here are the names:");
        System.out.println(Arrays.toString(student_names)+"\n------");
        
        // GENERATING EMAIL ADRESSES
        loop_counter = 0;
        while(loop_counter < student_emails.length){
            String student = student_names[loop_counter];
            int student_num = student_numbers[loop_counter];
            char first_initial = student.charAt(0);
            int firstname_lastname_intdivide = 0;
            for(int i = 0;i<student.length();i++){ /// Pretty proud of figuring this by myself
                if(' '== (student.charAt(i))){      /// cuz i was working ahead
                    firstname_lastname_intdivide = i;
                    break;
                }         
                else{
                    if((student_emails.length)==i){
                        System.out.println("Last Name Not found");
                    }
                }
            }
            String last_name = student.substring(firstname_lastname_intdivide+1,(student.length()));
            String email = (first_initial + last_name + Integer.toString(student_num%1000)+"@GO.TAHOMASD.US.");
            student_emails[loop_counter] = email;
            System.out.println("Generating Email#"+Integer.toString(loop_counter+1));
            loop_counter += 1;
        }
        showroster(student_names,student_numbers,student_emails);
    }
    
}
