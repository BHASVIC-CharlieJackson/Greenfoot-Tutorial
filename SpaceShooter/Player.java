import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int projcount=0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        setRotation(270);
    }
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+7,getY());
        }
            if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-7,getY());
        }
    }
    public void fireProjectile(){
        projcount++;
        if(Greenfoot.isKeyDown("space")){
            if(projcount>18){
            getWorld().addObject(new Projectile(), getX(), getY());
            projcount=0;
            }
        }
    }
}
