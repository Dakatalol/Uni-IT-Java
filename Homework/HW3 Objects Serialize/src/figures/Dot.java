package figures;

/**
 * 
 */

/**
 * @author Jordan Iliev - 126524
 *
 */
public class Dot {

	private int X;
	private int Y;

	/**
	 * Creates new dot with given x and y coordinates.
	 * 
	 * @param x
	 *            the x coordinate
	 * 
	 * @param y
	 *            the y coordinate
	 */
	public Dot(int x, int y) {
		this.setX(x);
		this.setY(y);

	}

	/**
	 * Getter for X
	 * 
	 * @return the x coordinate
	 */
	public int getX() {
		return X;
	}

	/**
	 * Setter for X
	 * 
	 * @param x
	 *            the x coordinate
	 *
	 */
	public void setX(int x) {
		X = x;
	}

	/**
	 * Getter for Y
	 * 
	 * @return the y coordinate
	 */
	public int getY() {
		return Y;
	}

	/**
	 * Setter for Y
	 * 
	 * @param y
	 *            the y coordinate
	 *
	 */
	public void setY(int y) {
		Y = y;
	}
	
	/**
	 * @return returns the X and Y coordinates in a given format
	 */
	public String toString() {
		return String.format("x=%d, y=%d", this.getX(), this.getY());
	}

	public static String draw() {
		// TODO Auto-generated method stub
		String name = "Dot";
		return name;
	}

}
