import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    // Example test
    // DO NOT CHANGE
    @Test
    public void testBinarySearch() {
        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
                {Integer.MIN_VALUE, 0, 1, Integer.MAX_VALUE},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                null
        };
        int targets[] = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9, 1, 5, 10, 6};
        int answer[] = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3, 2, 4, -1, -1};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }
}
