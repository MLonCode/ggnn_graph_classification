package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int z;
	   int q;
	   int s;
	   int l;
	   int i;
	   int j;
	   int k;
		for (z = 10; z <= 50 ; z += 10)
		{
				for (q = 10 ; q <= 50; q += 10)
				{
					if (z == q)
					{
						continue;
					}
				for (s = 10 ; s <= 50; s += 10)
				{
					if (s == q || s == z)
					{
						continue;
					}

					for (l = 10; l <= 50; l += 10)
					{
						if (l == s || l == q || l == z)
						{
							continue;
						}

					if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
					{
					   for (i = 50 ; i >= 10 ; i -= 10)
					   {
						if (z == i)
						{
							System.out.printf("z %d\n",z);
						}
						if (q == i)
						{
							System.out.printf("q %d\n",q);
						}
						if (s == i)
						{
							System.out.printf("s %d\n",s);
						}
						if (l == i)
						{
							System.out.printf("l %d\n",l);
						}
					   }
					}
					}
				}
				}
		}


	}

}
