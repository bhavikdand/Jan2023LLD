package case_studies.tictactoe.exceptions;

public class InvalidGameConstructionRequestException extends Exception{

    public InvalidGameConstructionRequestException(String message){
        super(message);
    }
}
