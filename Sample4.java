import java.util.*;
import java.Math.*;
class Sample4
{
 public static void main(String args[])
{
 int[] arr={2,3,4,5,6,7,8,9,10};
 int l=arr.length;
int temp;
 int a=Math.floorDiv(l,2);
 for(int i=0;i<a;i++)
  {
    temp=arr[i];
    arr[i]=arr[l-i-1];
    arr[l-i-1]=temp;
   }
 for(int element:arr)
  {
    System.out.println(element);
   }
}
}