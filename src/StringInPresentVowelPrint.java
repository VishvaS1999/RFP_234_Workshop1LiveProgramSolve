import java.util.Arrays;

public class StringInPresentVowelPrint
{
    public static void toCount(String[] array,char[] array1)
    {
        System.out.println("String array is : " + Arrays.toString(array));
        System.out.println("Character array is : " +Arrays.toString(array1));
        for(String ele:array)
        {
            for(int i=0; i<ele.length();i++)
            {
                char ch=ele.toLowerCase().charAt(i);
                for(char element: array1)
                {
                    if(element==ch)
                    {
                        System.out.println("The Character ' " +element+ "' in the string ' " +ele+ "' is contained in the given set of characters");
                        break;
                    }
                }

            }
        }
    }

    public static void main(String[] args)
    {
        String[] array={"Apple", "Banana", "Mango"};
        char[] array1={'a','e','i','o','u'};
        toCount(array,array1);
    }
}
