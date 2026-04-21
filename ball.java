import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-11);
        if (getX() <=0)
        {
            resetBall(); 
        }
        
        if(isTouching(Hero.class))
        {
            SadFace sf = new SadFace();
            getWorld().addObject(sf, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBall()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(500,100);
        }
        else
        {
            setLocation(500,300); 
        }
    }
}
