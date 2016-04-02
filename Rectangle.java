package shapes;

public class Rectangle extends Shapes {
    int length;
    int width;
    
    int perimeter;
    int rectArea;
    double diagonal;
    double lengthToWidthRatio;
    
    public int getLength(int l){
        length = l;
        return length;
    }
    
    public int getWidth(int w){
        width = w;
        return width;
    }
    
    public int getPerimeter(int getLength, int getWidth){
        perimeter = 2 * getLength + 2 * getWidth;
        return perimeter;
    }
    
    public int getArea(int getLength, int getWidth){
        rectArea = getLength * getWidth;
        return rectArea;
    }
    
    public double getDiagonal(int getLength, int getWidth){
        diagonal = Math.round(Math.sqrt(getLength * getLength + getWidth * getWidth));
        return diagonal;
    }
}
