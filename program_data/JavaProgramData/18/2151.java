package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int n = 0;n < N;n++)
		{
		int[][] Ma = new int[N][N];
		for (int i = 0;i < N;i++)
		{
			for (int j = 0;j < N;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Ma[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		int SUM = 0;
		for (int Now = 1;Now < N;Now++)
		{
			int MINR = Ma[0][0];
			for (int j = Now;j < N;j++)
			{
				if (MINR > Ma[0][j])
				{
					MINR = Ma[0][j];
				}
			}
			Ma[0][0] -= MINR;
			for (int j = Now;j < N;j++)
			{
				Ma[0][j] -= MINR;
			}
			for (int i = Now;i < N;i++)
			{
				int MIR = Ma[i][0];
				for (int j = Now;j < N;j++)
				{
					if (MIR > Ma[i][j])
					{
						MIR = Ma[i][j];
					}
				}
				Ma[i][0] -= MIR;
				for (int j = Now;j < N;j++)
				{
					Ma[i][j] -= MIR;
				}
			}
			int MINC = Ma[0][0];
			for (int j = Now;j < N;j++)
			{
				if (MINC > Ma[j][0])
				{
					MINC = Ma[j][0];
				}
			}
			Ma[0][0] -= MINC;
			for (int j = Now;j < N;j++)
			{
				Ma[j][0] -= MINC;
			}
			for (int i = Now;i < N;i++)
			{
				int Mic = Ma[0][i];
				for (int j = Now;j < N;j++)
				{
					if (Mic > Ma[j][i])
					{
						Mic = Ma[j][i];
					}
				}
				Ma[0][i] -= Mic;
				for (int j = Now;j < N;j++)
				{
					Ma[j][i] -= Mic;
				}
			}
			SUM += Ma[Now][Now];
		}
		System.out.printf("%d\n",SUM);
		}
	}

}

