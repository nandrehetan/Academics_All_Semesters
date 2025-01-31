import java.util.Scanner;

class Box
{
   int length, breadth, d1, d2;        
    
}

class Rectangle extends Box
{
    int Area()
    {
        return length*breadth;
    }
}    

class Square extends Rectangle
{
    int side;
    int Area()
    {
        return side*side;
    }
}

class Rhombus extends Rectangle
{
    int Area()
    {
        return d1*d2;
    }
}

public class Inheritance
{
    
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.length = 2;
        r.breadth = 3;
        System.out.printf("The area of rectangle = %d %n",r.Area());
        Square s = new Square();
        s.side = 1;
        System.out.printf("The area of square = %d %n",s.Area());
        Rhombus rh = new Rhombus();
        rh.d1 = 1;
        rh.d2 = 2;
        System.out.printf("The area of rhombus = %d %n",rh.Area());
    }
}
