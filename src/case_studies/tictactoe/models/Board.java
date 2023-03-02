package case_studies.tictactoe.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    public List<List<Cell>> getBoard() {
        return board;
    }
    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public Board(int dimension){
        board = new ArrayList<>();
        for(int i=0; i<dimension; i++){
            List<Cell> row = new ArrayList<>();
            for(int j=0; j<dimension; j++){
                row.add(new Cell(i, j));
            }
            board.add(row);
        }

    }

    public void displayBoard(){
        for(int row=0; row<board.size(); row++){
            for(int col=0; col < board.size(); col++){
                System.out.print("| ");
                Cell cell = board.get(row).get(col);
                if(cell.getCellState().equals(CellState.FILLED)){
                    System.out.print(" " + cell.getPlayer().getSymbol() +" ");
                } else {
                    System.out.print("   ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public Cell getCell(int row, int col){
        return board.get(row).get(col);
    }
}
