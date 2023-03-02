package case_studies.tictactoe.models;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int row = sc.nextInt();
        System.out.println("Enter col number");
        int col = sc.nextInt();


        Cell cell = board.getCell(row, col);

        // validate the cell at row,col

        //update state
        cell.placePlayer(this);

        return new Move(this, cell);
    }

}
