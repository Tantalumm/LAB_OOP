public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    // RegularPolygon1
    RegularPolygon(){}

    // RegularPolygon2
    RegularPolygon(int newN,double newSide)
    {
        n = newN;
        side = newSide;
        x = y = 0;
    }
    // RegularPolygon3
    RegularPolygon(int newN,double newSide,double newX, double newY){
        n   = newN;
        side = newSide;
        x   = newX;
        y   = newY;
    }

    public void setN(int newN)
    {
        n = newN;
    }

    public void setSide(double newSide)
    {
        side = newSide;
    }

    public void SetX(double newX)
    {
        x = newX;
    }

    public void SetY(double newY)
    {
        y = newY;
    }

    public int getN()
    {
        return n;
    }

    public double getSide()
    {
        return side;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
    public double getPerimeter()
    {
        return side * n;
    }

    public double getArea ()
    {
         return (n*Math.pow(side, 2)/ (4*Math.tan(Math.PI/n)));
    }
}
