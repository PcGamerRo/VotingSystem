package classes;

public class Candidate extends Entity {
    private final int id;
    public static int c_counter;
    public int votes = 0;
    public static int totalVotes;
    public Candidate() {
      super("candidate #"+c_counter);
        this.id = c_counter;
        increment();
    }
    public Candidate(String name) {
        super(name);
        this.id = c_counter;
        increment();
    }

    public int getId(){
        return id;
    }

    @Override
    public void increment() {
        c_counter++;
    }
}
