/*
 * xx.cpp
 *
 *  Created on: 2011-11-2
 *      Author: FXD
 */

int main()//?????
{//?????
	char a[80],b[80];//?????????????????
	int i;//
	cin.getline(a,80);//??a?????
	cin.getline(b,80);//??b?????
	for(i=0;i<80;i++)//
	{if(a[i]>=65&&a[i]<=90)//
		{a[i]=a[i]+32;}//
	if(b[i]>=65&&b[i]<=90)//
	{b[i]=b[i]+32;}}//??????????????
	if(strcmp(a,b)>0)cout<<">";//
	if(strcmp(a,b)==0)cout<<"=";//
	if(strcmp(a,b)<0)cout<<"<";//?strcmp???????????????
	return 0;//???????????????????
	}//?????

