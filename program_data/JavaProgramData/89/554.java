package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	/* ? ? ?   ???????
	/* ? ?      ????                           
	/* ? ? ? ??2010 ? 12  ?  13  ?     
	/* ? ? ? ??????????????????????
	???????????????
	/* ? ?      ?1000012752        
	*******************************************************/ 
	public static int Main()
	{
		int biaoji = 1; //biaoji????????????
		int n;
		int i;
		int j;
		int a;
		int b;
		int[] known = new int[10000]; //?????????know??????known
		int[] know = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; ; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0) //??0?0??
			{
				break;
			}
			if (a == b && a != 0)
			{
				continue;
			}
			know[a] = 1; //????0?0????????????????????
			known[b]++; //??????????
		}
		for (j = 0 ; j < n ; j++)
		{
			if (know[j] == 0 && known[j] == n - 1) //????????????????????n-1???????????
			{
				System.out.print(j);
				System.out.print("\n");
				biaoji = 0;
			}
		}

		if (biaoji != 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}




}

