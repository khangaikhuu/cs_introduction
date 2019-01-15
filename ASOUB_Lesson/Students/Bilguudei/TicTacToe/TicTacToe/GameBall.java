import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GameBall  extends Actor
{
enum BallState { UNCLICKED, GOLD, STEEL };
BallState state = BallState.UNCLICKED;
GameBall(){
setImage("steel-ball.png");
}
/**
* Act - do whatever the GameBall wants to do. This method is called whenever
* the 'Act' or 'Run' button gets pressed in the environment.
*/
public void act()
{
   
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
public boolean isUnClicked() 
{
  return (state == BallState.UNCLICKED);
}
public boolean isGold()
{
   return(state == BallState.GOLD);
}
public boolean isSteel()
{
  return(state == BallState.STEEL);
}
}
