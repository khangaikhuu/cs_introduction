import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GameBall  extends Actor
{
    // state of the gameball
    enum BallState { UNCLICKED, GOLD, STEEL };
    // initial state of the ballstate is unclicked
    BallState state = BallState.UNCLICKED;
    GameBall()
    {
        // setting gameball image to the world
        setImage("cell.jpg");
        // initial state of ballstate is unclicked
        state = BallState.UNCLICKED;
     }
        /**
        * Act - do whatever the GameBall wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act()
    {
       
    }
    public void setGold(){
    // setting the gold ball image to the world
    setImage("gold-ball.png");
    // state of the ball is gold
    state=BallState.GOLD;
    }
    public void setSteel(){
    // setting the steel ball image to the world
    setImage("steel-ball.png");
    // state of the ball is steel
    state = BallState.STEEL;
    }
    
    // reset the whole game
    public void reset(){
    // setting cell image to the world
    setImage("cell.jpg");
    // state of the image is cell
    state = BallState.UNCLICKED;
    }
    public boolean isUnClicked() 
    {
      // whether the state of the ball is uncliked or not
      return (state == BallState.UNCLICKED);
    }
    public boolean isGold()
    {
       // whether the state of the ball is gold
       return(state == BallState.GOLD);
    }
    public boolean isSteel()
    {
      // whether the state of the ball is steel
      return(state == BallState.STEEL);
    }
}
