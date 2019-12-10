package project;

import java.lang.Boolean;
import java.util.Scanner;

/** TIcTacToe class contains the main method.
* It creates instances of Board and game classes
* and uses methods within those classes
* @author Nathaniel Angus
*/

public class Main {

  /** main method to implement input and output.
  */
  public static void main(String[] args) {

    //variable declaration
    Scanner scan = new Scanner(System.in);
    String welcomeName;
    char[][] board = new char[3][3];
    int numberOfRows = 0;
    int numberOfColumns = 0;
    int numberofMoves = 0;

    //Print welcome message
    System.out.println("Welcome to Tic Tac Toe. To begin, type the player's names.");
    welcomeName = scan.next();

    // instance of board class and draw board
    Board boardClass = new Board(board, numberOfRows, numberOfColumns);
    boardClass.boardSetup();
    System.out.println(" ");
    boardClass.boardPrint();

    // tell X to make the first move
    System.out.println(" ");
    System.out.println("X goes first.  It is X's turn.");

    // instance of game class to make a move
    Game game = new Game(board);
    game.makeMove();

    // next turns
    while (game.checkWin() == false && numberofMoves < 9) {

      // print turn message
      System.out.println(" ");
      System.out.println("Make your next move.");

      // make the move
      game.makeMove();

      // tie if nine moves made
      numberofMoves++;

    }

    // Thank user for playing and end game
    System.out.println("That's the game! Thanks for playing.");

  }

}
