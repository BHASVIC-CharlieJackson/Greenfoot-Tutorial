import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    HealthBar healthbar;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    public void act(){
        addEnemy1();
        addEnemy2();
    }

    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(40)<1){
        addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }   
    }
    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(150)<1){
        addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }   
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 95, 50);
        Player player = new Player();
        addObject(player,284,441);
        healthbar = new HealthBar();
        addObject(healthbar, 94, 99);
    }
}
