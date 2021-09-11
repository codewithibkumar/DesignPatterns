package singleton;

public class DbConnection {
	
	//Early singleton
	//private static DbConnection db = new DbConnection();
	//Lazy singleton
	private static DbConnection db;
	
	public static DbConnection getInstance()
	{
		if(db == null)
		{
			db = new DbConnection();
			return db;
		}
		return db;
	}
	

}
