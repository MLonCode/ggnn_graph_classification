package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
	{
		if (b == 1)
		{
			d = c;
			System.out.printf("%d",d);
		}
			else if (b == 2)
			{
			d = 31 + c;
			System.out.printf("%d",d);
			}
				else if (b == 3)
				{
			d = 31 + 29 + c;
			System.out.printf("%d",d);
				}
					else if (b == 4)
					{
			d = 31 + 29 + 31 + c;
			System.out.printf("%d",d);
					}
						else if (b == 5)
						{
			d = 31 + 29 + 31 + 30 + c;
			System.out.printf("%d",d);
						}
							else if (b == 6)
							{
			d = 31 + 29 + 31 + 30 + 31 + c;
			System.out.printf("%d",d);
							}
								else if (b == 7)
								{
			d = 31 + 29 + 31 + 30 + 31 + c + 30;
			System.out.printf("%d",d);
								}
									else if (b == 8)
									{
			d = 31 + 29 + 31 + 30 + 31 + c + 30 + 31;
			System.out.printf("%d",d);
									}
										else if (b == 9)
										{
			d = 31 + 29 + 31 + 30 + 31 + c + 30 + 31 + 31;
			System.out.printf("%d",d);
										}
											else if (b == 10)
											{
			d = 31 + 29 + 31 + 30 + 31 + c + 30 + 31 + 31 + 30;
			System.out.printf("%d",d);
											}
												else if (b == 11)
												{
			d = 31 + 29 + 31 + 30 + 31 + c + 30 + 31 + 31 + 30 + 31;
			System.out.printf("%d",d);
												}
													else if (b == 12)
													{
			d = 31 + 29 + 31 + 30 + 31 + c + 30 + 31 + 31 + 30 + 31 + 30;
			System.out.printf("%d",d);
													}


	}
	else if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
	{
		if (b == 1)
		{
			d = c;
			System.out.printf("%d",d);
		}
			else if (b == 2)
			{
			d = 31 + c;
			System.out.printf("%d",d);
			}
				else if (b == 3)
				{
			d = 31 + 28 + c;
			System.out.printf("%d",d);
				}
					else if (b == 4)
					{
			d = 31 + 28 + 31 + c;
			System.out.printf("%d",d);
					}
						else if (b == 5)
						{
			d = 31 + 28 + 31 + 30 + c;
			System.out.printf("%d",d);
						}
							else if (b == 6)
							{
			d = 31 + 28 + 31 + 30 + 31 + c;
			System.out.printf("%d",d);
							}
								else if (b == 7)
								{
			d = 31 + 28 + 31 + 30 + 31 + c + 30;
			System.out.printf("%d",d);
								}
									else if (b == 8)
									{
			d = 31 + 28 + 31 + 30 + 31 + c + 30 + 31;
			System.out.printf("%d",d);
									}
										else if (b == 9)
										{
			d = 31 + 28 + 31 + 30 + 31 + c + 30 + 31 + 31;
			System.out.printf("%d",d);
										}
											else if (b == 10)
											{
			d = 31 + 28 + 31 + 30 + 31 + c + 30 + 31 + 31 + 30;
			System.out.printf("%d",d);
											}
												else if (b == 11)
												{
			d = 31 + 28 + 31 + 30 + 31 + c + 30 + 31 + 31 + 30 + 31;
			System.out.printf("%d",d);
												}
													else if (b == 12)
													{
			d = 31 + 28 + 31 + 30 + 31 + c + 30 + 31 + 31 + 30 + 31 + 30;
			System.out.printf("%d",d);
													}
	}


		return 0;
	}
}

