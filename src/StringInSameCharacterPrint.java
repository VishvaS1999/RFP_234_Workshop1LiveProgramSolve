import java.util.Scanner;

public class StringInSameCharacterPrint
{
    public static void count(String name)
    {
        int chCount = 0;
        System.out.println("Enter Any Character : ");
        Scanner s = new Scanner(System.in);
        char ch = s.nextLine().charAt(0);

        for (int i = 0; i < name.length(); i++)
        {

            if (ch == name.charAt(i))
            {
                chCount++;
            }
        }
        if(chCount==0)
        {
            System.out.println("Character is Not Present in String");
        }
        else
        {
            System.out.println("Character Count is : "+chCount);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter Any String : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().toLowerCase();
        count(name);
    }
}
