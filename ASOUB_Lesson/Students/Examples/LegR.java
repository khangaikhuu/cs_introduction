
/**
 * Write a description of class LegR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LegR
{
    private int height;
    private int width;
    boolean hasWheel;
    
    public void setheight(int x)
    {
      height = x; 
    }
    
    public void setWidth(int x)
    {
      width = x;  
    }
    
    public void setBoolean(boolean x)
    {
       hasWheel = x; 
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int setWidth()
    {
        return width;
    }
    
    public boolean sethasWheel()
    {
       return hasWheel; 
    }
}
