package testing;

public class Office extends Building {
	private int numAC;
	private int numOutsideDoors;
	public Office(int numAC, int numRooms) {
		super(numRooms);
		this.numAC = numAC;
	}
	public void setNumOutsideDoors(int numOutsideDoors) {
		this.numOutsideDoors = numOutsideDoors;
	}
	public int getNumOutsideDoor() {
		return this.numOutsideDoors;
	}
	public int getOfficePower() {
		return (getNumRooms()*numAC)*100;
	}
}
