package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[25][25];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
				for (j = 0;j < n;j++)
				{
					if ((i == 0) && (j == 0))
					{
						if ((a[0][0] >= a[0][1]) && (a[0][0] >= a[1][0]))
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
					}
					else if ((i == 0) && (j == n - 1))
					{
						if ((a[0][n - 1] >= a[0][n - 2]) && (a[0][n - 1] >= a[1][n - 1]))
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
					}
					else if ((i == m - 1) && (j == n - 1))
					{
										if ((a[m - 1][n - 1] >= a[m - 1][n - 2]) && (a[m - 1][n - 1] >= a[m - 2][n - 1]))
										{
											System.out.print(i);
											System.out.print(' ');
											System.out.print(j);
											System.out.print("\n");
										}
					}
					else if ((i == m - 1) && (j == 0))
					{
														if ((a[m - 1][0] >= a[m - 1][1]) && (a[m - 1][0] >= a[m - 2][0]))
														{
															System.out.print(i);
															System.out.print(' ');
															System.out.print(j);
															System.out.print("\n");
														}
					}
					else
					{
						if (i == 0)
						{
							if ((a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
							{
								System.out.print(i);
								System.out.print(' ');
								System.out.print(j);
								System.out.print("\n");
							}
						}
						else if (i == m - 1)
						{
												if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
												{
													System.out.print(i);
													System.out.print(' ');
													System.out.print(j);
													System.out.print("\n");
												}
						}
						else if (j == 0)
						{
																	if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j + 1]) && (a[i][j] >= a[i + 1][j]))
																	{
																		System.out.print(i);
																		System.out.print(' ');
																		System.out.print(j);
																		System.out.print("\n");
																	}
						}
						else if (j == n - 1)
						{
																	if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i + 1][j]))
																	{
																		System.out.print(i);
																		System.out.print(' ');
																		System.out.print(j);
																		System.out.print("\n");
																	}
						}
						else
						{
							if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j + 1]))
							{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
							}

						}

					}
				}
		}

		return 0;
	}

}

