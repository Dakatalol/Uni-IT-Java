package figures;

public class Runner {

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Dot aDot = new Dot(0, 0);

		aDot.setX(10);

		aDot.setY(11);
		
		System.out.println("toString() : " + aDot.toString());

		System.out.println("draw() : " + Dot.draw());

	}

}