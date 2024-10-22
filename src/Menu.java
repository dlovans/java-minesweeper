import java.util.Scanner;

public class Menu {

    boolean isRunning = true;

    int userInputInt;
    String userInputString;

    Scanner scanner = new Scanner(System.in);
    Player player = new Player("Player");
    Board board;
    Game game;

    /**
     * Runs the menu
     */
    public void run(){
        System.out.println("Minesweeper");
        while(isRunning){
            System.out.println("1: Play game\n2: Scoreboard\n3: Create Player\n4: Quit");
            checkInput();
            //Checks if the input is within the chosen parameter
            if(userInputInt > 0 && userInputInt < 5)
            {
                //Uses said input for next options
                if (userInputInt == 1)
                {
                    difficulty();
                    game.gameLoop(player,board);
                } else if (userInputInt == 2) {
                    scoreBoard();
                } else if (userInputInt == 3) {
                    createPlayer();
                } else if (userInputInt == 4) {
                    isRunning = false;
                }
            }
            //Otherwise it will say this
            else{
                System.out.println("Wrong input");
            }
        }
    }

    /**
     * checks what has been input from the user
     */
    private void checkInput()
    {
        if(scanner.hasNextInt())
        {
            userInputInt = scanner.nextInt();
            scanner.nextLine();
        } else if (scanner.hasNext()) {
            userInputString = scanner.nextLine();
        } else {
            scanner.nextLine();
        }
    }

    /**
     * Chooses the difficulty of the game
     */
    private void difficulty()
    {
        System.out.println("1: Easy 5x5\n2: Medium 7x7\n3: Hard 10x10");
        checkInput();
        if(userInputInt > 0 && userInputInt < 4)
        {
            if (userInputInt == 1) {
                board.setNumberOfHorizontalSquares(5);
                board.setNumberOfVerticalSquares(5);
            } else if (userInputInt == 2) {
                board.setNumberOfHorizontalSquares(7);
                board.setNumberOfVerticalSquares(7);
            } else if (userInputInt == 3) {
                board.setNumberOfHorizontalSquares(10);
                board.setNumberOfVerticalSquares(10);
            }
        } else {
            System.out.println("Wrong input");
        }
    }

    /**
     * Writes out the score of the player
     */
    private void scoreBoard()
    {
        System.out.println(player.name + " has won: " + player.wins);
    }

    /**
     * Creates the player object
     */
    private void createPlayer()
    {
        System.out.println("What is your name?");
        checkInput();
        player.name = userInputString;
    }
}
