import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Brinda
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is : create the initial objects and add tehm to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 479, 87);
        elephant.setLocation(474,115);
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label, 220, 257);
        label.setLocation(442,273);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,249,331);
        label2.setLocation(422,325);
        elephant.setLocation(488,115);
        label.setLocation(244,266);
        label2.setLocation(171,304);
        elephant.setLocation(464,157);
    }
}
