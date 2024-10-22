import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    /**
     * Minesweeper rows.
     */
    final private ArrayList<Character> rowCollection = new ArrayList<>();

    /**
     * Minesweeper columns.
     */
    final private ArrayList<Integer> columnCollection = new ArrayList<>();

    /**
     * Minesweeper matrices representing board.
     */
    final private ArrayList<ArrayList<String>> boardCollection = new ArrayList<ArrayList<String>>();

    /**
     * Creates an instance of this class.
     */
    public Board() {
        rowCollection.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        columnCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26));
    }

    /**
     * Creates a board based on difficulty.
     * @param rows - Number of rows based on difficulty.
     * @param columns - Number of columns based on difficulty.
     */
    private void createBoard(int rows, int columns) {
        ArrayList<String> tempRow = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempRow.add("" + rowCollection.get(i) + columnCollection.get(j));
            }
            boardCollection.add(new ArrayList<>(tempRow));
            tempRow.clear();
        }
        System.out.println(boardCollection.toString());
    }

    public void presentBoard() {
        for(int row = 0; row < numberOfVerticalSquares; row++) {
            System.out.print("   ");
            for(int i = 0; i < numberOfHorizontalSquares; i++) {

                System.out.print("+----");
            }
            System.out.println("+");
            System.out.print(numberOfVerticalSquares-row+"  ");

            for(int column = 1; column < numberOfHorizontalSquares+1; column++) {
                System.out.print("|    ");
            }
            System.out.println("|");
        }

        System.out.print("   ");
        for(int i = 0; i<numberOfHorizontalSquares; i++) {
            System.out.print("+----");
        }
        System.out.println("+");

        System.out.print("      ");
        for(int i =0; i<numberOfHorizontalSquares; i++) {
            System.out.print(numberOfVerticalSquares-numberOfVerticalSquares+i+1+"    ");
        }
    }


    public void placeBomb() {

    }



    public void resetBoard() {

    }

    public boolean checkBomb(int userInput) {

        return false;
    }

    public boolean isWin() {

        return false;
    }

    public int getNumberOfHorizontalSquares() {
        return numberOfHorizontalSquares;
    }

    public void setNumberOfHorizontalSquares(int numberOfHorizontalSquares) {
        this.numberOfHorizontalSquares = numberOfHorizontalSquares;
    }

    public int getNumberOfVerticalSquares() {
        return numberOfVerticalSquares;
    }

    public void setNumberOfVerticalSquares(int numberOfVerticalSquares) {
        this.numberOfVerticalSquares = numberOfVerticalSquares;
    }

}
