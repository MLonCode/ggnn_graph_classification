package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String[] p = new String[100];
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(p[i]).length();j++)
			{
				k = 1;
				c = (p[i] + j);
				if (j == 0)
				{
					if ((c < 'a' || c>'z') && (c < 'A' || c>'Z') && c != '_')
					{
						k = 0;
						break;
					}
				}
				if (j != 0)
				{
					if ((c < 'a' || c>'z') && (c < 'A' || c>'Z') && c != '_' && (c < '0' || c>'9'))
					{
					k = 0;
					break;
					}
				}
			}
			System.out.printf("%d\n",k);
		}
		return 0;

	}

}

