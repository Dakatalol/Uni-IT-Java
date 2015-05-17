/**
 * 
 */
package serialize;

import java.io.IOException;

/**
 * @author Jordan
 *
 */
public class Runner {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		UserHandler data = new UserHandler();
		User user1 = new User("Yordan", "9005245281");
		//data.saveObject("src\\user.ser", user1);

		User user2 = new User();
		user2 = data.getObject("src\\user.ser");
		System.out.println(user2.getName());
	}

}
