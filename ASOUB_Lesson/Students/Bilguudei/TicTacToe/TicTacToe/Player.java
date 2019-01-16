import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Player here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Player  extends Actor
{
    // making the mode to PLAYER1 and PLAYER2
    enum PlayerMode {PLAYER1, PLAYER2 };
    PlayerMode mode;
    // set background image ant 
public Player(){
    mode = PlayerMode.PLAYER1;
    setImage("ant-with-food.png");
}
/**
* Act - do whatever the Player wants to do. This method is called whenever
* the 'Act' or 'Run' button gets pressed in the environment.
*/
public void act()
{
// Add your action code here.
//adding the mouse movement to the world
if (Greenfoot.mouseMoved(null)){
    MouseInfo mouse = Greenfoot.getMouseInfo();
    setLocation(mouse.getX(), mouse.getY());
}
// creating mouse cliked statement, also the mouse movement
if (Greenfoot.mouseClicked(null)){
    GameBall ball = (GameBall)getOneIntersectingObject(GameBall.class);
    if(ball!=null){
        if (mode == PlayerMode.PLAYER1 ){
            ball.setSteel();
            setPlayer2();
}
// when player2 is playing then change the color of the ball, and setting player mode to player1
else if (mode == PlayerMode.PLAYER2){
    ball.setGold();
    setPlayer1();
}
}
}
}
//adding setPlayer1 to the world
public void setPlayer1(){
    mode = PlayerMode.PLAYER1;
    setImage("ant-with-food.png");
}
//adding the setPlayer2 to the world
public void setPlayer2(){
    mode = PlayerMode.PLAYER2;
    setImage("ant.png");
}
}
