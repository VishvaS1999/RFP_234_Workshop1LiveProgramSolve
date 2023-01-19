import java.util.Arrays;

public class PrintSameNumberInString
{
    public static void count(String[] array)
    {
        System.out.println("Original Array is : " + Arrays.toString(array));
         int count=0;
        for(int i=0; i< array.length; i++)
        {
            String str=array[i];
            for(int j=0; j<str.length(); j+=2)
            {
                if(str.charAt(j)=='1')
                {
                    count++;
                }
            }
        }
        System.out.println("String in 1 is : " +count+ " time");

    }
    public static void main(String[] args)
    {
        String[] array={"0000","0001","0011","0111","1111","1110","1100","1000"};
        count(array);

    }
}
