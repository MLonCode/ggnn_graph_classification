package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int t;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (z != q)
				{
					for (s = 1;s <= 5;s++)
					{
						if (s != q && s != z)
						{
							for (l = 1;l <= 5;l++)
							{
								if (l != z && l != q && l != s && (z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
								{
									a[0] = z;
									a[1] = q;
									a[2] = s;
									a[3] = l;
									for (int i = 0;i <= 2;i++)
									{
										for (int j = 3;j > i;j--)
										{
											if (a[j] > a[j - 1])
											{
												t = a[j];
												a[j] = a[j - 1];
												a[j - 1] = t;
											}
										}
									}
									for (int i = 0;i <= 3;i++)
									{
										if (z == a[i])
										{
											System.out.printf("\nz %d",10 * z);
										}
										if (q == a[i])
										{
											System.out.printf("\nq %d",10 * q);
										}
										if (s == a[i])
										{
											System.out.printf("\ns %d",10 * s);
										}
										if (l == a[i])
										{
											System.out.printf("\nl %d",10 * l);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
