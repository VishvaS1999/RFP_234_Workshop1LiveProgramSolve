import java.util.Arrays;

public class IntArrayReplaceNumberStoreString
{
    public static void main(String[] args)
    {
        String[] array = {"0000", "1111", "1100", "0011", "1010", "0101"};
        System.out.println("Original Array is : " + Arrays.toString(array));
        String replace=" ";
        for(int i=0; i<array.length;i++)
        {
            String str=array[i];
                for(int j=0; j<str.length(); j++)
                {
                    if(str.charAt(j)=='0')
                    {
                        replace=replace+"1";
                    }
                    else if (str.charAt(j)=='1')
                    {
                        replace=replace+"0";
                    }
                }
               replace=replace+" ";

        }
        System.out.println("Replace Array is  : " +Arrays.toString(new String[]{replace}));
    }
}


