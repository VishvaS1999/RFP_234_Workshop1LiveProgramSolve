import java.util.Arrays;

public class SecondSmallestArray
{
    public static int SecondSmallestArray(int[] a)
    {
        System.out.println("Array is : " + Arrays.toString(a));
        int temp;
        for (int i = 0; i < 6; i++)
        {
            for (int j = i + 1; j < 6; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("After Swapping : ");
        for (int i = 0; i < 6; i++)
        {
            System.out.print(" "+a[i]+" ");

        }
        System.out.println();
        return a[1];
    }
    public static void main(String[] args)
    {
        int a[]={1,4,3,6,5,2};
        System.out.println("Second Smallest Number is : " +SecondSmallestArray(a));
    }
}
