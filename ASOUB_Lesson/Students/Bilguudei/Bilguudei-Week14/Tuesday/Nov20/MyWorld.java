import greenfoot.*; 
public class MyWorld extends World
{

    
    public MyWorld()
    {    
        super(600, 550, 1);
        GPU whale=new GPU();
        addObject(whale,190,350);
        
        CPU bale=new CPU();
        addObject(bale,350,250);
        RAM gale=new RAM();
        addObject(gale,210,250);
    }
}
