package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int n;
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
		if ((y % 100 != 0 && y % 4 == 0) || (y % 400 == 0))
		{
	switch (m)
	{
	case 1:
		n = d;
		break;
	case 2:
		n = 31 + d;
		break;
	case 3:
		n = 60 + d;
		break;
	case 4:
		n = 91 + d;
		break;
	case 5:
		n = 121 + d;
		break;
	case 6:
		n = 152 + d;
		break;
	case 7:
		n = 182 + d;
		break;
	case 8:
		n = 213 + d;
		break;
	case 9:
		n = 244 + d;
		break;
	case 10:
		n = 274 + d;
		break;
	case 11:
		n = 305 + d;
		break;
	default:
		n = 335 + d;
	}
		}
		else
		{
	switch (m)
	{
	case 1:
		n = d;
		break;
	case 2:
		n = 31 + d;
		break;
	case 3:
		n = 59 + d;
		break;
	case 4:
		n = 90 + d;
		break;
	case 5:
		n = 120 + d;
		break;
	case 6:
		n = 151 + d;
		break;
	case 7:
		n = 181 + d;
		break;
	case 8:
		n = 212 + d;
		break;
	case 9:
		n = 243 + d;
		break;
	case 10:
		n = 273 + d;
		break;
	case 11:
		n = 304 + d;
		break;
	default:
		n = 334 + d;
	}
		}
		System.out.printf("%d",n);
		return 0;
	}
}

