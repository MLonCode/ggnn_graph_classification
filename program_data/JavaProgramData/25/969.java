package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num1;
		int num2;
		int s = 0;
		String a = new String(new char[110]);
		for (int i = 1;i <= 109;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '*');
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 1;
		int sig;
		a = tangible.StringFunctions.changeCharacter(a, 1, '2');
		if (n == 1)
		{
			System.out.print(2);
			System.out.print("\n");
		}
		else
		{
			if (n == 0)
			{
				System.out.print(1);
			}
			else
			{
				for (int i = 1;i <= n - 1;i++)
				{
					sig = t;
					for (int j = 1;j <= sig;j++)
					{
						num1 = a.charAt(j) - 48;
						num1 = num1 * 2 + s;
						s = 0;
						if (num1 < 10)
						{
							a = tangible.StringFunctions.changeCharacter(a, j, num1 + 48);
						}
						else
						{
							a = tangible.StringFunctions.changeCharacter(a, j, num1 + 38);
							if (a.charAt(j + 1) == '*')
							{
								a = tangible.StringFunctions.changeCharacter(a, j + 1, '1');
								t++;
							}
							else
							{
								s = 1;
							}
						}
					}
				}
				for (int i = 109;i >= 1;i--)
				{
					if (a.charAt(i) != '*')
					{
						System.out.print(a.charAt(i));
					}
				}
			}
		}
		return 0;
	}
}

