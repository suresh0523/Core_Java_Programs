
public class Box<T> {
	
	private T t;
	
	public void add(T t)
	{
		this.t=t;
	}

	public T get()
	{
		return t;
	}

public static void main(String args[])
{
	Box<Integer> b= new Box<Integer>();
	Box<String> bs=new Box<String>();
	
	b.add(10);;
	bs.add("Suresh");
	System.out.println(b.get());
	System.out.println("\n");
	System.out.println(bs.get());
}
}
