
package util.highscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * High Score listing, load the high scores from external file
 * 
 * @author Joel
 */
public class HighScore {
    private ArrayList<Score> hs;

    public HighScore() {
        hs = new ArrayList<>();
        getScores("/resources/highscores.txt");
    }
    
    private void getScores(String filepath) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    HighScore.class.getResourceAsStream(filepath)));
                    String line;
                    
                    // TOP 10
                    for(int i = 0; i < 10; i++) {
                        line = in.readLine();
                        String[] score = line.split(" ");
                        Score temp = new Score(Integer.parseInt(score[1]));
                        hs.add(temp);
                    }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    
}
