package JavaGame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Created by mattslavin on 1/11/15.
 */
public class Menu extends BasicGameState {

    public String mouse = "No Input Yet!";
    public Menu(int state){

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        Image playNow = new Image("slickTutorial/res/playNow.png");

        g.drawString(mouse, 50, 50);
        g.drawRect(50, 100, 60, 120); //x, y, width, height
        g.drawImage(playNow, 200, 130);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();

        mouse = "Mouse position: "+xpos+", "+ypos;

    }

    public int getID(){
        return 0;
    }
}
