import java.util.*;
class Sample2
{
 public static void main(String args[])
{
  int[][] mat={{2,3,4},{2,3,4}};
  int[][] cat={{2,3,5},{1,2,3}};
  int[][] result={{0,0,0},{0,0,0}};
  
  for(int i=0;i<mat.length;i++)
    {
     for(int j=0;j<mat[i].length;j++)
      {
        result[i][j]=mat[i][j]+cat[i][j];
        System.out.print(result[i][j]);
        System.out.print(" ");
       }
System.out.println("");
     }
      
 }
}