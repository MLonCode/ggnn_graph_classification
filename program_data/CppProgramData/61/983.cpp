/*
 *  5   1009.cpp
 *
 *  Created on: 2013-10-9
 *      Author: weng
 *      ?????????????: ?????????????1?
 *      ???????????2?????
 *      ???????a???????????a??????
 *      ????
 *      ?1?????????n?????n????
 *      ???????1?????????a(1 <= a <= 20)
 *      ????
 *      n?????????????
 *      ???????????????????a?????
 */



int main()
{
	int a[20],i=2,k=0,n;
	cin>>n;
	int b[n],j=0;
	while(j<n)
	{
		cin>>b[j];
		j++;
	}
	a[0]=1;
	a[1]=1;
	while(i<=19)
	{
		a[i]=a[i-1]+a[i-2];
		i++;
	}
	while(k<n)
	{
		cout<<a[(b[k]-1)]<<"\n"<<endl;
		k++;
	}

return 0;
}