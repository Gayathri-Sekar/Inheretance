package Problem3;

public class HotelRoom {
    private String room;
    private int nos;
    private int ratepersq;
	public HotelRoom(String hotelName, int noOfSqClaw, int ratePerSqClaw) {
		this.room=hotelName;
		this.nos=noOfSqClaw;
		this.ratepersq=ratePerSqClaw;
	}
	public int getNos() {
		return nos;
	}
	public void setNos(int nos) {
		this.nos = nos;
	}
	public int getRatepersq() {
		return ratepersq;
	}
	public void setRatepersq(int ratepersq) {
		this.ratepersq = ratepersq;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	

}
