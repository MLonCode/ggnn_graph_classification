/*********************88??????**********************
??
??????????????????????????????????????????????????????????????????????????????????"AAABBBBCBB"??????(A,3)(B,4)(C,1)(B,2)??????????????????????????
???????????????????????????
????
??????????0?????1000????????????
????
????????????????(A,3)(B,4)(C,1)(B,2)????????????????????????????
????
aaabbbcccd
?
aAABBbBCCCaaaaa
????
(A,3)(B,3)(C,3)(D,1)
?
(A,3)(B,4)(C,3)(A,5)
********************************************************/
char la(char temp)
{
    if (temp>='A' &&temp<='Z')
        return temp;
    else if (temp>='a'&&temp<='z')
        return temp-'a'+'A';
    else
        cout<<"errer,not ??"<<temp<<endl;
    return temp;
}
int main()
{
    char a[1000];
    cin>>a;
    int length=strlen(a);
    char follow=la(a[0]);
    int same=1;
    for (int i=1 ; i<length ; i++)
    {
        if (la(a[i])==follow)
        {
            same++;
        }
        else
        {
            cout<<"("<<follow<<","<<same<<")";
            same=1;
            follow=la(a[i]);
        }
    }
    cout<<"("<<follow<<","<<same<<")";
    return 0;
}
