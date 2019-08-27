
public class MainMethodThread {
	
	public static void main(String args[])
	{
		MainThread mt= new MainThread();
		Thread t = new Thread(mt);
		t.setName("Suresh");
		t.start();
		
		Thread t2= new Thread();
		for (int i = 100; i < 105; i++) {
			System.out.println("The thread Name issss --"+ t.getName());
			try {
				
				Thread.sleep(2300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
				
		
	}

}
