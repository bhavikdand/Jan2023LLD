package case_studies.tictactoe;

import case_studies.tictactoe.controllers.GameController;
import case_studies.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert dimension of the board");
        int dimension = sc.nextInt();
        int numOfPlayers = dimension -1;

        System.out.println("Do you want a bot in the game? Write y/n");
        String botInput = sc.next();

        List<Player> players = new ArrayList<>();
        if(botInput.equalsIgnoreCase("y")){
            numOfPlayers--;
            Bot bot = new Bot("Bot-1", 'B', BotDifficultyLevel.EASY);
            players.add(bot);
        }


        for(int i=0; i<numOfPlayers; i++){
            System.out.println("Enter name for " + i + "th player");
            String name = sc.next();

            System.out.println("Enter symbol for " + name);
            char symbol = sc.next().charAt(0);
            Player player = new Player(name, symbol);
            players.add(player);
        }

        GameController gameController = new GameController();

        Game game;
        try {
            game = gameController.createGame(dimension, players);
        } catch (Exception e){
            System.out.println("Incorrect params give, please restart the game");
            return;
        }

        System.out.println("Starting game now!!!");
        boolean isFirstRound = true;
        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("Current board status");
            gameController.displayBoard(game);
            if(!isFirstRound){
                System.out.println("Do you want to undo? Write y/n");
                String undoInput = sc.next();
                if(undoInput.equalsIgnoreCase("y")){
                    gameController.undo(game);
                } else {
                    gameController.makeMove(game);
                }
            } else {
                gameController.makeMove(game);
            }

            isFirstRound = false;
        }
        Player winner = gameController.getWinner(game);
        System.out.println("Game has ended. " + winner.getName() + "has won!" );
        System.out.println("Final board!!");
        gameController.displayBoard(game);



    }
}