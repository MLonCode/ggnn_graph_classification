package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????homework_1.cpp        *
	//*  ??????1200012884        * 
	//*  ?????2012?10?22?      *
	//*  ???????????        *
	//**********************************

	public static int Main()
	{
		int m; //?????????i????????????j?????k???????????????jud1?jud2
		int i;
		int j;
		int k;
		int jud1;
		int jud2;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= (m / 2);i = i + 2)
		{
			jud1 = 1; //???
			for (j = 3;j <= Math.sqrt(i);j = j + 2) //???????i???
			{
				if (i % j == 0)
				{
					jud1 = 0;
					break;
				}
			}
			if (jud1 != 0) //??i???
			{
				k = m - i; //?????
				jud2 = 1; //???
				for (j = 3;j <= Math.sqrt(k);j = j + 2) //???????k???
				{
					if (k % j == 0)
					{
						jud2 = 0;
						break;
					}
				}
			if (jud2 != 0) //???????k???
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(k);
				System.out.print("\n");
			}
			}
		}
		return 0;
	}


}

