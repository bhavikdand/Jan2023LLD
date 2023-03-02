package case_studies.tictactoe.strategies.game_winning_strategy;


import case_studies.tictactoe.models.Board;
import case_studies.tictactoe.models.Cell;
import case_studies.tictactoe.models.Player;

public interface GameWinningStrategy {

    boolean checkWinner(Player player, Board board, Cell cell);
}
