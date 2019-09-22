import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
/**
 * Write a description of class SeeLeaderBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeeLeaderBoard extends Actor 
{
    /**
     * Act - do whatever the SeeLeaderBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SeeLeaderBoard()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    
    public void act () 
    {
        try{
            Scanner file = new Scanner(new File("players.txt"));
            
           if(Greenfoot.mouseClicked(this))
           {
             JOptionPane.showMessageDialog(new JInternalFrame(), 
             "1. " + file.nextLine() + 
             "\n2. " + file.nextLine() + 
             "\n3. " + file.nextLine() + 
             "\n4. " + file.nextLine() + 
             "\n5. " + file.nextLine()
             , "Leaderboard", JOptionPane.INFORMATION_MESSAGE);
          
            }
        }
        catch(IOException ex){}
        
    }
    
    public String printNames(Scanner file)
    {
        while (file.hasNextLine())
        {
            return file.nextLine();
        }
        return "nothing";
    }
}
