import java.util.*;
public class Intersection
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int m=sc.nextInt();
int a1[]=new int[m];
System.out.println("Enter array elements : ");
for(int i=0;i<m;i++)
{
a1[i]=sc.nextInt();
}
System.out.println("Enter size of array : ");
int n=sc.nextInt();
int a2[]=new int[n];
System.out.println("Enter array elements : ");
for(int j=0;j<n;j++)
{
a2[j]=sc.nextInt();
}
int a3[]=new int[m+n];
int c=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(a1[i]==a2[j])
{
a3[c]=a1[i];
c++;
}
else
continue;
}
}
System.out.println("Interesection of two arrays is : ");
for(int i=0;i<c;i++)
{
if(a3[i]!=a3[i+1])
{
System.out.println(a3[i]);
}
}
System.out.println( );
}
}

output 1: 

Enter size of array : 
4
Enter array elements : 
1 2 2 1
Enter size of array : 
2
Enter array elements : 
2 2
Interesection of two arrays is : 
2

output 2:
Enter size of array : 
3
Enter array elements : 
4 9 5
Enter size of array : 
5
Enter array elements : 
9 4 9 8 4
Interesection of two arrays is : 
4
9