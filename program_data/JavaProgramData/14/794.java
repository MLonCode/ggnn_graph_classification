package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chinese;
	//		int math;
	//		int sum;
	//	}
	//	stu[100001],t;
		int n;
		int i;
		int j;
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
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = tempVar4;
			}
			stu[i].sum = stu[i].chinese + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (stu[j].sum >= stu[j + 1].sum)
				{
					t = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = t;
				}
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
		return 0;
	}
}

