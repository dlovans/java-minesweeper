import java.util.Scanner;

/**
 * Represents game of minesweeper.
 */
public class Game {
    /**
     * Player playing minesweeper.
     */
    Player player;

    /**
     * Board of minesweeper.
     */
    Board board;

    /**
     * Reads input from stdout.
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * User menu selection.
     */
    int userInput;

    /**
     * Creates a game instance.
     * @param player - Player playing this game.
     * @param board - The board of minesweeper.
     */
    public Game(Player player, Board board) {
        this.player = player;
        this.board = board;
    }

    /**
     * Loop over the game.
     * @param player - Player playing the game.
     * @param board - Board of minesweeper.
     */
    public void gameLoop(Player player, Board board) {
        while(true) {
            board.printBoard();
            System.out.println("Unlock a square, enter row and column: ");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
            } else {
                System.out.println("Enter a valid digit.");
                continue;
            }

            if (!checkBomb(userInput)) {
                board.printBoard();
                System.out.println("Square already occupied. Select another square.");
                continue;
            } else {
                board.printBoard();
                if (board.isWin()) {
                    System.out.println("You won this round!");
                    player.incrementWins();
                    player.gamesPlayed++;
                    System.out.println(player.getName() + " has won " + player.getWins());
                    System.out.println(player.getName() + " has lost " + player.getGamesPlayed() - player.getWins());
                    System.out.println("Starting a new round...");
                    board.resetBoard();
                } else {
                    System.out.println("You lost this round!");
                    player.gamesPlayed++;
                    System.out.println(player.getName() + " has won " + player.getWins());
                    System.out.println(player.getName() + " has lost " + player.getGamesPlayed() - player.getWins());
                    System.out.println("Starting a new round...");
                    board.resetBoard();
                }
            }
        }
    }
}

