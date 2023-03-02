package case_studies.tictactoe.strategies.bot_playing_strategy;

import case_studies.tictactoe.models.*;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        for(int row=0; row<board.getBoard().size(); row++){
            for(int col=0; col<board.getBoard().size(); col++){
                Cell cell = board.getCell(row, col);
                if(cell.getCellState().equals(CellState.FILLED)){
                    continue;
                }
                else {
                    cell.placePlayer(player);
                    return new Move(player, cell);
                }
            }
        }
        return null;
    }
}
