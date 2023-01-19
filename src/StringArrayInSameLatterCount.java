import java.util.Scanner;

class StringArrayInSameLatterCount
{
    public static void count(String[] string)
    {
        System.out.println("Enter Any Character : ");
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        int chCount = 0;
        for (int i = 0; i < string.length; i++)
        {
            String str=string[i].toLowerCase();
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(j) == ch)
                {
                    chCount++;
                }
            }
        }
        System.out.println("Character Count is : " + chCount);
    }

        public static void main (String[]args)
        {
            String[] Array={"Apple", "Banana", "Mango"};
            count(Array);
        }
    }

