import java.util.*;

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'c', so pointers on this parameter are left unchanged:
	public static void delsp(char * c)
	{
		int flag = 0;
		int n = 0;
		for (; * (c.Substring(n)) != '\0'; c++)
		{
			if (*(c.Substring(n)) == ' ')
			{
				if (*(c.Substring(n) + 1) == ' ')
				{
					n++;
					*c = (c.Substring(n));
					c--;
				}
			}
			else
			{
			*c = (c.Substring(n));
			}
		}
		*c = '\0';
	}

	public static int Main()
	{
		String sen = new String(new char[100]);
		sen = new Scanner(System.in).nextLine();
		delsp(sen);
		System.out.print(sen);
		return 0;
	}

}
