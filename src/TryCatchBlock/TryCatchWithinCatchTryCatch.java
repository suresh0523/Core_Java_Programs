package TryCatchBlock;

public class TryCatchWithinCatchTryCatch {
	
	public static void main(String[] args)
	{
		try {
			System.out.println("try at 1");
			throw new Exception("Exception1");
		} catch (Exception e) {
			System.out.println("catch one");
			try {
				System.out.println("try2");
				throw new Exception("Exception2");
				
			} catch (Exception e2) {
				System.out.println("catch two");
				System.out.println(e2);
			}
		}
		
		
	}

}
