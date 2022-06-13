import java.util.*;
class Sample3
{
 public static void main(String args[])
{
 int[] arr={2,3,4,5,6,7,8,9,10};
 //int[] drr={0,0,0,0,0};
 int a=arr.length;
 int[] drr=new int[a];
 int l=drr.length;
 
  for(int i=arr.length-1;i>=0;i--)
     {
       //System.out.println(arr[i]);
         drr[l-i-1]=arr[i];

      }
  for(int i=0;i<drr.length;i++)
      {
        System.out.print(drr[i]+" ");
      }
 
  
 }
}