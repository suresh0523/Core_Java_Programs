
public class Thresd2 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 6; i++) {
			
			try {
				
				System.out.println("Thread is running at  "+i);
				Thread.sleep(2300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String args[])
	{
		
		Thresd2 t2= new Thresd2();
		Thread t= new Thread(t2);
		t.start();
	}

}
