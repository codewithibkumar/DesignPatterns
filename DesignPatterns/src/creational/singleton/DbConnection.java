package creational.singleton;

import java.io.Serializable;

public class DbConnection extends CloneDemo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static DbConnection con ;
	private DbConnection()
	{
		//stop calling this constructor using reflection
		if(con!=null)
			throw new IllegalStateException("Object can't create using reflection");
	}
	
	//to stop clonning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
	public static synchronized DbConnection getInstance()
	{
		if(con == null)
		{
			 con = new DbConnection();
			 return con;
		}
		return con;
		
	}
	
	
	/*protected DbConnection readResolve() {
		// TODO Auto-generated method stub
		return con;
	}*/
	
	
	
}
