package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int len;
	int[] a = new int[100];
	char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	fflush(stdin);
	for (i = 0;i < n;i++)
	{
	s = new Scanner(System.in).nextLine();
	len = s.length();
	j = 0;
	if (s[0] == '_' || ('a' <= s[0] && s[0] <= 'z') || ('A' <= s[0] && s[0] <= 'Z'))
	{
	 j = 1;
	 while (j < len)
	 {
				 if (s[j] == '_' || ('a' <= s[j] && s[j] <= 'z') || ('A' <= s[j] && s[j] <= 'Z') || ('0' <= s[j] && s[j] <= '9'))
				 {
	  j++;
				 }
	 else
	 {
		 break;
	 }
	 }
	}
	if (j == len)
	{
	a[i] = 1;
	}
	else
	{
		a[i] = 0;
	}
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%d\n",a[i]);
	}

	}
}

