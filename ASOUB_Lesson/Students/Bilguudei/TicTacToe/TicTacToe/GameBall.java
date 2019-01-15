import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GameBall  extends Actor
{
enum BallState { UNCLICKED, GOLD, STEEL };
BallState state = BallState.UNCLICKED;
GameBall(){
setImage("cell.jpg");
}
/**
* Act - do whatever the GameBall wants to do. This method is called whenever
* the 'Act' or 'Run' button gets pressed in the environment.
*/
public void act()
{
// Add your action code here.
}
public void setGold(){
setImage("gold-ball.png");
state=BallState.GOLD;
}
public void setSteel(){
setImage("steel-ball.png");
state = BallState.STEEL;
}
public void reset(){
setImage("cell.jpg");
state = BallState.UNCLICKED;
}
}
