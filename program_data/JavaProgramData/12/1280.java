package <missing>;

public class GlobalMembers
{
	/***************************
	No.1200012819
	Name ???
	Date 2012-10-31
	***************************/


	public static int Main()
	{
		int[] a = new int[16]; //?????16????????????0?
		while (true) //????????????-1??????
		{
			int i = 0; //?????????????????????
			int num = 0;
			int p = 0;
			while (true) //??????????a?????????????0??????
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] <= 0) //????????????????
				{
					break;
				}
				i++; //??i???
			}
			if (a[0] == -1) //??????-1??????
			{
				break;
			}
			for (int j = 0;j < i;j++) //??a[0]?a[i-1]????????????a[0]?a[i-1]????????
			{
				p = j;
				for (int k = 0;k < i;k++)
				{
					if (a[p] * 2 == a[k]) //??????nun ?1?
					{
						num++;
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}

}

