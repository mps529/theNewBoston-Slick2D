package JavaGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Created by mattslavin on 1/11/15.
 */
public class Play extends BasicGameState {

    Animation hero, movingUp, movingDown, movingLeft, movingRight;
    Image worldMap;
    boolean quit = false;
    int[] duration = {200,200};
    float heroPosX = 0;
    float heroPosY = 0;
    float shiftX = heroPosX+320;
    float shiftY = heroPosY+160;

    public Play(int state){

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        worldMap = new Image("slickTutorial/res/world.png");
        Image[] walkUp = {new Image("slickTutorial/res/buckysBack.png"), new Image("slickTutorial/res/buckysBack.png")};
        Image[] walkDown = {new Image("slickTutorial/res/buckysFront.png"), new Image("slickTutorial/res/buckysFront.png")};
        Image[] walkLeft = {new Image("slickTutorial/res/buckysLeft.png"), new Image("slickTutorial/res/buckysLeft.png")};
        Image[] walkRight = {new Image("slickTutorial/res/buckysRight.png"), new Image("slickTutorial/res/buckysRight.png")};

        movingUp = new Animation(walkUp, duration, false);
        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);

        hero = movingDown;
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        worldMap.draw(heroPosX, heroPosY);
        hero.draw(shiftX, shiftY);
        g.drawString("Hero's X: "+heroPosX+"\nHero's Y: "+heroPosY, 400, 20);

        if(quit == true){
            g.drawString("Resume (R)", 250, 100);
            g.drawString("Main Menu (M)", 250, 150);
            g.drawString("Quit Game (Q)", 250, 200);
            if(quit == false) {
                g.clear();
            }
        }

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();

        //up
        if(input.isKeyDown(Input.KEY_W)){
            hero = movingUp;
            heroPosY += delta * .1f;
            if(heroPosY >162) {
                heroPosY -= delta * .1f;
            }
        }
        //down
        if(input.isKeyDown(Input.KEY_S)){
            hero = movingDown;
            heroPosY -= delta * .1f;
            if(heroPosY <-600) {
                heroPosY += delta * .1f;
            }
        }
        //left
        if(input.isKeyDown(Input.KEY_A)){
            hero = movingLeft;
            heroPosX += delta * .1f;
            if(heroPosX >324) {
                heroPosX -= delta * .1f;
            }
        }
        //right
        if(input.isKeyDown(Input.KEY_D)){
            hero = movingRight;
            heroPosX -= delta * .1f;
            if(heroPosX <-840) {
                heroPosX += delta * .1f;
            }
        }
    }

    public int getID(){
        return 1;
    }
}