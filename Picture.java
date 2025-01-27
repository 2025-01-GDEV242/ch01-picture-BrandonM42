/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    
    //my var
    private Circle sun;
    private Circle sun2;
    private Square dirt;
    private Square grass;
    private Square sky;
    private Triangle mountain;
    private Person bob;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        sun2 = new Circle();
        
        
        //my drawing
        dirt = new Square();
        grass = new Square();
        mountain = new Triangle();
        sky = new Square();
        bob = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            /**wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            */
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            
            sun2.changeColor("white");
            sun2.moveHorizontal(110);
            sun2.moveVertical(-30);
            sun2.changeSize(60);
            
            drawn = true;
            
            dirt.changeSize(1000);
            dirt.moveHorizontal(-310);
            dirt.moveVertical(110);
            dirt.changeColor("brown");
            
            grass.changeSize(1000);
            grass.moveHorizontal(-310);
            grass.moveVertical(100);
            grass.changeColor("green");
            
            sky.changeSize(10000);
            sky.moveHorizontal(-400);
            sky.moveVertical(-200);
            sky.changeColor("sBlue");
            
            mountain.changeSize(75, 150);
            mountain.moveVertical(15);
            
            bob.moveHorizontal(20);
            bob.moveVertical(-10);
            
            sky.makeVisible();
            grass.makeVisible();
            dirt.makeVisible();
            mountain.makeVisible();
            sun.makeVisible();
            sun2.makeVisible();
            bob.makeVisible();
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
        sky.changeColor("white");
        grass.changeColor("white");
        dirt.changeColor("black");
        mountain.changeColor("black");
        sun.changeColor("black");
        sun2.changeColor("white");
        bob.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("sBlue");
        grass.changeColor("green");
        dirt.changeColor("brown");
        mountain.changeColor("green");
        sun.changeColor("yellow");
        sun2.changeColor("white");
        bob.changeColor("black");
    }
}
