package JavaGame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Created by mattslavin on 1/11/15.
 */
public class Menu extends BasicGameState {



    public Menu(int state){

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {


    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
       g.fillOval(75, 100, 100, 100);
       g.drawString("Play Now!", 80, 70);

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        int xPos = Mouse.getX();
        int yPos = Mouse.getY();
        if((xPos >75 && xPos <175)&&(yPos >160 && yPos <260)){
            if(input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }

        }


    }

    public int getID(){
        return 0;
    }
}
