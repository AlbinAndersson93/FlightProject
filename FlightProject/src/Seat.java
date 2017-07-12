
public class Seat {
	
	boolean isTaken = false;

	public Seat(boolean isTaken) {
		super();
		this.isTaken = isTaken;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
	

}
