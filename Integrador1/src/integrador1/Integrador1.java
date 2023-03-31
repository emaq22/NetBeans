
package integrador1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Integrador1 {

    public static void main(String[] args) {
        String participant = "Juan";
        String round = "1";
        
        String path = "C:/Torneo";
        String matchesFile = path + "/round" + round + "/matches.txt";
        String resultsFile = path + "/round" + round + "/results.txt";
        
        ArrayList<Match> matches = readMatches(matchesFile);
        ArrayList<Result> results = readResults(resultsFile);
        
        Participant p = new Participant(participant);
        for (int i = 0; i < matches.size(); i++) {
            Result r = results.get(i);
            Match m = matches.get(i);
            if (m.getPlayer1().equals(participant)) {
                p.addScore(r.getPlayer1Score());
            } else if (m.getPlayer2().equals(participant)) {
                p.addScore(r.getPlayer2Score());
            }
        }
        
        System.out.println("Puntaje de " + participant + " en la ronda " + round + ": " + p.getScore());
    }
    
    public static ArrayList<Match> readMatches(String filename) {
        ArrayList<Match> matches = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                matches.add(new Match(parts[0], parts[1]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return matches;
    }
    
    public static ArrayList<Result> readResults(String filename) {
        ArrayList<Result> results = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                results.add(new Result(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return results;
    }

}
