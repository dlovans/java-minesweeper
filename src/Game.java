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
}
