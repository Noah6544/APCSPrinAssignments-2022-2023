package ticktactoewitha3innarow;
import java.util.Scanner;

public class Ticktactoewitha3innarow {

    private static boolean isX = false;
    static Scanner keyboard = new Scanner(System.in);
    
    public static void print(char [][] b){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i = 0; i < b.length; i++){  
            for(int j = 0; j < b[i].length; j++){
                if(j == 0 ){
                    System.out.print(" | "+ b[i][j] + " ");
                }
                else if( j == 2){
                    System.out.print(" " + b[i][j] + " | ");
                }
                else{ 
                System.out.print(" " + b[i][j] + " ");
            }
        }   
            System.out.println("");

    }
    }
    
    public static char[][] playerTurn(char[][] b){
        //logic of the game
        if(isX == true){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.print("Player X Turn.");
            System.out.print(" Turn Location: ");
            int location = keyboard.nextInt();    
            if(location == 1){
                b[0][0] = 'X';
            }
            else if(location == 2){
                b[0][1] = 'X';
            }
            else if(location == 3){
                b[0][2] = 'X';
            }
            else if(location == 4){
                b[1][0] = 'X';
            }
            else if(location == 5){
                b[1][1] = 'X';
            }
            else if(location == 6){
                b[1][2] = 'X';
            }
            else if(location == 7){
                b[2][0] = 'X';
            }
            else if(location == 8){
                b[2][1] = 'X';
            }
            else if(location == 9){
                b[2][2] = 'X';
            }
        }
        else{
            System.out.print("Player O Turn.");
            System.out.print(" Turn Location: ");
            int location = keyboard.nextInt();
            if(location == 1){
                b[0][0] = 'O';
            }
            else if(location == 2){
                b[0][1] = 'O';
            }
            else if(location == 3){
                b[0][2] = 'O';
            }
            else if(location == 4){
                b[1][0] = 'O';
            }
            else if(location == 5){
                b[1][1] = 'O';
            }
            else if(location == 6){
                b[1][2] = 'O';
            }
            else if(location == 7){
                b[2][0] = 'O';
            }
            else if(location == 8){
                b[2][1] = 'O';
            }
            else if(location == 9){
                b[2][2] = 'O';
            }
        }
        return b;
    }
    
    public static boolean checkWin(char[][] b){
        //check if someone has won
        boolean win = false;
        //CHECK X
        // Check rows for a win
        if ((b[0][0] == 'X' && b[0][1] == 'X' && b[0][2] == 'X') ||
            (b[1][0] == 'X' && b[1][1] == 'X' && b[1][2] == 'X') ||
            (b[2][0] == 'X' && b[2][1] == 'X' && b[2][2] == 'X')) {
            win = true;
        }

        // Check columns for a win
        else if ((b[0][0] == 'X' && b[1][0] == 'X' && b[2][0] == 'X') ||
                 (b[0][1] == 'X' && b[1][1] == 'X' && b[2][1] == 'X') ||
                 (b[0][2] == 'X' && b[1][2] == 'X' && b[2][2] == 'X')) {
            win = true;
        }

        // Check diagonals for a win
        else if ((b[0][0] == 'X' && b[1][1] == 'X' && b[2][2] == 'X') ||
                (b[0][2] == 'X' && b[1][1] == 'X' && b[2][0] == 'X')) {
            win = true;
        }
        
        // CHECK FOR O
        // CHECK ROWS
        if ((b[0][0] == 'O' && b[0][1] == 'O'&& b[0][2] == 'O')||
            (b[1][0] == 'O' && b[1][1] == 'O'&& b[1][2] == 'O')||
            (b[2][0] == 'O' && b[2][1] == 'O'&& b[2][2] == 'O')){
            win = true;
        }

        // Check columns for a win
        else if ((b[0][0] == 'O' && b[1][0] == 'O'&& b[2][0] == 'O')||
                 (b[0][1] == 'O' && b[1][1] == 'O'&& b[2][1] == 'O')||
                 (b[0][2] == 'O' && b[1][2] == 'O'&& b[2][2] == 'O')){
            win = true;
        }

        // Check diagonals for a win
        else if ((b[0][0] == 'O' && b[1][1] == 'O' && b[2][2] == 'O') ||
                (b[0][2] == 'O' && b[1][1] == 'O' && b[2][0] == 'O')) {
            win = true;
        }

        
        return win;

    }
    
    
    
    public static void main(String[] args) {
        char [][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        
        do{
            //switch the player's turn
            if(isX == true){
                isX = false;
            }
            else{
                isX = true;
            }
            
            print(board);
            board = playerTurn(board);
        }
        while(!checkWin(board));
        System.out.println("YOU WIN!!!!!!! AYE NICE THANKS CHAT GTP");

    }
 
}
