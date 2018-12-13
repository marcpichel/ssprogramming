package ss.week2.Rectangle;
// Edited rectangle including JMF comments
public class Rectangle {
    private int length;
    private int width;
	
    /**
     * Create a new Rectangle with the specified length and width.
     * Cannot be negative or exceed max int value
     */
    
    public Rectangle(int length, int width) {
    }
    
    /**
     * The length of this Rectangle.
     */
    /*@ require getlength >=0 
    * 			getlength < 2147483647
    */
    public int length() {
    	return length;
    }

    /**
     * The width of this Rectangle.
     */
    /*@ require getwidth >= 0 
    * 			getwidth < 2147483647
    */
    public int width() {
    	return width;
    }

    /**
     * The area of this Rectangle.
     */
    /*@ ensure	area >= 0
    *			area < 2147483647^2
    * @ assertion area >=0 : 'Value needs to be positive'
    */
    public int area() {
    	area = width()*height();
    }

    /**
     * The perimeter of this Rectangle.
     */
    /*@ ensure	perimeter >= 0
     *			perimeter < 21474836472
     */
    public int perimeter() {
    	return 0;
    }
}
