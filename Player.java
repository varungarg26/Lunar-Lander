/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player  
{
    // instance variables - replace the example below with your own
    private String name;
    private int score;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        this.name = name;
    }

     /**
     * Constructor for objects of class Player
     */
    public Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Player)
        {
          Player p = (Player)obj;  
          return name.equals(p.name);
        }
        
        if(obj instanceof String)
        {
          String s = (String)obj;  
          return name.equals(s);
        }
        return false;
    }
    
    public String toString()
    {
        return name + " " + score;
    }
}
