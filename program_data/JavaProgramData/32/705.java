import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????????//
	//??????//
	//???1000011029//
	//???2010?11?20?//


	public static int Main()
	{
		int n = 0; //??????????//
		String num1 = new String(new char[102]); //????????//
		String num2 = new String(new char[102]); //????????//
		int i = 0; //??????????//
		int t = 0; //???????????????//
		int k = 0; //???????????????//
		int m = 0; //????????//
		int g = 0; //????????//

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++) //??????//
		{
			cin.ignore(); //??�\0�//
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1,'0',102);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2,'0',102);

			num1 = new Scanner(System.in).nextLine(); //?????//
			num2 = new Scanner(System.in).nextLine(); //?????//

			t = num1.length(); //???????????//
			k = num2.length(); //???????????//

			t = t - 1; //???????????????//
			g = t; //?????????????//
			for (k = k - 1 ;k >= 0;k--) //??????//
			{
					if (num1.charAt(t) >= num2.charAt(k)) //???//
					{
						num1 = tangible.StringFunctions.changeCharacter(num1, t, num1.charAt(t) - num2.charAt(k) + '0');
					}
					else //???//
					{
						num1 = tangible.StringFunctions.changeCharacter(num1, t, 10 + num1.charAt(t) - num2.charAt(k) + '0');
						num1.charAt(t - 1)--;
					}
					t--;
			}
			for (m = 0;m <= g;m++)
			{
					if (num1.charAt(m) != 0)
					{
						for (t = m;t <= g;t++)
						{
							System.out.print(num1.charAt(t));
						}
						System.out.print("\n");
						break;
					}
			}

		}

		return 0;

	}
}

