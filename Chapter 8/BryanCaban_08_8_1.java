public class BryanCaban_08_8_1 {
    
    //Calculates the sum of all elements in a specified column of a matrix.
   
    public static double sumColumn(double[][] m, int columnIndex) {
        // Initialize sum to zero
        double sum = 0;
        
        // Iterate through each row of the matrix
        for (int row = 0; row < m.length; row++) {
            // Check if the column index is valid for the current row
            // This prevents ArrayIndexOutOfBoundsException for ragged arrays
            if (columnIndex < m[row].length) {
                // Add the current element to the running sum
                sum += m[row][columnIndex];
            }
        }
        
        // Return the final sum
        return sum;
    }
    
    /**
     * Main method to test the sumColumn function.
     * Creates a 3x4 matrix and calculates the sum of each column.
     */
    public static void main(String[] args) {
        // Create a 3-by-4 matrix (3 rows, 4 columns)
        double[][] matrix = {
            {1.5, 2.0, 3.5, 4.0},  // First row
            {5.5, 6.0, 7.5, 8.0},  // Second row
            {9.5, 10.0, 11.5, 12.0} // Third row
        };
        
        // Display the sum of each column
        for (int column = 0; column < 4; column++) {
            // Call sumColumn for each column and display the result
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix, column));
        }
    }
}