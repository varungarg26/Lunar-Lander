import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private final double GRAVITY = 0.001;
    private double speed;
    
    public Rocket()
    {
        GreenfootImage image = getImage();
        image.scale(30, 20);
        setImage(image);
        
        setRotation(270);
        speed = 1;
    }
    
    public void act() 
    {
        fall();
        land();
    }    
    
    public void land()
    {
        if(isTouching(Mountains.class))
        {
            if(speed < 3.5)
            {
                getWorld().addObject(new Label("Safe Landing", 30), getWorld().getWidth()/2, getWorld().getHeight()/2);
            }
        }
    }
    
    public void fall()
    {
        setLocation(getX(), (int)(getY() + speed));
        speed = speed + GRAVITY;
    }
}
