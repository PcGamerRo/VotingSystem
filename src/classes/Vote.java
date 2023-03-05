package classes;

public interface Vote {
    void submit(Candidate x) throws InvalidVoteException;
}
