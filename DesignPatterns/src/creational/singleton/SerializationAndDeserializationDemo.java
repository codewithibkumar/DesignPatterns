package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
				DbConnection con1 = DbConnection.getInstance();
			
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\sington\\objectfile.txt"));
				//DbConnection con2 = DbConnection.getInstance();	
				os.writeObject(con1);	
				//os.writeObject(con2);
				os.flush();
				os.close();
					
				
			
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\sington\\objectfile.txt"));
			
				//DbConnection con1 = (DbConnection) os.readObject();
			
				DbConnection con3 = (DbConnection) ois.readObject();
				//DbConnection con4 = (DbConnection) ois.readObject();
				ois.close();
			
				System.out.println(con1.hashCode());
				System.out.println(con3.hashCode());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
