package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q1;
		int q2;
		int q3;
		int q4;
		int q5;
		int r1;
		int r2;
		int r3;
		int r4;
		int r5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q1 = n / 10;
		r1 = n % 10;

		if (q1 == 0)
		{
			System.out.printf("%d\n",r1);
		}
		else
		{
			q2 = q1 / 10;
			r2 = q1 % 10;

			if (q2 == 0)
			{
				System.out.printf("%d%d\n",r1,r2);
			}
			else
			{
				q3 = q2 / 10;
				r3 = q2 % 10;

				if (q3 == 0)
				{
					System.out.printf("%d%d%d\n",r1,r2,r3);
				}
				else
				{
					q4 = q3 / 10;
					r4 = q3 % 10;

					if (q4 == 0)
					{
						System.out.printf("%d%d%d%d\n",r1,r2,r3,r4);
					}
					else
					{
						q5 = q4 / 10;
						r5 = q4 % 10;
						System.out.printf("%d%d%d%d%d\n",r1,r2,r3,r4,r5);
					}

				}
			}
		}

		return 0;
	}


}

