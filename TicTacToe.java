
/**
       File: TicTacToe.java
	   Author: Abdul Wahid Pathan
       Date: Apr 23, 2023 2:22:03 p.m.
Description: This is a TicTacToe console application, you can play against an Ai.
 */
import java.util.*;

public class TicTacToe {
   private char[][] board;
   private char playerSymbol;
   private char aiSymbol;
   private int boardSize = 3;
   
   public TicTacToe() {
      board = new char[boardSize][boardSize];
      playerSymbol = 'X';
      aiSymbol = 'O';
      initializeBoard();
   }
   
 	/* Method Name: initializeBoard
 	 * Purpose: To initialize the game board
 	 * Accepts: N/A
 	 * Returns: N/A
 	 */
   private void initializeBoard() {
      for (int i = 0; i < boardSize; i++) {
         for (int j = 0; j < boardSize; j++) {
            board[i][j] = '-';
         }
      }
   }
   
 	/* Method Name: printBoard
 	 * Purpose: To print the game board on console
 	 * Accepts: N/A
 	 * Returns: N/A
 	 */
   public void printBoard() {
      System.out.println("-------------");
      for (int i = 0; i < boardSize; i++) {
         System.out.print("| ");
         for (int j = 0; j < boardSize; j++) {
            System.out.print(board[i][j] + " | ");
         }
         System.out.println();
         System.out.println("-------------");
      }
   }
   
 	/* Method Name: playerMove
 	 * Purpose: Helps the player move their symbol on the game board
 	 * Accepts: row, col of integer type
 	 * Returns: boolean
 	 */
   public boolean playerMove(int row, int col) {
      if (board[row][col] != '-') {
         return false;
      }
      board[row][col] = playerSymbol;
      return true;
   }

   /* Method Name: aiMove
  	 * Purpose: Helps the ai move their symbol on the game board
  	 * Accepts: N/A
  	 * Returns: boolean
  	 */
   public boolean aiMove() {
      int row = (int) (Math.random() * boardSize);
      int col = (int) (Math.random() * boardSize);
      if (board[row][col] != '-') {
         return false;
      }
      board[row][col] = aiSymbol;
      return true;
   }
   
   /* Method Name: isGameOver
  	 * Purpose: Checks to see if the game has finished
  	 * Accepts: N/A
  	 * Returns: boolean
  	 */
   public boolean isGameOver() {
      if (hasWon(playerSymbol) || hasWon(aiSymbol)) {
         return true;
      }
      for (int i = 0; i < boardSize; i++) {
         for (int j = 0; j < boardSize; j++) {
            if (board[i][j] == '-') {
               return false;
            }
         }
      }
      return true;
   }
   
   /* Method Name: hasWon
  	 * Purpose: Checks to see who won
  	 * Accepts: char symbol
  	 * Returns: boolean
  	 */
   private boolean hasWon(char symbol) {
      for (int i = 0; i < boardSize; i++) {
         if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
            return true;
         }
         if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
            return true;
         }
      }
      if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
         return true;
      }
      if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
         return true;
      }
      return false;
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      TicTacToe game = new TicTacToe();
      game.printBoard();
      
      while (!game.isGameOver()) {
         System.out.println("Enter row number (0-2): ");
         int row = scanner.nextInt();
         System.out.println("Enter column number (0-2): ");
         int col = scanner.nextInt();
         if (!game.playerMove(row, col)) {
            System.out.println("Invalid move. Try again.");
            continue;
         }
         game.printBoard();
         if (game.isGameOver()) {
            break;
         }
         System.out.println("AI is making a move...");
         while (!game.aiMove());
         game.printBoard();
      }
      
      if (game.hasWon(game.playerSymbol)) {
         System.out.println("Congratulations! You won!");
      }
      else if (game.hasWon(game.aiSymbol)) {
        	System.out.println("Sorry, you lost. Better luck next time!");
      }
      else {
         System.out.println("It's a tie!");
      }
      
   scanner.close();
   }
}