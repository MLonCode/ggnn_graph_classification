package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] array = new int[15];
		int i;
		int j;
		int temp;
		int min;
		int flag;
		int twice;
		for (;;)
		{

		for (i = 0;i < 15;i++)
		{
			array[i] = 0;
		}
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				temp = Integer.parseInt(tempVar);
			}
			if (temp == -1)
			{
				return 0;
			}
			if (temp == 0)
			{
				break;
			}
			array[i] = temp;
		}
		// ??
		for (i = 0;i < 15;i++)
		{
				min = array[i];
				for (j = i + 1;j < 15;j++)
				{
					if (array[j] < min)
					{
						temp = min;
						min = array[j];
						array[j] = temp;
					}
				}
				array[i] = min;
		}
		//?????????
		for (flag = 0,i = 0;i < 15;i++)
		{
			if (array[i] == 0)
			{
				continue;
			}
			twice = array[i] * 2;
			for (j = i + 1;j < 15;j++)
			{
				if (array[j] > twice)
				{
					break;
				}
				if (array[j] == twice)
				{
					flag++;
				}
			}
		}
		System.out.printf("%d\n\n",flag);
		}

		return 0;
	}
}

