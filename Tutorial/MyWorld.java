import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Player player = new Player();
        addObject(player,374,35);
        Enemy enemy = new Enemy();
        addObject(enemy,53,323);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,142,528);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,328,276);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,415,467);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,612,219);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,718,546);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,694,358);
    }
}
