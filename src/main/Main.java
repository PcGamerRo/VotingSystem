package main;

import classes.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Candidate.c_counter = 1;
        Candidate.totalVotes = 0;
        Voter.v_counter = 1;

        Candidate candidate1 = new Candidate();
        Candidate candidate2 = new Candidate();
        Voter voter1 = new Voter();
        Voter voter2 = new Voter();
        Voter voter3 = new Voter();
        Voter voter4 = new Voter();

        try {
            voter1.submit(candidate1);
        } catch (InvalidVoteException e) {
            throw new RuntimeException(e);
        }
        try {
            voter2.submit(candidate1);
        } catch (InvalidVoteException e) {
            System.out.println(e.getMessage());
        }
        try {
            voter3.submit(candidate2);
        } catch (InvalidVoteException e) {
            System.out.println(e.getMessage());
        }
        try {
            voter4.submit(candidate2);
        } catch (InvalidVoteException e) {
            System.out.println(e.getMessage());
        }

        HashMap<Candidate,Integer> map = new HashMap<Candidate,Integer>();
        map.put(candidate1,candidate1.votes);
        map.put(candidate2,candidate2.votes);

        Graph g = new Graph(map);
        g.Display();
        System.out.println("_________________________");
        System.out.format("Total votes: %d", Candidate.totalVotes);
    }
}