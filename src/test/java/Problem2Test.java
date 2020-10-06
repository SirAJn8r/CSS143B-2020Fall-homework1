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
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Problem2.bubbleSort(input);
        assertArrayEquals(input, expected);

        // Test if program can deal with the far limits of integers, and test if it can work with arrays only 2 items
        input = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
        expected = new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE};
        Problem2.bubbleSort(input);
        assertArrayEquals(input, expected);

        // Test if program can properly deal with the same number occurring multiple times, and negative numbers
        input = new int[] {-20, 0, -10, 0, 3, 6, 6, 2, 6, 0, 10356};
        expected = new int[] {-20, -10, 0, 0, 0, 2, 3, 6, 6, 6, 10356};
        Problem2.bubbleSort(input);
        assertArrayEquals(input, expected);

        // Test if program throws an error when given an array with only 1 item
        input = new int[] {4};
        expected = new int[] {4};
        Problem2.bubbleSort(input);
        assertArrayEquals(input, expected);
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
