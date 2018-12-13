import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Gar extends Ger
{

    /**
     * Act - do whatever the ger1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
            Greenfoot.playSound("fanfare.wav");
    }
}
