package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a[i] != 0;i++)
		{
			if (a[i] >= 65 && a[i] <= 90)
			{
				a[i] = a[i] + 32;
			}
		}
		b = new Scanner(System.in).nextLine();
		for (i = 0;b[i] != 0;i++)
		{
			if (b[i] >= 65 && b[i] <= 90)
			{
				b[i] = b[i] + 32;
			}
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
	}
}
