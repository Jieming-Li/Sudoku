package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGaame Game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
