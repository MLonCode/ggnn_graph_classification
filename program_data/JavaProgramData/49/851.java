import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************
	//*??????? **
	//*?????? **
	//*???1200012957 **
	//*???2012-11-18 **
	//***********************

	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int k;
		int len;
		int m;
		int n;
		int count;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		// i + 1????????i???1??len - 1?
		for (i = 1; i < len; i++)
		{
			// j??????????
			for (j = 0; j < len - i; j++)
			{
				// ???i, j???????????????
				m = j;
				n = j + i;
				// ???????
				count = 0;
				// ?????????????????????
				while (str.charAt(m) == str.charAt(n) && m < n)
				{
					m++;
					n--;
					count++;
				}
				// ???????????????????count??[i / 2] + 1;
				if (count == i / 2 + 1)
				{
					// ?????????
					for (k = j; k <= j + i; k++)
					{
						System.out.print(str.charAt(k));
					}

					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}
