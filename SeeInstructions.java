import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
/**
 * Write a description of class SeeInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeeInstructions extends Actor
{
    /**
     * Act - do whatever the SeeInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public SeeInstructions()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
       {
           JOptionPane.showMessageDialog(new JInternalFrame(), 
           "- Press UP to apply thrust to rocket" +
           "\n- Press LEFT or RIGHT to move the rocket in its respctive direction" +
           "\n\nYou must avoid crashing into the asteroids or mountain to win, \nif you land on the red landing pads, you will be awarded 5 points\n you will lose 2 points for crashing"
             , "Instructions", JOptionPane.INFORMATION_MESSAGE);
       }
    }    
}
