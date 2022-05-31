package g;

import g.Graphics.Circle;
import g.Graphics.Rectangle;
import g.Graphics.Square;
import g.Graphics.Triangle;

public class Shape{
    public static void main(String[] args){
        g.Graphics.Area r=new Rectangle(8,9);
        g.Graphics.Area T=new Triangle(5,5);
        g.Graphics.Area S=new Square(5);
        g.Graphics.Area C=new Circle(6);
        r.area();
        T.area();
        S.area();
        C.area();

    }
}