
public class MainThread  implements Runnable{

	@Override
	public void run() {
		
		Thread tt= new Thread();
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("The Thread Name is"+tt.getName()+" "+i);
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
