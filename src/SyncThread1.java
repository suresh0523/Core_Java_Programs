
public class SyncThread1 extends Thread {
	
	ThreadSynchronized thsy=null;
	
	public SyncThread1(ThreadSynchronized thsy) {
		this.thsy=thsy;
	
	}
	
	

	public void  run()
	{
		thsy.show();
	}
}
