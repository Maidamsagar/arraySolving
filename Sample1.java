import java.util.*;
class Sample1
{
 public static void main(String args[])
{
  int [] arr={2,3,4,3,5,7,6,3,3,2};
   int num=8;
   int count=0;
   boolean isArray=false;
   for(int element:arr)
     {
       if(num==element)
         {
           isArray=true;
           //count++;
           //break;
          }
       
      }
    if(isArray)
           {
               System.out.println("yes");
            }
       else
           {
              
             System.out.println("no");
            }
             
      System.out.println(count);

  }
}