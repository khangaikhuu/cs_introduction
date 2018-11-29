import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ryu here.
 * 
 * @author Jacob Schwartz
 * @version 0.2
 */
public class Ryu extends Support
{
private GreenfootImage punching1;
private GreenfootImage punching2;
private GreenfootImage kicking1;
private GreenfootImage kicking2;
private boolean isPunching;
private boolean isKicking;
private boolean isWalking;
private int punchTimer;
private int kickTimer;
private int walkTimer;
private int walkTimer2;
private int sTimer;
private int lifeSpawn;
public Ryu()
{
    punching1 = new GreenfootImage("RyuPunching1.png");
    punching2 = new GreenfootImage("RyuPunching2.png");
    kicking1 = new GreenfootImage("RyuKicking1.png");
    kicking2 = new GreenfootImage("RyuKicking2.png");
    isPunching = false;
    isKicking = false;
    isWalking = false;
    punchTimer = 0;
    kickTimer = 0;
    walkTimer = 0;
    walkTimer2 = 0;
    sTimer = 0;
    lifeSpawn = 0;
} 
    /**
     * Act - do whatever the Ryu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * lifeSpawn creates a lifeBar above the player's head
     */
    public void act() 
    {
        checkKeyPress();
        if (lifeSpawn < 1)
            getWorld().addObject(new lifeBar(), getX(), 85);
        lifeSpawn++;
    }
/**
 * Checks if key is pressed to walk, punch, or kick
 * If special attack key is held for x frames, the character will execute a projectile attack
 * Left and Right keys are arrows for Ryu, "a" and "d" for Ken
 * Kick and Punch keys are "n" and "m" for Ryu, "f" and "g" for Ken
 * Special Attack moves are "k" for Ryu, "t" for Ken
 */
public void checkKeyPress()
    {
    if (Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("m") && 
    !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("down") && 
    !Greenfoot.isKeyDown("k") && !contact(Ken.class) )
    { 
        move();
        walkTimer ++;

            if(walkTimer == 0)
                setImage("RyuWalking1.png");
            if(walkTimer == 6)
                setImage("RyuWalking1.png");
            if(walkTimer == 11)
                setImage("RyuWalking3.png");
            if(walkTimer == 16)
                setImage("RyuWalking2.png");
            if(walkTimer == 21)
            {
                setImage("RyuWalking2.png");
                walkTimer = 0;
            }
    }
    else
    {
        if(!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right") && 
        !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("k"))
        {
            setImage("RyuWalking1.png");
        }
        }
    if (Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("m") 
    && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("down") && 
    !Greenfoot.isKeyDown("k") ) 
    {
        moveBackwards();
         walkTimer2 ++;

            if(walkTimer2 == 0)
        {
                setImage("RyuWalking2.png");
            }
            if(walkTimer2 == 6)
                setImage("RyuWalking3.png");
            if(walkTimer2 == 11)
                setImage("RyuWalking4.png");
            if(walkTimer2 == 16)
                setImage("RyuWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("RyuWalking6.png");
                walkTimer2 = 0;
            }
    }
    if (!isPunching && Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("k"))
    {
            setImage(punching1);
            punchTimer++;
        }
    if (!isPunching && getImage() == punching1 && Greenfoot.isKeyDown("m") && punchTimer == 7)
        {
            setImage(punching2);
            isPunching = true;
        }
    if (isPunching && !Greenfoot.isKeyDown("m"))
        {
            setImage("RyuWalking1.png");
            isPunching = false;
            punchTimer = punchTimer - 7;
        }
    if (!isKicking && Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("k"))
    {
            setImage(kicking1);
            kickTimer++;
        }  
    if (!isKicking && getImage() == kicking1 && Greenfoot.isKeyDown("n") && kickTimer == 9)
        {
            setImage(kicking2);
            isKicking = true;
        }
    if (isKicking && !Greenfoot.isKeyDown("n"))
        {
            setImage("RyuWalking1.png");
            isKicking = false;
            kickTimer = kickTimer - 9;
        }
    if (Greenfoot.isKeyDown("down") && !Greenfoot.isKeyDown("k"))
    {
        setImage("RyuBlocking.png");
    }
    if (Greenfoot.isKeyDown("k"))
    {
         sTimer ++;

            if(sTimer == 0)
                setImage("RyuHadouken1.png");
            if(sTimer == 11)
                setImage("RyuHadouken2.png");
            if(sTimer == 19)
                setImage("RyuHadouken3.png");
            if(sTimer == 27)
                setImage("RyuHadouken5.png");
            if(sTimer == 32)
                setImage("RyuHadouken6.png");
            if(sTimer == 40)
                setImage("RyuHadouken7.png");
            if(sTimer == 49)
                setImage("RyuHadouken7.png");
            if(sTimer == 54)
                {
                    setImage("RyuHadouken8.png");
                    getWorld().addObject(new Hadouken(), getX() + 20, getY());
                }
            if(sTimer == 58)
                setImage("RyuHadouken9.png");
    }
    else {
            if (!Greenfoot.isKeyDown("k")){
                sTimer = 0;
            }
    }
   if(contact(Hadoukan.class) && !Greenfoot.isKeyDown("down"))
    {
            getWorld().addObject (new p2wins(), 310, 100);
            Greenfoot.stop();
    }
    if (Greenfoot.isKeyDown("q") && Greenfoot.isKeyDown("z"))
    {
        for(int awesome = 0; awesome < 100; awesome++)
            {
                getWorld().addObject(new AwesomeCrab(), Greenfoot.getRandomNumber(620), Greenfoot.getRandomNumber(200));
                getWorld().addObject(new p1wins(), Greenfoot.getRandomNumber(620), Greenfoot.getRandomNumber(200));
            }
    }
}
}