package <missing>;

public class GlobalMembers
{
	//*********************************************************
	//* ? ??3.cpp                                          *
	//* ? ??? ? 1200012916                               *
	//* ? ??2012?9?29?                                  *
	//* ? ??????3?5?7????                        *
	//*********************************************************

	public static int Main() //???
	{ //?????
		int a; //?????????
		int a1;
		int a2;
		int a3;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1 = a % 3; //??????3??
		a2 = a % 5; //??????5??
		a3 = a % 7; //??????7??

		{ //??????

			if (a1 == 0) //?????3??
			{
				if (a2 == 0) //??3????????5??
				{
					if (a3 == 0) //??5????????7??
					{
						System.out.print("3 5 7");
						System.out.print("\n");
					}
					else
					{
						System.out.print("3 5");
						System.out.print("\n");
					}
				}
				else //???5??
				{
					if (a3 == 0) //?????7??
					{
						System.out.print("3 7");
						System.out.print("\n");
					}
					else
					{
						System.out.print("3");
						System.out.print("\n");
					}
				}
			}

			else //???3??
			{
				if (a2 == 0) //?????5??
				{
					if (a3 == 0) //??5????????7??
					{
						System.out.print("5 7");
						System.out.print("\n");
					}
					else //??
					{
						System.out.print("5");
						System.out.print("\n");
					}
				}
				else //???5??
				{
					if (a3 == 0) //?????7??
					{
						System.out.print("7");
						System.out.print("\n");
					}
					else //??
					{
						System.out.print("n");
						System.out.print("\n");
					}
				}
			}

		} //??????

		return 0;
	} //?????


}

