import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desert extends World
{
    /**
     * Constructor for objects of class Desert.
     * 
     */
  
    
    public Desert()
    {    
        super(8,8,60); 
      
    
        prepare();
    }



    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Ant ant = new Ant();
        addObject(ant, 3, 2);
        Grass grass = new Grass();
        addObject(grass, 1, 5);
        Grass grass2 = new Grass();
        addObject(grass2, 5, 6);
        Grass grass3 = new Grass();
        addObject(grass3, 6, 3);
        Grass grass4 = new Grass();
        addObject(grass4, 1, 1);
        Grass grass5 = new Grass();
        addObject(grass5, 1, 0);
        Grass grass6 = new Grass();
        addObject(grass6, 7, 3);
        Grass grass7 = new Grass();
        addObject(grass7, 7, 2);
        Grass grass8 = new Grass();
        addObject(grass8, 6, 2);
        Grass grass9 = new Grass();
        addObject(grass9, 2, 1);
        Grass grass10 = new Grass();
        addObject(grass10, 2, 0);
        Grass grass11 = new Grass();
        addObject(grass11, 1, 6);
        Grass grass12 = new Grass();
        addObject(grass12, 2, 6);
        Grass grass13 = new Grass();
        addObject(grass13, 2, 5);
        Grass grass14 = new Grass();
        addObject(grass14, 6, 6);
        Grass grass15 = new Grass();
        addObject(grass15, 6, 5);
        Grass grass16 = new Grass();
        addObject(grass16, 5, 5);
    }
}
