// NOT FINISHED
public class HotelOccupancy {
	private int numofFloors;
	private int rooms;
	private int occupied;
	public HotelOccupancy(int NumofFloors, int Rooms, int Occupied) {
		this.numofFloors = NumofFloors;
		this.rooms = Rooms;
		this.occupied = Occupied;
	}
	public int getNumofFloors() {
		return numofFloors;
	}
	public void setNumofFloors(int numofFloors) {
		this.numofFloors = numofFloors;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms += rooms;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied += occupied;
	}
	public void occupancy() {
		
	}

}
