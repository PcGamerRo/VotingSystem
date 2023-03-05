package classes;


import jdk.jfr.Percentage;

import java.util.Map;

public class Graph {
    private int[] percentages;
    private String[] candidates;
    private Map<Candidate, Integer> map;
    public Graph(Map<Candidate, Integer> map) {
        this.map = map; // shallow copy
        this.percentages = new int[map.size()];
        this.candidates = new String[map.size()];
        // TO-DO: implement a deep copy
    }

    public void Display() {
        int i=0;
        for (Map.Entry<Candidate, Integer> e : map.entrySet()) {
            percentages[i] = e.getValue()*100 / Candidate.totalVotes;
            candidates[i] = e.getKey().name;
            i++;
        }
        for(int j=0;j<percentages.length;j++) {
            System.out.format("%s ",candidates[j]);
            for(int k=1;k<=percentages[j]/10;k++) {
                System.out.print("|");
            }
            System.out.format("     %d ", percentages[j]);
            System.out.print("%");
            System.out.println();
        }
    }
}
