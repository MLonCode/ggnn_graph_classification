import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int b;
		int i;
		int j;
		int d;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		 a = new Scanner(System.in).nextLine();
		  b = a.length();
		  System.out.print(a.charAt(0));
		for (i = 1;i < b;i++)
		{
			 if (((a.charAt(i) == ' ') && (a.charAt(i - 1) != ' ')) || a.charAt(i) != ' ')
			 {
				System.out.print(a.charAt(i));

			 }
		}

			return 0;
	}
}
