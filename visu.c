#include<stdio.h>
void main()
{
    int i=0,len=2,sum=0,flag=0,j=0,temp1=0,temp2=0,k=0;
    char s[100];
    int a[]={1,5,10,50,100,500,1000};
    char b[]={'I','V','X','L','C','D','M'};
    scanf("%s",&s);
    len=strlen(s);
    switch(s[len-1])
    {
        case 'I':
            sum=sum+1;
            break;
        case 'V':
            sum=sum+5;
            break;
        case 'X':
            sum=sum+10;
            break;
        case 'L':
            sum=sum+50;
            break;
        case 'C':
            sum=sum+100;
            break;
        case 'D':
            sum=sum+500;
            break;
        case 'M':
            sum=sum+1000;
            break;
    }
    for(i=len-2;i>=0;i--)
    {
        for(j=0;j<7;j++)
        {
            if(b[j] == s[i])
            {
                temp1=a[j];
                temp2=i+1;
                for(k=0;k<7;k++)
                {
                    if(b[k] == s[temp2])
                    {
                        if((temp1 > rom[k]) || (temp1 == rom[k]) )
                        {
                            sum=sum+temp1;
                        }
                        else
                        {
                            sum=sum-a[j];
                        }
                    }
                }
            }
        }
    }
    printf("%d",sum);
}
