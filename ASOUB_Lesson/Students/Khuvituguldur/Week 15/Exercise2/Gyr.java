import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Gyr extends Gar
{

    /**
     * Act - do whatever the Gyr wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
            Greenfoot.playSound("slurp.wav");
    }
}
