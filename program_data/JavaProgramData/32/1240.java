package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????  **
	//*????? 1300012845 **
	//*???2013.11.15  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int u = 1;
		int l1;
		int l2;
		int flag = 0;
		char[] str1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] str2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] out = new int[102];
		int[] num1 = new int[103];
		int[] num2 = new int[103];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			flag = 0; //????????
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l1 = str1.length();
			l2 = str2.length();
			u = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(out,0,102); //??????
			for (i = 0; i <= l1 - 1; i++)
			{
				num1[i + 1] = str1[i] - '0'; //????????
			}
			for (i = 0; i <= l2 - 1; i++)
			{
				num2[i + 1] = str2[i] - '0'; //????????
			}
			while (u <= l1 != 0 && u <= l2)
			{
				out [u] = num1[l1 - u + 1] - num2 [l2 - u + 1]; //?????????????
				u++;
			}
			for (u = l1; u >= l2 + 1; u--)
			{
				out[u] = num1[l1 - u + 1]; //??????????????
			}
			for (i = 1; i <= l1 - 1; i++)
			{
				if (out [i] < 0) //???????+10???
				{
					out[i + 1] += -1, out[i] += 10;
				}
			}
			for (u = l1; u >= 1 ; u--)
			{
				if (out[u] != 0)
				{
					flag = 1; //????????????????
				}
				if (flag != 0)
				{
					System.out.print(out[u]);
				}
				if (u == 0)
				{
					break;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

