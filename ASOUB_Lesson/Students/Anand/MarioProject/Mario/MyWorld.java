import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    

        super(960, 465, 1, true); 
        Mario mario = new Mario();
        addObject(mario, 50, 400);
        Box box = new Box();
        addObject(box, 400, 300);
        Coin coin = new Coin();
        addObject(coin, 300, 200);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, 500, 405);
        QuestionBox qbox = new QuestionBox();
        addObject(qbox, 440, 300);
        QuestionBox qbox1 = new QuestionBox();
        addObject(qbox1, 360, 300);
        Border border = new Border();
        addObject(border, 480, 530);
        Box box1 = new Box();
        addObject(box1, 480, 300);
        qboxbot bot = new qboxbot();
        addObject(bot, 360, 319);
        qboxbot bot1 = new qboxbot();
        addObject(bot1, 440, 319);
        Coin coin1 = new Coin();
        addObject(coin1, 250, 250);
        Coin coin2 = new Coin();
        addObject(coin2, 300, 250);
        Coin coin3 = new Coin();
        addObject(coin3, 200, 300);
        Coin coin4 = new Coin();
        addObject(coin4, 250, 300);
        Coin coin5 = new Coin();
        addObject(coin5, 300, 300);
        boxup up = new boxup();
        addObject(up, 360, 281);
        boxup up1 = new boxup();
        addObject(up1, 440, 281);
    }
}
