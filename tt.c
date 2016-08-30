#include<stdio.h>
#include<string.h>
int main()
{
int i,j,count=0,high=1;
char c;
char a[10];
char b[10];
char c[1];
char a;
printf("enter the string");
gets(a);
b[10]=a[10];
for(i=0;i<=10;i++)
{
    for(j=0;j<=i;j++)
    {
    if(a[i]==b[j])
    count++;
    }
    if(count>high)
    high=count;
    c=a[i];
    }
    printf("%d",c);
    return 0;
}
