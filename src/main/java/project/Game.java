package project;

import java.util.Scanner;

/** Define class Game with several methods.
* @author Nathaniel Angus
*/

public class Game {

  // declare field variables
  char[][] board = new char[3][3];
  int rowChoice;
  int colChoice;
  boolean xTurn = true;
  int numberOfRows = 0;
  int numberOfColumns = 0;
  Scanner scan = new Scanner(System.in);

  int countXDiagR = 0;
  int countXDiagL = 0;
  int countODiagR = 0;
  int countODiagL = 0;
  int size = board.length;

  /** constructor for the class.
  */
  public Game(char[][] bd) {

    // assign values to field variables
    board = bd;

  }

  /** make the player's moves.
  */
  public void makeMove() {

    // get choice for row and
    System.out.println("Pick a row for your move.");
    rowChoice = scan.nextInt() - 1;
    System.out.println("Pick a column for your move.");
    colChoice = scan.nextInt() - 1;
    System.out.println(" ");

    // make sure space is blank
    if (board[rowChoice][colChoice] == 'X' || board[rowChoice][colChoice] == 'O') {

      // tell user to pick another spot
      System.out.println("That move is taken, choose another.");

      // ask for move again
      rowChoice = scan.nextInt() - 1;
      colChoice = scan.nextInt() - 1;

    }

    // make sure row choice is valid
    if (rowChoice < 0 || rowChoice > 2) {

      // tell user their choice is too low or too high
      System.out.println("Please make sure your row choice is between 1 and 3");

      // ask for choice again
      rowChoice = scan.nextInt();

    }

    // make sure column choice is valid
    if (colChoice < 0 || colChoice > 2) {

      // tell user their choice is too low or too high
      System.out.println("Please make sure your column choice is between 1 and 3");

      // ask for choice again
      colChoice = scan.nextInt();

    }

    // create instance of board class
    Board boardClass = new Board(board, numberOfRows, numberOfColumns);

    // place an X or an O in the selected space
    if (xTurn == true) {

      // put an X in the selected space
      board[rowChoice][colChoice] = 'X';

      // make it the other players turn
      xTurn = false;

      // reprint the board
      boardClass.boardPrint();

    } else if (xTurn == false) {

      // put an O in the selected space
      board[rowChoice][colChoice] = 'O';

      // make it the other players turn
      xTurn = true;

      // reprint the board
      boardClass.boardPrint();

    }

  }

  /** check the win condition.
  */
  public boolean checkWin() {

    // check to see who wins horizontally
    for (int row = 0; row < size; row++) {

      // declare count variables
      int countX = 0;
      int countO = 0;

      // another loop for column
      for (int col = 0; col < size; col++) {

        // add to count variables if X or O
        if (board[row][col] == 'X') {

          // count X
          countX++;

        } else if (board[row][col] == 'O') {

          // count O
          countO++;

        }

        // return true if somebody wins
        if (countX == size || countO == size) {

          //return true
          return true;

        }

      }

    }

    // check to see who wins vertically
    for (int col = 0; col < size; col++) {

      // declare count variables
      int countX = 0;
      int countO = 0;

      // another loop for column
      for (int row = 0; row < size; row++) {

        // add to count variables if X or O
        if (board[row][col] == 'X') {

          // count X
          countX++;

        } else if (board[row][col] == 'O') {

          // count O
          countO++;

        }

        // return true if somebody wins
        if (countX == size || countO == size) {

          //return true
          return true;

        }

      }

    }

    // check for diagonal win
    // declare variable for middle space
    char check = board[1][1];

    // if middle space is occupied, check corners
    if (check != ' ') {

      // check corners
      if ((board[0][0] == check && board[2][2] == check) || (board[0][2] == check && board[2][0] == check)) {

        // return true
        return true;

      }

    }

    // return false if nobody wins
    return false;

  }

}
