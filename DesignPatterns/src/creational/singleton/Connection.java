package creational.singleton;

public class Connection {

	//Early singleton form
	private static Connection con = new Connection();
	private Connection()
	{
		
	}
	public static Connection getInstance()
	{
		return con;
	}

}
