import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    public void moveAround(){
        move(4);
        if (getX() >= 799){
            setLocation(0, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(1);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-1);
        }
    }
}
