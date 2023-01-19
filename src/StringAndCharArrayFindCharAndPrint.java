import java.util.Arrays;

public class StringAndCharArrayFindCharAndPrint
{
    public static void main(String[] args)
    {
        String[] array={"Apple","Banana","Mango"};
        char[] array1={'a', 'e', 'i', 'o', 'u', 'm', 'z'};
        System.out.println("String Array is : " + Arrays.toString(array));
        System.out.println("Character Array is : " +Arrays.toString(array1));
        int count=0;
        for(int i=0; i<array.length; i++)
        {
            String str=array[i].toLowerCase();
            for(int j=0; j<str.length(); j++)
            {
                for(int k=0; k< array1.length; k++)
                {
                    if(str.charAt(j)==array1[k])
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
