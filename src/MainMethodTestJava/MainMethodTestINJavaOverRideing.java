package MainMethodTestJava;

public class MainMethodTestINJavaOverRideing {
	
	public static void main(boolean args)
	{
		if(args)
		{
			System.out.println("inside boolean");
		}
		
	}
	
	public static void main(String a ,String b)
	{
		System.out.println("the actual string are "+ a+"  "+b);
		
	}

	public static void main(int args)
	{
		System.out.println("inter main method");
	}
	
	public static void main(String[] args ){
		
		System.out.println("original main method");
		
		MainMethodTestINJavaOverRideing mainMethodTestINJavaOverRideing = new MainMethodTestINJavaOverRideing();
		mainMethodTestINJavaOverRideing.main(true);
		
	}
}
