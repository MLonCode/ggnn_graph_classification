/*
 * Fibonacci.cpp
 *
 *  Created on: 2012-10-22
 *  Author: ??
 *  ????????????????: ?????????????1????????????2?????
???????a???????????a??????
 */


int main()
{
	int n = 0 ,a = 0, b = 1 , x1 =1, x2 =1, x3 = 1  ; //???????????
	cin >> n ;                //????
	for ( int i = 0 ; i<n ; i++ )
	{
		cin >> a ;           //??a
		if ( a == 1 || a == 2 )
		cout << "1" << endl ;    //?????????????1
		else
		{
			for ( int k = 1 ; k <= a-2 ; k++ )
			{
				x3 = x1 + x2 ;
				x1 = x2 ;
				x2 = x3 ;      //??b??
			}
			b = x3 ;                //?b??
			cout << b << endl ;     //??b??
			x1 =1, x2 =1, x3 = 1  ;    //????
		}
	}
	return 0 ;                     //??

}
