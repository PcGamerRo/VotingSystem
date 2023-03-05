package main;

import classes.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("EVENT 1 ||||||||||||| 75%");
        System.out.println("EVENT 2 ||||| 25%");

        Candidate.c_counter = 1;
        Candidate.totalVotes = 0;
        Voter.v_counter = 1;

        Candidate candidate1 = new Candidate();
        Candidate candidate2 = new Candidate();
        Voter voter1 = new Voter();
        Voter voter2 = new Voter();

//        try {
//            voter1.submit(candidate1);
//        } catch (InvalidVoteException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            voter1.submit(candidate1);
//        } catch (InvalidVoteException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            voter2.submit(candidate1);
//        } catch (InvalidVoteException e) {
//            System.out.println(e.getMessage());
//        }

        HashMap<Candidate,Integer> map = new HashMap<>();
        map.put(candidate1,candidate1.votes);
        map.put(candidate2,candidate2.votes);
        Graph g = new Graph(map);

        System.out.println("_________________________");
        System.out.format("Total votes: %d", Candidate.totalVotes);

    }
}