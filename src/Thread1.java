
public class Thread1 extends Thread{
	
		public void run()
		{
			for (int i = 1; i <=5; i++) {
				try {
					System.out.println("Thread is running"+i);
					Thread.sleep(5000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
		public static void main(String args[])
		{
			Thread1 t1= new Thread1();
			t1.start();
		}

}
