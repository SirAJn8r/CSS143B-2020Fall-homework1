import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test
{
    // Example test
    // Okay to change
    @Test
    public void testBubbleSort()
    {
        assertTrue(true);

        // Test if program loops enough times to fully reverse data set
        int[] dataSet1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        printArray(dataSet1);
        Problem2.bubbleSort(dataSet1);
        printArray(dataSet1);
        System.out.println();

        // Test if program can deal with the far limits of integers, and test if it can work with arrays only 2 items
        int[] dataSet2 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        printArray(dataSet2);
        Problem2.bubbleSort(dataSet2);
        printArray(dataSet2);
        System.out.println();

        // Test if program can properly deal with the same number occurring multiple times, and negative numbers
        int[] dataSet3 = {-20, 0, -10, 0, 3, 6, 6, 2, 6, 0, 10356};
        printArray(dataSet3);
        Problem2.bubbleSort(dataSet3);
        printArray(dataSet3);
        System.out.println();

        // Test if program throws an error when given an array with only 1 item
        int[] dataSet4 = {4};
        printArray(dataSet4);
        Problem2.bubbleSort(dataSet4);
        printArray(dataSet4);
        System.out.println();
    }

    // Just a function to print the arrays in a nice way without repeating that code
    public void printArray(int[] data)
    {
        System.out.print("[");
        for(int i = 0; i < data.length-1; i++)
        {
            System.out.print(data[i] + ", ");
        }
        System.out.println(data[data.length-1] + "]");
    }
}
