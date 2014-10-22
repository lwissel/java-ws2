/** Exercise 5 ws 2
 *
 * Program to check a given sudoku solution whether it is valid
 *
 * the numbers 1-9 are only allowed to appear exactly once in each row, column
 * and 3x3 subblock matrix of the 9x9 main sudoku matrix
 *
 * it is not nice but it works
 * better to replace the switch statements by proper methods calculating the
 * next position
 *
 * @author  Lennart Wissel
 * @version 22.10.2014
 */
public class Ex5 {
  public static void main(String[] args) { 
    int[][] input = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
            { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
            { 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
            { 8, 9, 1, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 9, 1, 2 },
            { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };

    //run and print the resulting table for convienience
    boolean[][] res = checkSudoku(input);
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(res[i][j] + " ");
        }
        System.out.print("\n");
    }
  }

  /** method to check the rows to have each number only once
   * @param matrix is the sudoku input matrix, row selects which row to test
   * @param row is the row we are going to test
   * @return true if each only once
   */
  public static boolean checkRow(int[][] matrix, int row) {
    int[] a = new int[9];

    // count the occurences of the numbers 1-9 represented by array a
    for(int j = 0; j < matrix.length; j++) {
      switch (matrix[row][j]) {
        case 1: a[0]++; break;
        case 2: a[1]++; break;
        case 3: a[2]++; break;
        case 4: a[3]++; break;
        case 5: a[4]++; break;
        case 6: a[5]++; break;
        case 7: a[6]++; break;
        case 8: a[7]++; break;
        case 9: a[8]++; break;
      }
    }

    // check whether all values are == 1
    for(int j = 0; j < a.length; j++) {
      if (a[j] != 1) {
        return false;
      }
    }
      return true;
  }

  /** method to check the columns to have each number only once
   * @return true if each only once
   * @param matrix is the matrix we check the column of
   * @param col is the column we are checking
   */
  public static boolean checkCol(int[][] matrix, int col) {
    int[] a = new int[9];

    // count the occurences of the numbers 1-9 represented by array a
    // matrix[0] refers to the column length in this case
    for(int j = 0; j < matrix[0].length; j++) {
      switch (matrix[j][col]) {
        case 1: a[0]++; break;
        case 2: a[1]++; break;
        case 3: a[2]++; break;
        case 4: a[3]++; break;
        case 5: a[4]++; break;
        case 6: a[5]++; break;
        case 7: a[6]++; break;
        case 8: a[7]++; break;
        case 9: a[8]++; break;
      }
    }

    // check whether all values are == 1
    for(int j = 0; j < a.length; j++) {
      if (a[j] != 1) {
        return false;
      }
    }
      return true;
  }

  /** method to check the subblock matrices for the occurence of each number
   * @return true if each only once
   * @param matrix is the matrix we check the subsquares of
   * @param sq is the numbered square we check
   */
  public static boolean checkSquare(int[][] matrix, int sq) {

    // parameter sq defines the submatrix
    // sm = start row, sn = startcolumn, em = end row, en = end colum
    // coordinates
    int sm, sn, em, en; 
    switch (sq) {
      case 0: sm = 0; sn = 0; em = 2; en = 2; break;
      case 1: sm = 0; sn = 3; em = 2; en = 5; break;
      case 2: sm = 0; sn = 6; em = 2; en = 8; break;
      case 3: sm = 3; sn = 0; em = 5; en = 2; break;
      case 4: sm = 3; sn = 3; em = 5; en = 5; break;
      case 5: sm = 3; sn = 6; em = 5; en = 8; break;
      case 6: sm = 6; sn = 0; em = 8; en = 2; break;
      case 7: sm = 6; sn = 3; em = 8; en = 5; break;
      case 8: sm = 6; sn = 6; em = 8; en = 8; break;
      default: sm = sn = em = en = 0; break;
    }

    // count the occurences of the numbers 1-9 represented by array a
    // in 3x3 matrix
    int[] a = new int[9];

    for(int m = sm; m <= em ; m++) {
      for (int n = sn; n <= en; n++) {
        switch (matrix[m][n]) {
          case 1: a[0]++; break;
          case 2: a[1]++; break;
          case 3: a[2]++; break;
          case 4: a[3]++; break;
          case 5: a[4]++; break;
          case 6: a[5]++; break;
          case 7: a[6]++; break;
          case 8: a[7]++; break;
          case 9: a[8]++; break;
        }
      }
    }

    // check whether all values are == 1
    for(int j = 0; j < a.length; j++) {
      if (a[j] != 1) {
        return false;
      }
    }
      return true;
  }

  /** method to obtain a 3x9 result array containing whether each row or
   * columns evaluates to true/false according to the sudoku excercise. The
   * last row contains the same information for the subsquares.
   * @param matrix is the input sodoku matrix we are going to check
   * @return is the 3x9 matrix containing the output matrix as written above
   */
  public static boolean[][] checkSudoku(int[][] matrix) {
    if (matrix.length != 9 || matrix[0].length != 9) {
      System.out.println("Not a valid Sudoku table");
      System.exit(0);
    }

    // the result matrix has fixed size.
    boolean[][] result = new boolean[3][9];

    for(int row = 0; row < matrix.length; row++){ result[0][row] = checkRow(matrix,row); }
    for(int col = 0; col < matrix[0].length; col++){ result[1][col] = checkCol(matrix,col); }
    for(int sq = 0; sq < matrix.length; sq++){ result[2][sq] = checkSquare(matrix,sq); }

    return result;
  }
}
