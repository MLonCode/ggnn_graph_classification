import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		while (str = new Scanner(System.in).nextLine())
		{
			char[] k = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] ts = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			int i;
			int t;
			int[] num = new int[101];
			int temp = 0;
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				k[i] = ' ';
				ts[i] = str.charAt(i);
				if (str.charAt(i) == '(')
				{
					temp++;
				}
				if (str.charAt(i) == ')')
				{
					temp--;
				}
				if (temp < 0)
				{
					k[i] = '?';
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
					temp++;
				}
			}
			t = i - 1;
			temp = 0;
			for (i = t;i >= 0;i--)
			{
				if (str.charAt(i) == ')')
				{
					temp++;
				}
				if (str.charAt(i) == '(')
				{
					temp--;
				}
				if (temp < 0)
				{
					k[i] = '$';
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
					temp++;
				}
			}
			System.out.print(ts);
			System.out.print("\n");
			System.out.print(k);
			System.out.print("\n");
		}
		return 0;
	}
}

