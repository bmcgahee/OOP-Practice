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
    
    public double getRatio(int getLength, int getWidth){
        lengthToWidthRatio = getLength / getWidth;
        return lengthToWidthRatio;
    }
    
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        
        String rectName = rectangle.getName("Bob");
        String rectColor = rectangle.getColor("red");
        
        int length = rectangle.getLength(25);
        int width = rectangle.getWidth(14);
        
        int perimeter = rectangle.getPerimeter(length, width);
        int area = rectangle.getArea(length, width);
        double diagonal = rectangle.getDiagonal(length, width);
        double ratio = rectangle.getRatio(length, width);
        
        System.out.println("Hello, my name is " + rectName);
        System.out.println("My color is " + rectColor);
        System.out.println("I have a perimeter of " + perimeter);
        System.out.println("My area is " + area);
        System.out.println("My diagonal length is " + diagonal);
        System.out.println("And my length to width ratio is " + ratio);
    }
}
