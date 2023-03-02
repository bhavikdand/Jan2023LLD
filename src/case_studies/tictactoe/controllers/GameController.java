package case_studies.tictactoe.controllers;

import case_studies.tictactoe.exceptions.InvalidGameConstructionRequestException;
import case_studies.tictactoe.models.*;

import java.util.List;

public class GameController {

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public Game createGame(int dimension, List<Player> players) throws InvalidGameConstructionRequestException {
        return Game.getBuilder()
                .setBoard(new Board(dimension))
                .setPlayers(players)
                .build();
    }

    public void undo(Game game){
        game.undo();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
