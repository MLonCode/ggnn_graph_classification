package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[MAX + 1]);
	int i;
	int j;
	int n;
	int l;
	char A;
	char T;
	char G;
	char C;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	l = s.length();
	for (j = 0;j < l;j++)
	{
	if (s.charAt(j) == 'T')
	{
		System.out.print("A");
	}
	if (s.charAt(j) == 'A')
	{
		System.out.print("T");
	}
	if (s.charAt(j) == 'G')
	{
		System.out.print("C");
	}
	if (s.charAt(j) == 'C')
	{
		System.out.print("G");
	}
	}
	System.out.print("\n");
	}
	return 0;
	}

}

