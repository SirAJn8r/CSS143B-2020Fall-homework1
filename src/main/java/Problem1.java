public class Problem1
{
    public static int binarySearch(int[] data, int target)
    {
        if(data == null || data.length == 0 || (data.length == 1 && data[0] != target))
        {
            return -1;
        }

        int half = (data.length - 1) / 2;

        if(target == data[half])
        {
            return half;
        }
        else if(target > data[half])
        {
            //secondHalf starts at last value - half
            int[] secondHalf = new int[data.length - 1 - half];
            for(int i = 0; i < secondHalf.length; i++)
                //add everything past half
                secondHalf[i] = data[half+i+1];

            //add half + 1 (for half itself) to the returning index
            //BUT if -1, return -1
            int temp = binarySearch(secondHalf, target);
            if(temp == -1) return -1;
            else return half + 1 + temp;
        }
        else // target < data[half]
        {
            int[] firstHalf = new int[half];
            for(int i = 0; i < half; i++)
                firstHalf[i] = data[i];

            return binarySearch(firstHalf, target);
        }
        /*
         * Note: In both the else if and else statements,
         * data[half] is not included in the next recursion as we know it is not the target
         */
    }
}
