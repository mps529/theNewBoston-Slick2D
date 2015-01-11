package JavaGame;

//import org.lwjgl.input.Keyboard;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Created by mattslavin on 1/11/15.
 */
public class Menu extends BasicGameState {

    Image hero;
    int heroX = 200;
    int heroY = 200;

    public Menu(int state){

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        hero = new Image("slickTutorial/res/buckysFront.png");

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(hero, heroX, heroY);
        g.drawString("Are you ready to Juice some Boys?!", 50, 50);

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        if(input.isKeyDown(Input.KEY_W)){
            hero = new Image("slickTutorial/res/buckysBack.png");
            heroY-=1;
        }
        if(input.isKeyDown(Input.KEY_A)){
            hero = new Image("slickTutorial/res/buckysLeft.png");
            heroX-=1;
        }
        if(input.isKeyDown(Input.KEY_S)){
            hero = new Image("slickTutorial/res/buckysFront.png");
            heroY+=1;
        }
        if(input.isKeyDown(Input.KEY_D)){
            hero = new Image("slickTutorial/res/buckysRight.png");
            heroX+=1;
        }

    }

    public int getID(){
        return 0;
    }
}
