package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int M;
		int Lose;
		int i;
		int j;
		//????N????M?????
		int[] Times = new int[101];
		int[] Bad = new int[101];
		//????Times???Bad??
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//????
		for (i = 1;i <= N;i++)
		{
			//??????
			Lose = 0;
			//?????????
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//??????
			for (j = 1;j <= M;j++)
			{
				//??
				Times[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				//??????
				if (Lose == 0)
				{
					//????????
				if ((Times[j] + j * 3) >= 60)
				{
					//???????????????????????
					if ((Times[j] + 3 * (j - 1) >= 60))
					{
						//???????????
						Bad[i] = 60 - 3 * (j - 1);
					}
					//???????60????????
					else //??
					{
						Bad[i] = Times[j];
					}
					//????????????
					Lose = 1;
					//??????
				}
				}
			}
			if (M == 0)
			{
				//??????
				Bad[i] = 60;
			}
			//???60?
			else if ((Times[M] + 3 * M) <= 60)
			{
				//????????????
				Bad[i] = 60 - 3 * M;
			}
			//????????
		}
		for (i = 1;i <= N;i++)
		{
			//????
			System.out.print(Bad[i]);
			if (i != N)
			{
				System.out.print("\n");
			}
		}
		return 0;
		//????
	}

}

