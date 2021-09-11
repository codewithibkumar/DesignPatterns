package singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DbConnection con1 =	DbConnection.getInstance();
		DbConnection con2 = DbConnection.getInstance();
		
		System.out.println(con1.hashCode());
		System.out.println(con1.hashCode());
		
		}

}
