package <missing>;

public class GlobalMembers
{
	/* Name      : ???? 
	 * Version   : 1.0
	 * Date      : 2012-11-19
	 * New       : Null
	 * Func&Feat : 
	 * State     : Work
	 */
	public static int Main()
	{
		char c; //???c?????????boy????????
		char boy = 0;
		int n_person; //???n_person?????n_pair?????
		int n_pair;
		int[] sym = new int[100]; //???sym[]??????????????1????-1?pair[][2]?????
		int[][] pair = new int[50][2];
		for (int i = 0;i < 100;i++)
		{
			c = System.in.read();
			if (i == 1)
			{
				boy = c; //???????????boy??????????
			}
			if (c == '\n')
			{
				n_person = i;
				n_pair = n_person / 2;
				break;
			}
			if (c == boy)
			{
				sym[i] = 1; //???boy???sym[]???1??????-1
			}
			else
			{
				sym[i] = -1;
			}
		}
		for (int i0 = n_person - 1,p = n_pair - 1;i0 >= 0;i0--) //????????????????
		{
			if (sym[i0] == -1) //??????????????????????????????????0
			{
				pair[p][1] = i0; //??????
				for (int i1 = i0,sum = 0;i1 >= 0;i1--)
				{
					sum = sum + sym[i1];
					if (sum == 0) //????????0?????????????
					{
						pair[p][0] = i1;
						break;
					}
				}
				p--; //pair[]??????p?n_pair-1???0
			}
		}
		for (int p = 0;p < n_pair;p++)
		{
			System.out.print(pair[p][0]);
			System.out.print(' ');
			System.out.print(pair[p][1]);
			System.out.print("\n");
		}
		return 0;
	}

}
