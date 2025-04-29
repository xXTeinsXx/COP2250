/**
 * MyInteger_BC class represents an integer value with various utility methods
 */
public class MyInteger_BC {
    // Private data field
    private int value;
    
    /**
     * Constructor that creates a MyInteger_BC object with the specified int value
     * @param value the integer value to store
     */
    public MyInteger_BC (int value) {
        this.value = value;
    }
    
    /**
     * Getter method for the value
     * @return the int value stored in this object
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Checks if the value in this object is even
     * @return true if the value is even, false otherwise
     */
    public boolean isEven() {
        return (value % 2 == 0);
    }
    
    /**
     * Checks if the value in this object is odd
     * @return true if the value is odd, false otherwise
     */
    public boolean isOdd() {
        return (value % 2 != 0);
    }
    
    /**
     * Static method to check if a specified int value is even
     * @param value the int value to check
     * @return true if the value is even, false otherwise
     */
    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }
    
    /**
     * Static method to check if a specified int value is odd
     * @param value the int value to check
     * @return true if the value is odd, false otherwise
     */
    public static boolean isOdd(int value) {
        return (value % 2 != 0);
    }
    
    /**
     * Static method to check if the value in a MyInteger_BC object is even
     * @param myInt the MyInteger_BC object to check
     * @return true if the value is even, false otherwise
     */
    public static boolean isEven(MyInteger_BC myInt) {
        return myInt.isEven();
    }
    
    /**
     * Static method to check if the value in a MyInteger_BC object is odd
     * @param myInt the MyInteger_BC object to check
     * @return true if the value is odd, false otherwise
     */
    public static boolean isOdd(MyInteger_BC myInt) {
        return myInt.isOdd();
    }
    
    /**
     * Checks if the value in this object equals the specified int value
     * @param value the int value to compare with
     * @return true if the values are equal, false otherwise
     */
    public boolean equals(int value) {
        return this.value == value;
    }
    
    /**
     * Checks if the value in this object equals the value in another MyInteger_BC object
     * @param myInt the MyInteger_BC object to compare with
     * @return true if the values are equal, false otherwise
     */
    public boolean equals(MyInteger_BC myInt) {
        return this.value == myInt.getValue();
    }
}