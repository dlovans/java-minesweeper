import java.util.Arrays;

public class Board {

    private int rowCollection = 7;
    private int columnCollection = 10;
    /*private char[] rowTest;
    private char[] columnTest;
    private String [][] boardTest;*/
    int[][] boardCollection = new int[rowCollection][columnCollection];

   /*
    int[][] bombCollection;*/

    public Board() {

    }


/* SAVE FOR LATER PERHAPS
    public Board() {
        this.rowTest = new char[]{'a', 'b', 'c', 'd', 'e'};
        this.columnTest = new char[]{'1', '2', '3', '4', '5'};



    }

    public void createBoard() {
        String[] temporaryRow = new String[columnTest.length];
        for(int i = 0; i < rowTest.length; i++) {
            for(int j = 0; j < columnTest.length; j++) {
                temporaryRow[j] = "" + rowTest[i] + columnTest[j];
//                System.out.println("" + rowTest[i] + columnTest[j]);
            }
            boardTest[i] = temporaryRow;
        }
        System.out.println((Arrays.deepToString(boardTest)));

    }

 */



    public void printBoard() {
        for(int row = 0; row < columnCollection; row++) {
            System.out.print("   ");
            for(int i = 0; i < rowCollection; i++) {

                System.out.print("+----");
            }
            System.out.println("+");
            System.out.print(columnCollection -row+"  ");

            for(int column = 1; column < rowCollection +1; column++) {
                System.out.print("|    ");
//                System.out.print("| " + row + "," + (column - 1) + " ");
            }
            System.out.println("|");
        }

        System.out.print("   ");
        for(int i = 0; i< rowCollection; i++) {
            System.out.print("+----");
        }
        System.out.println("+");

        System.out.print("      ");
        for(int i = 0; i< rowCollection; i++) {
            System.out.print(columnCollection - columnCollection +i+1+"    ");
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

    public boolean choosePosition(int userInputRow, int userInputColumn) {
        return false;
    }

    public int getRowCollection() {
        return rowCollection;
    }

    public void setRowCollection(int rowCollection) {
        this.rowCollection = rowCollection;
    }

    public int getColumnCollection() {
        return columnCollection;
    }

    public void setColumnCollection(int columnCollection) {
        this.columnCollection = columnCollection;
    }
}
