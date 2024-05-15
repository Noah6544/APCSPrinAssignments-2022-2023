
package atmmachinenoahbuchanananannan;

import java.util.Scanner;

public class ATMMACHINENOAHBUCHANANANANNAN {
    // imho, JAVA IS DUMB python >> java. thanks 
    
    
    static Scanner input = new Scanner(System.in);
    private static final String backend_username = "user";
    private static final int backend_pin = 1234;
    private static final String clean = "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

    public static void print(String text){
        System.out.print(text);
    }   
    public static void println(String text){
        System.out.println(text);
    }    
    public static void menu(){
        print(clean);
        println("1. Chack Balance");
        println("2. Deposit Checks");
        println("3. Withdraw");
        println("4. Exit");
    }    
    
    
    
    public static Double deposit(double account_balance){
        print(clean);
        println("Your current balance is: "+Double.toString(account_balance));
        println("How many checks would you like to deposit?");
        print("Enter number of checks here: ");
        int num_of_checks = input.nextInt();
        int count_manager = 1;
        double sum = 0;
        while(count_manager <= num_of_checks){
            print(clean);
            println("How much is check #" + Integer.toString(count_manager)+ "?");
            print("Enter here: ");
            sum += input.nextDouble(); 
            count_manager+=1;
        }
        print("~~~~~~~~~~~~~~~~Deposit complete~~~~~~~~~~~~~~~~");
        account_balance += sum;
        println("Old balance: " + Double.toString(account_balance-sum));
        println("New balance: " + Double.toString(account_balance));      
        
        
        return account_balance;
        
    }
    public static Double withdraw(double account_balance){
        print(clean);
        println("Your current balance is: "+Double.toString(account_balance));
        println("How much would you like to withdraw?");
        print("Enter amount to withdraw here: ");
        Double withdraw_amount = input.nextDouble();
        if(withdraw_amount > account_balance){
            println("You cannot withdraw more than you have in your account.");
        }
        else{         
            print("~~~~~~~~~~~~~~~~Withdrawl complete~~~~~~~~~~~~~~~~");
            account_balance -= withdraw_amount;
            println("Old balance: " + Double.toString(account_balance+withdraw_amount));
            println("New balance: " + Double.toString(account_balance));
            return account_balance;
        }
        
        return account_balance;

        
    }


    public static void main(String[] args) {
        System.out.println("Login:");
        print("Enter Username: ");
        String username = input.next();
        print("Enter PIN: ");
        int pin = input.nextInt();
        if(username.equals(backend_username) && pin == backend_pin){
            print("Welcome.");
            print("Account: user");
            Boolean running = true;
            double account_balance = 0.0;
            while(running){
                menu();
                print("Which option would you like to choose: ");  
                int option = input.nextInt();
                if (option == 1){
                    println(clean);

                    println("You have $" + Double.toString(account_balance)+ " in your account.");
                }
                if (option == 2){
                    account_balance = deposit(account_balance);
                }
                if (option == 3){
                    account_balance = withdraw(account_balance);
                }
                if (option == 4){
                    println("You have beeen successfully logged out.\nThank you for banking with Buchanan Bank today.");
                    running = false;                    
                }
            }
           
            
        }        
        else{
            print("Invalid username or PIN. Please try again.");
        }
                
    }
    
}
