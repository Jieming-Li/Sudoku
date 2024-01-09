package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame Game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
