import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifeBar here.
 * 
 * @author Jacob Schwartz
 * @version 1.0
 */
public class lifeBar extends Ryu
{
public String[] life =
{"LifeBar.png", "LifeBar2.png", "LifeBar3.png", "LifeBar4.png", "LifeBar5.png", "LifeBar6.png", 
"LifeBar7.png", "LifeBar8.png", "LifeBar9.png", "LifeBar10.png", "LifeBar11.png", 
"LifeBar12.png", "LifeBar13.png", "LifeBar14.png", "LifeBar15.png", "LifeBar16.png"};   
private int damageApplier;
private int damageApplier1;
private boolean mrMeyerkopfIsACoolTeacher;
public boolean isHit;
public lifeBar()
{
    damageApplier = 0;
    damageApplier1 = 0;
    isHit = false;
    mrMeyerkopfIsACoolTeacher = true; // :D
}
/**
     * Act - do whatever the lifeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Allows lifeBar to follow player.
     * Decreases bar by x amount when is hit by opponent
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("right") && !contact(lifeBar2.class) && !Greenfoot.isKeyDown("m") && 
    !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("down") && 
    !Greenfoot.isKeyDown("k") )
        {
            move();
        }
         if (Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("m") && 
    !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("down") && 
    !Greenfoot.isKeyDown("k"))
        {
            moveBackwards();
        }
        if (Greenfoot.isKeyDown("g") && !Greenfoot.isKeyDown("down") && !Greenfoot.isKeyDown("s")
 && contact(lifeBar2.class))
    {
        isHit = true;
        if (damageApplier == 0)
        {
            lifeRyu++;
            damageApplier++;
            Greenfoot.playSound("Punch.wav");
        }
    }
    if (!Greenfoot.isKeyDown("g") && damageApplier > 0)
    {
        damageApplier = 0;
        isHit = false;
    }
    if (Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("down") && !Greenfoot.isKeyDown("s")
 && contact(lifeBar2.class))
    {
        isHit = true;
        if (damageApplier1 == 0)
        {
            lifeRyu++;
            lifeRyu++;
            damageApplier1++;
            Greenfoot.playSound("Kick.wav");
        }
    }
    if (!Greenfoot.isKeyDown("f") && damageApplier1 > 0)
    {
        damageApplier1 = 0;
        isHit = false;
    }
    lifeBarChange();
 }
/**
 * Changes lifeBar image when player is damaged
 */
public void lifeBarChange()
{
            switch (lifeRyu)
            {
                case 0:
                    setImage(life[0]);
                break;
                case 1:
                    setImage(life[1]);
                break;
                case 2:
                    setImage(life[2]);
                break;
                case 3:
                    setImage(life[3]);
                break;
                case 4:
                    setImage(life[4]);
                break;
                case 5:
                    setImage(life[5]);
                break;
                case 6:
                    setImage(life[6]);
                break;
                case 7:
                    setImage(life[7]);
                break;
                case 8:
                    setImage(life[8]);
                break;
                case 9:
                    setImage(life[9]);
                break;
                case 10:
                    setImage(life[10]);
                break;
                case 11:
                    setImage(life[11]);
                break;
                case 12:
                    setImage(life[12]);
                break;
                case 13:
                    setImage(life[13]);
                break;
                case 14:
                    setImage(life[14]);
                break;
                case 15:
                    setImage(life[15]);
                break;
                case 16:
                    getWorld().addObject (new p2wins(), 310, 100);
                    Greenfoot.stop();
                break;
                case 17:
                    getWorld().addObject (new p2wins(), 310, 100);
                    Greenfoot.stop();
                break;
                default:
                    setImage(life[0]);
                break;
            }
        }
}
