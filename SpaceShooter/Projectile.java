import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        projMove();
        removeProj();
    }
    public void projMove(){
        setLocation(getX(), getY()-7);
    }
    public void removeProj(){
        if(getY()<=3){
            getWorld().removeObject(this);
        }
    }
}
