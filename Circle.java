package shapes;

public class Circle extends Shapes {
    int radius;
    int xCenter;
    int yCenter;
    int xCoordinate;
    int yCoordinate;

    double circumference;
    double distance;

    public int getRadius(int r){
        radius = r;
        return radius;
    }

    public double getCircumference(int getRadius){
        circumference = 2 * Math.PI * getRadius; //Circumference of circle is 2 * pi * radius.
        return circumference;
    }

    public double getArea(int getRadius){
        area = Math.PI * Math.pow(getRadius, 2); //Area of circle is pi * radius squared.
        return area;
    }

    public int getXCenter(int x){
        xCenter = x;
        return xCenter;
    }

    public int getYCenter(int y){
        yCenter = y;
        return yCenter;
    }

    public int getXCoordinate(int x){
        xCoordinate = x;
        return xCoordinate;
    }

    public int getYCoordinate(int y){
        yCoordinate = y;
        return yCoordinate;
    }

    public double getDistance(int getXCenter, int getYCenter, int getXCoordinate, int getYCoordinate){
        xCenter = getXCenter;
        yCenter = getYCenter;
        xCoordinate = getXCoordinate;
        yCoordinate = getYCoordinate;

        int diffX = xCoordinate - xCenter;
        int diffY = yCoordinate - yCenter;
        distance = Math.round(Math.sqrt(diffX * diffX + diffY * diffY)); //Distance between point and center of circle.

        return distance;
    }

    public boolean onCircle(double getDistance, int getRadius){
        distance = getDistance;
        radius = getRadius;
        return distance < radius; //Returns true if the point lies on the circle.
    }

    public boolean insideCircle(double getDistance, int getRadius){
        distance = getDistance;
        radius = getRadius;

        return distance == radius; //Returns true if the point lies within the circle.
    }
}

