package classes;

public class InvalidVoteException extends Throwable {
    private String message;
    public InvalidVoteException(String message)
    {
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
