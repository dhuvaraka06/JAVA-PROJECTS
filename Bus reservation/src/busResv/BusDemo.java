package busResv;
import java.util.*;
public class BusDemo {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		for(Bus b:buses) {
			b.DisplayBusInfo();
		}
		int useropt=1;
		Scanner sc= new Scanner(System.in);
		while(useropt==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			useropt= sc.nextInt();
			if(useropt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Booking confirmed");
				}
				else {
					System.out.println("Sorry! Bus is full. Try another bus or date");
				}
			}
		}
	}
}
