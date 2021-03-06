package util.menus;

import breakout.Breakout;
import gamestate.GameStateManager;
import gamestate.GameStates;

/**
 * Menu that handles the Main Menu options
 * 
 * @author Joel
 */
public final class MainMenu extends Menu {

    public MainMenu(Breakout breakout, GameStateManager gsm) {
        super(breakout, gsm);
        initChoices();
    }

    @Override
    protected void initChoices() {
        choices.add("New Game");
        choices.add("Help");
        choices.add("High Score");
        choices.add("Quit Game");
    }

    private void newGame() {
        breakout.newGame();
        gsm.setState(GameStates.PLAYSTATE);
    }

    private void quitGame() {
        System.exit(0);
    }

    private void help() {
        gsm.setState(GameStates.HELP);
    }
    
    private void highscore() {
        gsm.setState(GameStates.HIGHSCORE);
    }

    @Override
    public void start(int choice) {
        switch (choice) {
            case 0:
                newGame();
                break;
            case 1:
                help();
                break;
            case 2:
                highscore();
                break;
            case 3:
                quitGame();
                break;
        }
        resetMenu();
    }

}
