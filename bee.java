import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java sql.*;
/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+4, getY());
        }
    }
}
