package creational.singleton;

public class Test {

	public static void main(String[] args) {
		
		
		DbConnection con1 =		DbConnection.getInstance();
		System.out.println(con1);
		
		Connection con2 = Connection.getInstance();
		System.out.println(con2);
	}

}
