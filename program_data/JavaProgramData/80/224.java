package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int date = 0;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (sy != ey || sm != em || sd != ed)
		{
			date++;
			if (sm == 12 && sd == 31)
			{
				sy++;
				sm = 1;
				sd = 1;
			}
			else if (((sm == 1 || sm == 3 || sm == 5 || sm == 7 || sm == 8 || sm == 10) && sd == 31) || ((sm == 4 || sm == 6 || sm == 9 || sm == 11) && sd == 30))
			{
				sm++;
				sd = 1;
			}
			else if (sm == 2 && ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0)) && sd == 29)
			{
				sm++;
				sd = 1;
			}
			else if (sm == 2 && ((sy % 4 != 0) || (sy % 100 == 0 && sy % 400 != 0)) && sd == 28)
			{
				sm++;
				sd = 1;
			}
			else
			{
				sd++;
			}
		}
		System.out.print(date);
		System.out.print("\n");
		return 0;
	}
}

