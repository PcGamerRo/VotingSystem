package classes;

public class Voter extends Entity implements Vote {
    public static int v_counter;
    private boolean voted=false;
    public Voter()
    {
        super("unknown");
        increment();
    }
    public Voter(String name)
    {
        super(name);
        increment();
    }

    @Override
    public void increment() {
        v_counter++;
    }

    @Override
    public void submit(Candidate x) throws InvalidVoteException{
        if (voted==false) {
            x.votes++;
            Candidate.totalVotes++;
            voted = true;
        }
        else throw new InvalidVoteException("this voter has already voted");
    }
}
