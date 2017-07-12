
public class Ticket {
	
	protected String destination;
	protected String avg;
	protected String sittplats;
	protected String namn;
	protected String bokningsnr;
	
	public Ticket(String destination, String avg, String sittplats, String namn, String bokningsnr) {
	
		this.destination = destination;
		this.avg = avg;
		this.sittplats = sittplats;
		this.namn = namn;
		this.bokningsnr = bokningsnr;
		
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getSittplats() {
		return sittplats;
	}

	public void setSittplats(String sittplats) {
		this.sittplats = sittplats;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public String getBokningsnr() {
		return bokningsnr;
	}

	public void setBokningsnr(String bokningsnr) {
		this.bokningsnr = bokningsnr;
	}
	
	@Override
	public String toString(){
		return this.namn + "----------" 
					+ "----" 
					+ this.bokningsnr + 
					this.bokningsnr;
	}

}
