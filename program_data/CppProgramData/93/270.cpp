int main()
{
int a;
char n;
n='n';
scanf("%d",&a);
if(a%3==0&&a%5==0&&a%7==0)
{
	printf("3 5 7");
}
else if(a%3!=0&&a%5==0&&a%7==0)
{
	printf("5 7");
}
else if(a%3==0&&a%5!=0&&a%7==0)
{
	printf("3 7");
}
else if(a%3==0&&a%5==0&&a%7!=0)
{
	printf("3 5");
}
else if(a%3==0&&a%5!=0&&a%7!=0)
{
	printf("3");
}
else if(a%3!=0&&a%5==0&&a%7!=0)
{
	printf("5");
}
else if(a%3!=0&&a%5!=0&&a%7==0)
{
	printf("7");
}
else if(a%3!=0&&a%5!=0&&a%7!=0)
{
	printf("%c",n);
}
return 0;
}
