package ADD;

public class DemoAdd {
	
	static int Add(int x, int y)
	{
	    if (y == 0)
	        return x;
	    else
	        return Add( x ^ y, (x & y) << 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		a=15;
		b=25;
		c=Add(a,b);
		System.out.println(c);
	}

}
