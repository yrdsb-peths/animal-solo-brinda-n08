import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Brinda
 * @version April 2025
 */
public class Apple extends Actor
{
    public Apple()
    {
        GreenfootImage myApple = new GreenfootImage("apple.png");
        setImage(myApple);
    }
    
    public void act()
    {
        //Apple falsl downwards.
        int x = getX();
        int y = getY() + 2;
        setLocation(x,y);
        
        //Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    
}
