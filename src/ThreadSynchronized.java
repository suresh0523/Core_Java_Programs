
public class ThreadSynchronized {
	
	public synchronized void show()
	{
		Thread t = Thread.currentThread();
		for (int i = 5; i <=10; i++) {
			
			System.out.println("The Thread is --"+t.getName()+"--"+i);
			try {
				Thread.sleep(2100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
