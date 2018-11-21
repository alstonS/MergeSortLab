public class Runner {

    public static void main(String[] args)
    {
        int[] arrayInteger = intArrayList(10000);
        long time;

        time = System.currentTimeMillis();
        MergeSort.mergeSort(arrayInteger);
        time = System.currentTimeMillis()-time;
        System.out.println("Merge Sort: "+ time*.001 + "Seconds");

    }
    public static int[] intArrayList(int length)
    {
        int[] array = new int[length];
        for( int i=0; i< array.length; i++)
        {
            array[i] = (int) (Math.random()*1000);
        }
        return array;
    }
}
