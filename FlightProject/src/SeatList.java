import java.util.ArrayList;

public class SeatList {

	static ArrayList<Booking> seatList=new ArrayList<>();


	public SeatList() {
		for (int i = 0;i<10;i++){
			seatList.add(new Booking("null"));
		}
		
	}
}