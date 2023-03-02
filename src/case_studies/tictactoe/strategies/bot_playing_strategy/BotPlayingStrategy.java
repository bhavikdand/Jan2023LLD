package case_studies.tictactoe.strategies.bot_playing_strategy;


import case_studies.tictactoe.models.Board;
import case_studies.tictactoe.models.Move;
import case_studies.tictactoe.models.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player player);

}
