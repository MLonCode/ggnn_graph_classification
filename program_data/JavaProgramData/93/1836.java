package <missing>;

public class GlobalMembers
{
	//********************************
	//*???5.cpp   **
	//*?????3?5?7????   **
	//*?????? 1300012838 **
	//*???2013.9.26  **
	//********************************

	public static int Main()
	{

		int a; //?? ??a?????? ?????
		int num = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0)
		{
			System.out.print("3");
			num++; //??????1
		}
		if (a % 5 == 0)
		{
			if (num != 0) //????????????
			{
				System.out.print(" ");
			}
			System.out.print("5");
			num++; //??????1
		}
		if (a % 7 == 0)
		{
			if (num != 0) //????????????
			{
				System.out.print(" ");
			}
			System.out.print("7");
			num++; //??????1
		}
		if (num == 0) //??????????n
		{
			System.out.print("n");
		}

		return 0;
	}
}

