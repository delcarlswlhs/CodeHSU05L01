import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/23
 * @author Simone Del Carlo
 *
 * @description Creates a rectangle with a width and height or a square with a side length.
 * The use can also calculate the perimeter and area of the rectangle and print information
 * about the Rectangle.
 */
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;

    /**
     * @Description default constructor
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * creates a Rectangle object with width and height
     * @param w width of the rectangle
     * @param h height of the rectangle
     */
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    public Rectangle(double width){
        this.width = width;
    }

    //accessors

    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return the height of the rectangle
     */
    public double getHeight(){
        return height;
    }

    //mutators

    /**
     * Allows the user to change the width of the rectangle.
     * @param newWidth desired width
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * Modifies height of the rectangle
     * @param newHeight
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }
    //other methods

    /**
     * Calculate area of rectangle
     * @return area of rectangle
     */
    public double calculateArea(){
        area = height*width;
        return area;
    }

    public double calculatePerimeter(){
        perimeter = height + height + width + width;
        return perimeter;
    }



    //toString method
    /**
     * Prints the height and width of rectangle to 2 decimal places
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
        return "The height of the rectangle is " + df.format(height) + " and the width is "
                + df.format(width) + ".";
    }
}