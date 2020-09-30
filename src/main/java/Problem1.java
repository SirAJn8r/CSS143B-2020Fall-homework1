public class Problem1
{
    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target)
    {
        int half = data.length / 2;

        if(target == data[half])
        {
            return half;
        }
        else if(target > data[half])
        {
            int[] secondHalf = new int[data.length - half];
            for(int i = 0; i < data.length - half; i++)
                secondHalf[i] = data[half+i];
            return half + binarySearch(secondHalf, target);
        }
        else // target < data[half]
        {
            int[] firstHalf = new int[half];
            for(int i = 0; i < half; i++)
                firstHalf[i] = data[i];
            return binarySearch(data, target);
        }
    }
}
