package case_studies.tictactoe.factories;


import case_studies.tictactoe.models.BotDifficultyLevel;
import case_studies.tictactoe.strategies.bot_playing_strategy.BotPlayingStrategy;
import case_studies.tictactoe.strategies.bot_playing_strategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByType(BotDifficultyLevel level){
        switch (level){
            case EASY:
            case MEDIUM:
            case HARD:
                return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
