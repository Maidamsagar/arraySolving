
public class Sampl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=7;
        System.out.println(rec(n-1));
        
        
	}
	public static int rec(int value)
	{
		
		if(value==0)
		{
			return 0;
		}
		else if(value==1)
		{
			return 1;
		}
		else
		{
			return rec(value-1)+rec(value-2);
		}
		
		
	}

}
