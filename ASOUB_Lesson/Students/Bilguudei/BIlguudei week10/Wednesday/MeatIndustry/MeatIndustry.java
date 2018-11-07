import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MeatIndustry extends World
{

   
    public MeatIndustry()
    {    
        super(500, 400, 1);
        Cow COW=new Cow();
        addObject(COW,300,400);  
    }
}
