package figures;

/**
 * 
 */

/**
 * @author Jordan
 *
 */

public class Circle extends Elipse {

	// field
	private double radius;

	// constructor
	/**
	 * 
	 * @param center
	 *            the center of the circle
	 * @param radius
	 *            the radius of the circle
	 */
	public Circle(Dot center, double radius) {
		super(center, radius, radius);
	}
	
	/**
	 * Getter for the radius
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Setter for the radius
	 * @param radius the radius of the circle
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return returns to String the center and the radius of a circle
	 */
	public String toString() {
		return String.format("%s, r=%d", this.getCenter().toString(),
				this.getRadius());

	}

}
