package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String[] weekdays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	int y;
	int m;
	int d;
	int w;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d = Integer.parseInt(tempVar3);
	}
	w = 1 * (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + d;
	for (i = 1;i < m;i++)
	{
	w += days[i - 1];
	}
	if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0 && (m > 2))
	{
	w++;
	}

	System.out.printf("%s.\n", weekdays[w % 7]);

	return 0;
	}

}

