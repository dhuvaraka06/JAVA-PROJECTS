package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getcapacity() {
		return capacity;
	}
	public int getBusNo(){ 
		return busNo;
	}
	public void setcapacity(int cap) {
		capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public void DisplayBusInfo() {
		System.out.println("Bus no:"+busNo+" Ac "+ac+ " Total Capacity "+capacity);
	}
}
