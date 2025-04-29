/**
 * Test program to verify all the methods in the MyInteger_BC class
 */
public class TestMyInteger {
    public static void main(String[] args) {
        // Create MyInteger_BC objects
        MyInteger_BC num1 = new MyInteger_BC(15);
        MyInteger_BC num2 = new MyInteger_BC(20);
        MyInteger_BC num3 = new MyInteger_BC(15);
        
        // Test getValue() method
        System.out.println("num1 value: " + num1.getValue());
        System.out.println("num2 value: " + num2.getValue());
        System.out.println("num3 value: " + num3.getValue());
        
        // Test isEven() and isOdd() instance methods
        System.out.println("\nTesting instance methods isEven() and isOdd():");
        System.out.println("num1.isEven(): " + num1.isEven());
        System.out.println("num1.isOdd(): " + num1.isOdd());
        System.out.println("num2.isEven(): " + num2.isEven());
        System.out.println("num2.isOdd(): " + num2.isOdd());
        
        // Test static isEven(int) and isOdd(int) methods
        System.out.println("\nTesting static methods isEven(int) and isOdd(int):");
        System.out.println("MyInteger_BC.isEven(15): " + MyInteger_BC.isEven(15));
        System.out.println("MyInteger_BC.isOdd(15): " + MyInteger_BC.isOdd(15));
        System.out.println("MyInteger_BC.isEven(20): " + MyInteger_BC.isEven(20));
        System.out.println("MyInteger_BC.isOdd(20): " + MyInteger_BC.isOdd(20));
        
        // Test static isEven(MyInteger_BC) and isOdd(MyInteger_BC) methods
        System.out.println("\nTesting static methods isEven(MyInteger_BC) and isOdd(MyInteger_BC):");
        System.out.println("MyInteger_BC.isEven(num1): " + MyInteger_BC.isEven(num1));
        System.out.println("MyInteger_BC.isOdd(num1): " + MyInteger_BC.isOdd(num1));
        System.out.println("MyInteger_BC.isEven(num2): " + MyInteger_BC.isEven(num2));
        System.out.println("MyInteger_BC.isOdd(num2): " + MyInteger_BC.isOdd(num2));
        
        // Test equals(int) method
        System.out.println("\nTesting equals(int) method:");
        System.out.println("num1.equals(15): " + num1.equals(15));
        System.out.println("num1.equals(20): " + num1.equals(20));
        System.out.println("num2.equals(20): " + num2.equals(20));
        
        // Test equals(MyInteger_BC) method
        System.out.println("\nTesting equals(MyInteger_BC) method:");
        System.out.println("num1.equals(num2): " + num1.equals(num2));
        System.out.println("num1.equals(num3): " + num1.equals(num3));
        System.out.println("num2.equals(num3): " + num2.equals(num3));
    }
}