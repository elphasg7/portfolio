/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccertable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;
import static soccertable.SoccerTable.sortByValues;

/**
 *
 * @author Elphas
 */
public class SoccerTable {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        File file = new File("C:\\Users\\Elphas\\Documents\\NetBeansProjects\\Soccer_Log\\League.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        // ArrayList<String> team_results = new ArrayList<>();

        String st;
        Map<String, Integer> tm = new TreeMap<>();
        //System.out.println("Team Points");
        // String[] new_scores = new String[6];
        //String [] teamscores = new String[6];
        while ((st = br.readLine()) != null) {
            String[] team_results = st.split(" ");
            int t1Score = Integer.parseInt(team_results[1]);
            int t2Score = Integer.parseInt(team_results[3]);

            int count = 0;
            String t1Name = team_results[0];
            String t2Name = team_results[2];
            if (t1Score > t2Score) {
                if (tm.containsKey(t1Name)) {
                    count = tm.get(t1Name);
                    tm.put(t1Name, count + 3);
                } else {
                    tm.put(t1Name, 3);
                }
                if (!(tm.containsKey(t2Name))) {
                    tm.put(t2Name,0);
                }

            } else if (t1Score == t2Score) {
                if (tm.containsKey(t1Name)) {
                    count = tm.get(t1Name);
                    tm.put(t1Name, count + 1);
                } else {
                    tm.put(t1Name, 1);
                }
                if (!(tm.containsKey(t2Name))) {
                    tm.put(t2Name, count + 1);
                } else {
                    tm.put(t2Name, 1);
                }
            } else {
                if (tm.containsKey(t2Name)) {
                    count = tm.get(t2Name);
                    tm.put(t2Name, count + 3);
                } else {
                    tm.put(t2Name, 3);
                }
                if (!(tm.containsKey(t1Name))) {
                    tm.put(t1Name, 0);
                }
            }

        }
        Formatter fmt = new Formatter();
        System.out.println(fmt.format("%20s %3s", "TEAM", "POINTS"));
        for (String team : sortByValues(tm).keySet()) {
            Integer teamres = tm.get(team);
            fmt = new Formatter();
            System.out.println(fmt.format("%20s %3s", team, teamres));
        }
    }

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) {
                    return 1;
                } else {
                    return compare;
                }
            }
        };

        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

}
