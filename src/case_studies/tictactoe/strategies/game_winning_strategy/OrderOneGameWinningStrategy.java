package case_studies.tictactoe.strategies.game_winning_strategy;

import case_studies.tictactoe.models.Board;
import case_studies.tictactoe.models.Cell;
import case_studies.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{

    List<Map<Character, Integer>> rowCounts;
    List<Map<Character,Integer>> colCounts;

    Map<Character, Integer> topLeftDiagonal;

    Map<Character, Integer> topRightDiagonal;

    int dimension;

    public OrderOneGameWinningStrategy(int dimension){
        this.dimension = dimension;
        List<Map<Character, Integer>> row = new ArrayList<>();
        for(int i=0; i<dimension; i++){
            row.add(new HashMap<>());
        }
        this.rowCounts = row;

        List<Map<Character, Integer>> col = new ArrayList<>();
        for(int i=0; i<dimension; i++){
            col.add(new HashMap<>());
        }
        this.colCounts = col;

        this.topLeftDiagonal = new HashMap<>();

        this.topRightDiagonal = new HashMap<>();
    }

    private boolean isCellOnTopLeftDiagonal(int row, int col){
        return row == col;
    }

    private boolean isCellOnTopRightDiagonal(int row, int col){
        return row + col == dimension - 1;
    }

    @Override
    public boolean checkWinner(Player player, Board board, Cell cell) {
        int row = cell.getRow();
        int col = cell.getCol();

        char symbol = player.getSymbol();

        //update existing maps
        rowCounts.get(row).put(symbol, rowCounts.get(row).getOrDefault(symbol, 0) + 1);
        colCounts.get(col).put(symbol, colCounts.get(col).getOrDefault(symbol, 0) + 1);

        if(isCellOnTopLeftDiagonal(row,col)){
            topLeftDiagonal.put(symbol, topLeftDiagonal.getOrDefault(symbol, 0) + 1);
        }

        if(isCellOnTopRightDiagonal(row,col)){
            topRightDiagonal.put(symbol, topRightDiagonal.getOrDefault(symbol, 0) + 1);
        }


        //check if someone has won
        if(rowCounts.get(row).getOrDefault(symbol, 0) == dimension ||
                colCounts.get(col).getOrDefault(symbol, 0) == dimension){
            return true;
        }

        if(isCellOnTopLeftDiagonal(row, col) && topLeftDiagonal.getOrDefault(symbol, 0) == dimension){
            return true;
        }

        if(isCellOnTopRightDiagonal(row, col) && topRightDiagonal.getOrDefault(symbol, 0) == dimension){
            return true;
        }

        return false;
    }
}
