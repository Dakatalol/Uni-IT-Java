package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserHandler {

	public void saveObject(String path, User o) {

		User user = o;

		try {

			FileOutputStream fout = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(user);
			oos.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User getObject(String path) throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		User user = null;
		try {
			FileInputStream fileIn = new FileInputStream(path);
			in = new ObjectInputStream(fileIn);
			user = (User) in.readObject();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("User class not found");
			c.printStackTrace();
		}
			in.close();
			return user;
	}
}