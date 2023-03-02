package case_studies.tictactoe.models;

import case_studies.tictactoe.exceptions.InvalidGameConstructionRequestException;
import case_studies.tictactoe.strategies.game_winning_strategy.GameWinningStrategy;
import case_studies.tictactoe.strategies.game_winning_strategy.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int currentPlayerIndex;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public void displayBoard(){
        this.board.displayBoard();
    }

    private GameWinningStrategy gameWinningStrategy;

    private Game(Board board, List<Player> players){
        this.board = board;
        this.players = players;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.currentPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.gameWinningStrategy = new OrderOneGameWinningStrategy(board.getBoard().size());
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void undo(){

    }


    public static class Builder{
        private Board board;
        private List<Player> players;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        //Support gamewinning strategy

        public Game build() throws InvalidGameConstructionRequestException {
            //Num of players == dimension - 1
            int dimension = board.getBoard().size();
            if(players.size() != dimension -1){
                throw new InvalidGameConstructionRequestException("Number of players is wrong");
            }
            // Only 1 bot per game

            //Randomize the list of players
            return new Game(board, players);
        }
    }

    public void makeMove(){
        System.out.println("It is " + players.get(currentPlayerIndex).getName() + "'s turn" );
        Player player = players.get(currentPlayerIndex);
        Move move = player.makeMove(this.board);
        moves.add(move);
        if(gameWinningStrategy.checkWinner(player, board, move.getCell())){
            this.gameStatus = GameStatus.ENDED;

        } else {
            currentPlayerIndex++;
            currentPlayerIndex = currentPlayerIndex % players.size();
        }
    }

    public Player getWinner(){
        return players.get(currentPlayerIndex);
    }

}
