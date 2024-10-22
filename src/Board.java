public class Board {

   /* int[] rowCollection;
    int[] columnCollection;*/
    private int numberOfHorizontalSquares = 7;
    private int numberOfVerticalSquares = 10;
    int[][] board = new int[numberOfHorizontalSquares][numberOfVerticalSquares];
   /* int[][] boardCollection;
    int[][] bombCollection;*/

    public Board() {

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
