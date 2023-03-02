package case_studies.tictactoe.models;


import case_studies.tictactoe.factories.BotPlayingStrategyFactory;
import case_studies.tictactoe.strategies.bot_playing_strategy.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol, BotDifficultyLevel level){
        super(name, symbol);
        this.botDifficultyLevel = level;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByType(level);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
         return botPlayingStrategy.makeMove(board, this);
    }
}
