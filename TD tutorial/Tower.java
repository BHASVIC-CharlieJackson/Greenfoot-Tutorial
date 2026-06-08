import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    int fireRate = 0;
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tower(){
        getImage().scale(60,60);
    }
    public void act()
    {
        enemyDetector();
    }
    public void enemyDetector(){
        fireRate++;
        List<Enemy> enemies = getObjectsInRange(100, Enemy.class);
        for(Enemy eachEnemy: enemies){
            if (fireRate > 9){
                fireRate = 0;
                Projectile projectile = new Projectile();
                getWorld().addObject(projectile, getX(), getY());
                projectile.turnTowards(eachEnemy.getX(), eachEnemy.getY());
            }
        }
    }
}
