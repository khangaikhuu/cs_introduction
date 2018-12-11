import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lawn here.
 * 
 * @author (Antosh) 
 * @version (a version number or a date)
 */
public class Lawn extends World
{
    public static int game = 0;
    public int timer = 0;
    public static int landY;
    public static int sunID;
    public static int sun;
    public static int sCooldown = 0;
    public static int select = 0;
    public static int ID;
    public static int Row;
    int[] Grid = {0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0,0,0,0,0};
    int[] Z = {0,0,0,0,0};
    /**
     * Constructor for objects of class Lawn.
     * 
     */
    public Lawn()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 300, 1);
        setPaintOrder(Sun.class, Dave.class, endtext.class, BuyCards.class, Shovel.class, Zombie.class, Projectile.class, Projectile2.class, Mower.class);
        Greenfoot.start();
        addDave();
        sun = 50;
        game = 0;
    }
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(game == 1)
        {
            if(select > 0)
            {
                if(sCooldown == 0 && mouse != null && Greenfoot.getMouseInfo().getButton() == 1)
                {
                    if(getYSlot() != 0 && getXSlot() != 0)
                    {
                        if(Grid[(((getYSlot()-1)*9)+getXSlot())-1] == 0)
                        {
                            Grid[(((getYSlot()-1)*9)+getXSlot())-1] = select;
                        }
                        select = 0;
                    }
                }
            }
            if(select == 1)
            {
               if(sCooldown == 0 && mouse != null && Greenfoot.getMouseInfo().getButton() == 1 && getYSlot() != 0 && getXSlot)
               {
                  Grid[(((getYSlot()-1)*9)+getXSlot())-1] = 0;
                  select = 0;
               }
            }
            if(sCooldown > 0)
            {
                sCooldown--;
            }
            if(timer > 0)
            {
                if(Greenfoot.getRandomNumber((timer-1)/8) == 0)
                {
                    addZombie(Greenfoot.getRandomNumber(5)+1);
                }
                timer--;
            }
            else
            {
                if(getObjects(Zombie.class).size() < 1)
                {
                    game = 3;
                }
            }
            if(Greenfoot.getRandomNumber(900) == 0)
            {
                sunID = 2;
                landY = Greenfoot.getRandomNumber(250)+40;
                addObject (new Sun(), Greenfoot.getRandomNumber(378)+125, 0);
            }
        }
        else
        {
            if(game == 0)
            {
                if(mouse != null)
                {
                    if(mouse.getY() > 100 && mouse.getY() < 250 && mouse.getX() > 215 && mouse.getX() < 485)
                    {
                        setBackground("Menu2.jpg");
                        if(mouse.getButton() == 1)
                        {
                            game = 2;
                            placeCards();
                            populatedGrid();
                            setBackground("BK.jpg");
                            sunCounter();
                            sunID = 2;
                            timer = 21000;
                            addObject(new endtext(), 350,150);
                        }
                    }
                    else
                    {
                        setBackground("Menu2.jpg");
                    }
                }
            }
        }
    }
    public int getListNumber(int nun, int list)
    {
    }
}
