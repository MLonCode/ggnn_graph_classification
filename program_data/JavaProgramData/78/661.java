package <missing>;

public class GlobalMembers
{
	/*
	 * hw20130927(8.cpp
	 *?????????
	 *???????????????????????????????????????????
	 *?????????????10???????????????50????????????
	 *?????????????????; ????????????????????????
	 *??????????????????????????????????????????
	 *??????????????????????????
	 *  Created on: 2013-9-29
	 *      Author: KyLin
	 */
	public static int Main()
	{
		int zhao; //???????????
		int qian;
		int sun;
		int li;
		int z; //???????????
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;++z)
		{
			for (q = 1;q <= 5;++q)
			{
				for (s = 1;s <= 5;++s)
				{
					for (l = 1;l <= 5;++l)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q)) //????????
						{
							zhao = z * 10;
							qian = q * 10;
							sun = s * 10;
							li = l * 10;
						}
					}
				}
			}
		}
		final int z1 = zhao; //??????
		final int q1 = qian;
		final int s1 = sun;
		final int l1 = li;
		while (zhao < 60 || qian < 60 || sun < 60 || li < 60)
		{
			zhao += 10; //???60??????????
			qian += 10;
			sun += 10;
			li += 10;
			if (zhao == 60)
			{
				System.out.print("z ");
				System.out.print(z1);
				System.out.print("\n");
			}
			if (qian == 60)
			{
				System.out.print("q ");
				System.out.print(q1);
				System.out.print("\n");
			}
			if (sun == 60)
			{
				System.out.print("s ");
				System.out.print(s1);
				System.out.print("\n");
			}
			if (li == 60)
			{
				System.out.print("l ");
				System.out.print(l1);
				System.out.print("\n");
			}
		}
		return 0;
	}

}
