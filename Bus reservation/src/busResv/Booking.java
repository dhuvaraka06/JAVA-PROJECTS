package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String PassengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the passenger:");
		PassengerName=sc.next();
		System.out.println("Enter the bus number");
		busNo=sc.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings ,ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo) {
				capacity=bus.getcapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++; 
			}
		}
		return booked<capacity?true:false;
	}
}
