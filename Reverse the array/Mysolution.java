/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package competitive.programming;
import java.util.*;


/**
 *
 * @author DELL
 */
public class Reverse {
    //Reverse the array

public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n]; 
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int k=0;
for(int i=n-1;i>=(n/2);i--)
    
{
    int t=0;
t=a[i];
a[i]=a[k];
a[k]=t;
k++;
}
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
} 

}
