import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        
        Konek konek = new Konek();
        String s = konek.sampleMethod();
        getWorld().showText("Nilai Dari Database = " + s, 120, 30);
        checkKeyPress(s);
        s = String.valueOf(s);
    }
    private void checkKeyPress(String s){
        if (s.equals("s")){
             setLocation(getX(), getY()+4);
        }
        if (s.equals("w")){
             setLocation(getX(), getY()-4);
        }
        if (s.equals("a")){
             setLocation(getX()-4, getY());
        }
        if (s.equals("d")){
             setLocation(getX()+4, getY());
        }
    }
}
