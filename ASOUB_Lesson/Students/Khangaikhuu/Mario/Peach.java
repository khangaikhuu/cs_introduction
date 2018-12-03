import greenfoot.*;

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peach extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 2;
     
    public void act()
    {
        checkKeys();
        checkFall();
    }
     
    public void checkKeys() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-2, getY());
        }
        else if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+2, getY());
        }
        else {
            setLocation(getX()+1, getY());
        }
        if (Greenfoot.isKeyDown("space")){
            jump();
        }
         
    }
     
    public void checkFall(){
        if(onGround()){
        }
        else{ 
            fall();
        }     
    }
     
    public boolean onGround(){
        Actor unter = getOneObjectAtOffset( 0, 30, MyWorld.class );
        return unter != null;
    }
 
     
    public void jump(){
        vSpeed = -11;
        fall();
    }
     
    public void fall(){
        setLocation( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
 
}
