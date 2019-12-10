package project;

/** Define class Board with several methods.
* @author Nathaniel Angus
*/

public class Board {

  // declare field variables
  private char[][] board = new char[3][3];
  private int numberOfRows = 0;
  private int numberOfColumns = 0;

  /** constructor for the class.
  */
  public Board(char[][] bd, int numRows, int numCol) {

    // assign values to field variables
    board = bd;
    numberOfRows = numRows;
    numberOfColumns = numCol;

  }

  /** initialize the board.
  */
  public void boardSetup() {

    // put blank spaces in all array spaces
    while (numberOfRows < 3 && numberOfColumns < 3) {

      // assign blank space
      board[numberOfRows][numberOfColumns] = ' ';

      // add one to rows and columns
      numberOfRows++;
      numberOfColumns++;

    }

  }

  /** print the board.
  */
  public void boardPrint() {

    // print the game board
    System.out.println(board[0][0] + "  |" + board[0][1] + "   |" + board[0][2]);
    System.out.println("---+---+---");
    System.out.println(board[1][0] + "   |" + board[1][1] + "  |" + board[1][2]);
    System.out.println("---+---+---");
    System.out.println(board[2][0] + "   |" + board[2][1] + "   |" + board[2][2]);

  }

}
