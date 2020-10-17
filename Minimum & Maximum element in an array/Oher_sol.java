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
//find the max and minimum element in the array
public class MinimumMaximum {
    static class minmax()
    {
        int min;
        int max;
    }
            
    public static void main(String agrs[])
{
    minmax obj=new minmax();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n]; 
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    if(n==1)
    {
        obj.min=a[0];
        obj.max=a[0];
    }
    if(a[0]>a[1])
    {
        obj.max=a[0];
        obj.min=a[1];
    }
    else{
        obj.max=a[1];
        obj.min=a[0];
    }
    for(int i=2;i<n;i++)
    {
        if(a[i]>obj.max)
            obj.max=a[i];
        else
            obj.min=a[i];
    }
        
    System.out.println("Maximum Value is:"+obj.max);
    System.out.println("Minimum Value is:"+obj.min);
}
    
}
