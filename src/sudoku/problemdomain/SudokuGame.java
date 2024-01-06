package sudoku.problemdomain;

import java.io.Serializable;//read and write this particular game data file to a file on the operating system easier

public class SudokuGame implements Serializable{
    private final GameState gameState;
    private final int[][] girdState;

    public static final int GRID_BOUNDRY = 9;
    public SudokuGame(GameState gameState, int[][] girdState) {
        this.gameState = gameState;
        this.girdState = girdState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGirdState() {
        return SudokuUtilities.copyToNewArray(girdState);
    }
}
