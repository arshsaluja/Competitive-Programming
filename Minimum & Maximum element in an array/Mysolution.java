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
    public static void main(String agrs[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n]; 
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int min=Integer.MAX_VALUE;
    int max=0; 
    for(int i=0;i<n;i++)
    {  
          if(max<a[i])
          {
              max=a[i];
          }
          if(min>a[i])
          {
              min=a[i];
          }
          
          
    }
    System.out.println("Maximum Value is:"+max);
    System.out.println("Minimum Value is:"+min);
}
    
}
