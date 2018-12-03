import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifeBar2 here.
 * 
 * @author Jacob Schwartz
 * @version 1.0
 */
public class lifeBar2 extends Ken
{
public String[] life =
{"LifeBar.png","LifeBar2.png", "LifeBar3.png", "LifeBar4.png", "LifeBar5.png", "LifeBar6.png", 
"LifeBar7.png", "LifeBar8.png", "LifeBar9.png", "LifeBar10.png", "LifeBar11.png", 
"LifeBar12.png", "LifeBar13.png", "LifeBar14.png", "LifeBar15.png", "LifeBar16.png"};
private boolean isHit;
private int damageApplier;
private int damageApplier1;
public lifeBar2()
{
    damageApplier = 0;
    damageApplier1 = 0;
    isHit = false;
}
    /**
     * Act - do whatever the lifeBar2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Allows lifeBar to follow player.
     * Decreases bar by x amount when is hit by opponent
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("a") && !contact(lifeBar.class) && !Greenfoot.isKeyDown("g") && 
    !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("s") && 
    !Greenfoot.isKeyDown("t") )
        {
            moveBackwards();
        }
         if (Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("g") && 
    !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("s") && 
    !Greenfoot.isKeyDown("t") )
        {
            move();
        }
        if (Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("s") && !Greenfoot.isKeyDown("down")
 && contact(lifeBar.class))
    {
        isHit = true;
        if (damageApplier == 0)
        {
            lifeKen++;
            damageApplier++;
            Greenfoot.playSound("Punch.wav");
        }
    }
    if (!Greenfoot.isKeyDown("m") && damageApplier > 0)
    {
        damageApplier = 0;
        isHit = false;
    }
    if (Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("s") && !Greenfoot.isKeyDown("down")
 && contact(lifeBar.class))
    {
        isHit = true;
        if (damageApplier1 == 0)
        {
            lifeKen++;
            lifeKen++;
            damageApplier1++;
            Greenfoot.playSound("Kick.wav");
        }
    }
    if (!Greenfoot.isKeyDown("n") && damageApplier1 > 0)
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
            switch (lifeKen)
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
                    getWorld().addObject (new p1wins(), 310, 100);
                    Greenfoot.stop();
                break;
                case 17:
                    getWorld().addObject (new p1wins(), 310, 100);
                    Greenfoot.stop();
                break;
                default:
                    setImage(life[0]);
                break;
            }
        }
}
