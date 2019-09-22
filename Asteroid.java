import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Asteroid extends Actor
{
    public final int ASTEROID_SPEED = 4;
    
    public Asteroid()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        move(ASTEROID_SPEED);
        int width = getImage().getWidth();
        if (getX() < width)
        {
            turn(180);
        }
        if(getX() > getWorld().getWidth() - width)
        {
            turn(180);
        }
    }    
}
