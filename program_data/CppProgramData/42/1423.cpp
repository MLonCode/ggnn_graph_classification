/*
 * DeleteNumber.cpp
 *
 *  Created on: 2012-11-2
 *  Author: ??
 *  ??????????????????????????????????????
 ?????????????????????????????
 */

//?????

int main() {
	int n, k, num = 0;        //????n?k??????
	int a[100010];               //??????
	cin >> n;                      //??n??
	for (int i = 0; i < n; i++) {
		cin >> a[i];                  //???????
	}
	cin >> k;                        //??k??
	for (int j = 0; j < n - num; j++)            //?????????
	{
		if (a[j] == k)                   //????????k
		{
			num = num + 1;                    //???????
			for (int t = j; t < n - num; t++) {
				a[t] = a[t + 1];                 //????????
			}
			if( a[j] == k )  j = j-1 ;           //???????k????
		}
	}
	for (int i1 = 0; i1 < n - num - 1; i1++) {
		cout << a[i1] << " ";              //????
	}
	cout << a[n - num - 1];                      //????????
	return 0; //??
}
