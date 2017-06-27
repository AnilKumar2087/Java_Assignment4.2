package variables;

public class Variables_Demo {
	
	int a=0; //Instance variable
	static int b=0;  //Class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables_Demo obj= new Variables_Demo();
		
		//class variables can be accessed using class name
		
		Variables_Demo.b=1000;
		
		System.out.println("value of static variable is " +b);
		
		//to access instance variable ,object of class should be created
		
			obj.a=100;
		
			System.out.println("value of instance variable is " +obj.a);
			
		//static variable is shared to all the instances where as instance variables are not
		
			Variables_Demo obj1= new Variables_Demo();	
			
			System.out.println("value of static variable is " +b);
			System.out.println("value of instance variable is " +obj1.a);
		
	}

}
