package <missing>;

public class GlobalMembers
{
	/*
	??
	??2?15????????????????????????????????????????????
	????1 4 3 2 9 7 18 22???????3???2?1????4?2????18?9????
	
	????
	??????????????????????2?15????????100?????
	?????????0??????????????????2?15????????
	??????????????-1,???????????????????
	
	????
	????????????????????????????????????
	
	?? 1000012760
	*/


	public static int Main()
	{

		int[] a = new int[16];
		int i = 0;
		int j = 0;
		int n = 0;
		int Two;

		for (i = 0; i < 16; i++)
		{
			a[i] = 0;
		}

		while (1 > 0)
		{

			n = 0;
			Two = 0;

			for (i = 0; i < 16; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((a[i] == 0) || (a[0] == -1))
				{
					break;
				}
				else
				{
					n++;
				}
			}

			if (a[0] == -1)
			{
				break;
			}

			for (i = 0; i < n; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if ((a[i] == (2 * a[j])) || (a[j] == (2 * a[i])))
					{
						Two++;
					}
				}
			}

			System.out.print(Two);
			System.out.print("\n");
		}

		return 0;
	}
}

