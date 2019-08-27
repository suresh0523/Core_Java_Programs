
public class SyncMainThread {
	
	public static void main(String args[])
	{
		ThreadSynchronized thsy=new ThreadSynchronized();
		SyncThread1 sh1= new SyncThread1(thsy);
		SyncThread1 sh2= new SyncThread1(thsy);
		sh1.start();
		
		
	}

	

}
