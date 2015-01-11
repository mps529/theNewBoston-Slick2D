package JavaGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Created by mattslavin on 1/11/15.
 */
public class Play extends BasicGameState {

    public Play(int state){

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("This is the play state!", 100, 100);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

    }

    public int getID(){
        return 1;
    }
}