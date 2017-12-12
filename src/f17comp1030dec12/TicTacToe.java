package f17comp1030dec12;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class TicTacToe {
    private static String[][] gameBoard;
    private static String currentPlayer;
    
    public static void main(String[] args)
    {
        gameBoard = new String[3][3];
        currentPlayer = "X";
        
        initalizeGameBoard();
        
       // do{
            displayGameBoard();
            makeMove();
     //   } while (!gameWon());
        
    }
    
    /**
     * This method will prompt the user for a position
     * in the game and validate the inputs until a valid
     * position is given
     */
    public static void makeMove()
    {
        int row, col;
        do
        {
            //prompt user for position
            Scanner keyboard=new Scanner(System.in);
            System.out.print("Enter the row (1-3): ");
            row=keyboard.nextInt();
            
            System.out.print("Enter the col (1-3): ");
            col=keyboard.nextInt();
        } while (invalidPosition(--row, --col));
    }
    
    /**
     * This method receives a row and col, it will check for the following:
     * -row is in the range 0-2
     * -col is in the range 0-2
     * -the position in the grid has a " " (space), not a X or O
     * @return if it is invalid, this returns true
     */
    public static boolean invalidPosition(int row, int col)
    {
        if (row<0 || row >2 || col<0 || col>2)
        {
            System.out.printf("Rows and columns must be in the range 1-3%n");
            return true;
        }
        
        if (!gameBoard[row][col].equals(" ")) //The position is not a space and therefore not free
        {
            System.out.printf("That position is already taken%n");
            return true;
        }
        else
            return false;
    }
    /**
     * This method will put a space character into every
     * position in the array
     */
    public static void initalizeGameBoard()
    {
        for (int row=0; row<gameBoard.length; row++)
        {
            for (int col=0; col<gameBoard[row].length; col++)
            {
                gameBoard[row][col]=" ";    
            }
        }
    }
    
    /**
     * This method will parse over the gameBoard and display it
     * to the console
     */
    public static void displayGameBoard()
    {
        for (int row=0; row<gameBoard.length; row++)
        {
            for (int col=0; col<gameBoard[row].length; col++)
            {
                //if col is 0 or 1 draw in the | (vertical bar)
                if (col < 2)
                    System.out.printf(" %s |", gameBoard[row][col]);
                else
                    System.out.printf(" %s %n", gameBoard[row][col]);
            }
            if (row < 2)
                System.out.printf("-----------%n");
        }
    }
}
