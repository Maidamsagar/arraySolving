import java.util.Arrays;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one="tea";
		String two="ate";
		if(one.length()!=two.length())
		{
			System.out.println("not");
		}
		else {
		
         char[] arr1=one.toCharArray();
         char[] arr2=two.toCharArray();
         
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         int count=0;
         for(int i=0;i<arr1.length;i++)
         {
        	 if(arr1[i]!=arr2[i])
        	 {
        		 System.out.println("not");
        		 count++;
        		 break;
        	 }
         }
         if(count==0) {
        	 System.out.println("yes");
         }
		}
	}

}
