package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n;
		int i;
		int j;
		int k;
		int p;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();

		k = n - 1;
		for (p = 0;p < n;p++)
		{
			if (a[p] == ' ')
			{
				m = m + 1;
			}
		}

	  if (m != 0)
	  {
		for (i = (n - 1);i >= 0;i--)
		{
			if (a[i] == ' ')
			{
				for (j = (i + 1);j <= k;j++)
				{
					System.out.printf("%c",a[j]);
				}
				System.out.printf("%c",a[i]);

				k = i - 1;
			}

		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == ' ')
			{
				for (j = 0;j < i;j++)
				{
					System.out.printf("%c",a[j]);
				}
				break;
			}
		}
	  }
	  else
	  {
		  System.out.println(a);
	  }
	}

}
