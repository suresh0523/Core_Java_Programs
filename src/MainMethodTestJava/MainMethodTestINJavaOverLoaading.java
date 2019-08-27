package MainMethodTestJava;

public class MainMethodTestINJavaOverLoaading {
	
	
	public static void main(int args)
	{
		System.out.println("main integer");
	}
	
	public static void main(char args)
	{
		System.out.println("main char");
	}

	public static void main(Double[] args)
	{
		System.out.println("main  double");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Actual main method");

	}

}
