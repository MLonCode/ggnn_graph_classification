package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 3;
		b = n % 5;
		c = n % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7");
		}
		else
		{
			if (a == 0 && b == 0)
			{
				System.out.print("3 5");
			}
			else
			{
				if (a == 0 && c == 0)
				{
					System.out.print("3 7");
				}
				else
				{
					if (b == 0 && c == 0)
					{
						System.out.print("5 7");
					}
					else
					{
						if (a == 0)
						{
							System.out.print("3");
						}
						else
						{
							if (b == 0)
							{
								System.out.print("5");
							}
							else
							{
								if (c == 0)
								{
									System.out.print("7");
								}
								else
								{
									System.out.print("n");
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

