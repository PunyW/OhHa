package util.highscore;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Joel
 */
public class HighScoreTest {

    private HighScore hs;

    public HighScoreTest() {
        hs = new HighScore();
    }

    @Test
    public void constructorWorking() {
        ArrayList<Score> scores = hs.getHighScores();
        assertEquals(1000, scores.get(0).getScore());
    }

    @Test
    public void newHighScoreWorks() {
        hs.checkForNewHighScore(900);
        ArrayList<Score> scores = hs.getHighScores();
        assertEquals(1000, scores.get(0).getScore());
        assertEquals(900, scores.get(1).getScore());
        assertEquals(900, scores.get(2).getScore());
    }
}