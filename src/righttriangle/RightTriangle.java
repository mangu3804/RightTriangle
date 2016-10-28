package righttriangle;


/**
 * RightTriangle class.
 */
public class RightTriangle {
    
    private double base;
    private double height;
    
    /**
     * constructor
     * pre: none
     * post: A RightTriangle object created. Base and height initialized to 1.
     */
    public RightTriangle() {
        base = 1;
        height = 2;
    }
    
    /**
     * constructor
     * pre: none
     * post: A RightTriangle object created with a base of b and a height of h.
     */
    public RightTriangle(double b, double h)  {
        base = b;
        height = h;
    }
    
    /**
     * Changes the base of the triangle;
     * pre: none
     * post: The base has been changed.
     */
    public void setBase(double b) {
        base = b;
    }
    
    /**
     * Changes the height of the triangle;
     * pre: none
     * post: The height has been changed.
     */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
     * Returns the base of th triangle:
     * pre: none
     * post: The base has been returned.
     */
    public double getBase() {
        return (base);
    }
    
    /**
     * returns the height of the triangle:
     * pre: none
     * post: The height has been returned.
     */
    public double getHeight() {
        return (height);
    }
    
    /**
     * Calculates the area of the triangle.
     * pre: none
     * post: The area of the triangle has been returned.
     */
    public double area() {
        double triangleArea;
        
        triangleArea = 1/2 * base * height;
        return (triangleArea);
    }
    
    /**
     * Calculates the hypotenuse of the triangle.
     * pre: none
     * post: The hypotenuse of the triangle has been returned.
     */
    private double hypotenuse() {
        double hypotenuse;
        hypotenuse = Math.sqrt((base * base) + (height * height));
        return hypotenuse;
    }
    
    /**
     * Returns a String that represents the RightTriangle object.
     * pre: none
     * post: A string representing the RightTriangle object has been returned.
     */
    public String toString() {
        String triangleString;
        
        triangleString = "Triangle with base " + base
                + " and height " + height
                + " has hypotenuse " + hypotenuse();
        return (triangleString);
    }
}