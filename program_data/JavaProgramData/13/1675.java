package <missing>;

public class GlobalMembers
{
	/*??
	??n????n???????????????10-100??? 
	???????????????????????????????????????????
	????
	??????? 
	??????????n?1<=n<=20000?????????????????? 
	???????????n????????????10???100?
	????
	???????????????????????????????????????*/
	public static int Main()
	{
		int[] n = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int nin; //cin:nin
		nin = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int N;
		int[] num = new int[nin]; //??
		int count = 0;
		for (int i = 1;i <= nin;++i)
		{
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n[N] == 0)
			{
				num[count] = N;
				count++;
			}
			n[N]++; //????????????,???
		}
		for (int i = 0;i <= count - 2;++i)
		{
			System.out.print(num[i]);
			System.out.print(' ');
		}
		System.out.print(num[count - 1]);
		return 0;
	}

}

