package <missing>;

public class GlobalMembers
{
	/*
	2011 01 08 ??
	
	??
	????????,?????????????.????????,???????,?????????????.
	????????????????.??????????????????,??????????????.(?????????.)
	????
	????n???? 
	????,?????????????m,??m??????????????.
	????
	?????????????????.
	
	?? 1000012760
	*/


	public static int TimeUsed = 0;
	public static int Jumps = 0;
	public static int Time = 0;

	public static void Jump()
	{
		TimeUsed++;
		Jumps++;
	}
	public static void Fail()
	{
		TimeUsed += 3;
	}

	public static int Main()
	{
		int kids;
		int Failure;
		int i;
		int j;
		int k;
		int[][] FailTime = new int[2][60];
		kids = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < kids; i++)
		{
			Jumps = 0;
			TimeUsed = 0;
			Failure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < Failure; j++)
			{
				FailTime[0][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				FailTime[1][j] = 0;
			}
			while (true)
			{
				Jump();
				for (k = 0; k < Failure; k++)
				{
					if ((Jumps == FailTime[0][k]) && (FailTime[1][k] == 0))
					{
						FailTime[0][k] = 1;
						Fail();
						break;
					}
				}
				if (TimeUsed >= 60)
				{
					break;
				}
			}
			System.out.print(Jumps);
			System.out.print("\n");
		}
		return 0;
	}
}

