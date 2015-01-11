package JavaGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;



/**
 * Created by mattslavin on 1/11/15.
 */
public class Game extends StateBasedGame {

    public static final String gamename = "Juice Boys II";
    public static final int menu = 0;
    public static final int play = 1;

    public Game(String gamename) {
        super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }


    public static void main (String [] args) {

    }
}
