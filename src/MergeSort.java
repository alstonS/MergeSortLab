public class MergeSort {

    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements,0,n-1,temp);


    }
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if(from<to)
        {
            int middle=(from + to) /2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);

        }




    }
    private static void merge(int[] elements,int from,int middle, int to, int[] temp)
    {
        int i = from;
        int j = middle;
        int k = from;

        while( i<=j && j<=k)
        {
            if(elements[i] > elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[j]= elements[j];
                j++;
            }
            k++;
        }
        while(i<=j)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while(j <= to)
        {
            temp[k] = elements[j];
            j++; k++;
        }
        for(int a=0; a<temp.length; a++)
        {
            elements[a] = temp[a];
        }

    }








}
