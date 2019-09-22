import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeScreen extends World
{

    /**
     * Constructor for objects of class WelcomeScreen.
     * 
     */
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 800, 1); 

        addObject(new Welcome(), this.getWidth()/2, 112);
        addObject(new LunarLander(), this.getWidth()/2, 706);
        addObject(new PressEnter(), this.getWidth()/2, 251);
        addObject(new ClickForLeaderboard(), 474, 390);
        addObject(new ClickForInstructions(), 468, 509);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SeeLeaderBoard seeleaderboard = new SeeLeaderBoard();
        addObject(seeleaderboard,870,386);
        seeleaderboard.setLocation(822,390);
        SeeInstructions seeinstructions = new SeeInstructions();
        addObject(seeinstructions,836,498);
        seeinstructions.setLocation(825,512);
        seeinstructions.setLocation(825,511);
    }
}
