package TryCatchBlock;

public class TryCatchWithinCatchTryfinally {
	public static void main(String[] args)
	{
		try {
			System.out.println("try one");
			
		} finally {
			try {
				System.out.println("try 2");
				throw new Exception("Exception1");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("catch one in finally");
				System.out.println(e);
			}
		}
	}
}
