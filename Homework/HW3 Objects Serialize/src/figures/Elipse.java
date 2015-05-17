package figures;
public class Elipse extends Figure {

	// field
	private double apogee;
	private double perigee;

	// constructor
	public Elipse(Dot center, double x, double y) {
		super(center);
		setApogee(x);
		setPerigee(y);
	}

	public double getApogee() {
		return apogee;
	}

	public void setApogee(double x) {
		this.apogee = x;
	}
	public double getPerigee() {
		return perigee;
	}

	public void setPerigee(double y) {
		this.perigee = y;
	}

	@Override
	public String toString() {
		return String.format("%s, r=%d, p=%d", this.getCenter().toString(), this.getApogee(), this.getPerigee());

	}
}
