import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Brinda
 * @version May 2025
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Label titleLabel = new Label("The Elephant", 60);
        addObject(titleLabel, 250, 125);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 480, 125);
        
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label, 300, 257);
        
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2, 300, 331);
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
