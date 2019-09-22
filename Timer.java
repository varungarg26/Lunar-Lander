import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    int gameTimer = 0;
    int count = 0;
    public void act() 
    {
        setImage(new GreenfootImage("Time: " + gameTimer, 18, Color.WHITE, Color.BLACK));
        count++;
        if(count == 60)
        {
            count = 0;
            gameTimer++;
        }
    }    
}
