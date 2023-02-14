
public class MovieDriver2 {
	private String Title;
	private String Rating;
	private int  SoldTickets;
	
	public MovieDriver2()
	{
	 Title ="Zootopia";
	 Rating ="pg58";
	 SoldTickets = 10000;
	}
	
	public MovieDriver2 (String Title, String Rating, int soldTickets ) 
	{
		this.Title= Title;
		this.Rating = Rating;
		this.SoldTickets = 100000;
		
	}
	public void setTitle (String Title)
	{
		this.Title= Title;
	}
	public void setRating (String Rating)
	{
		this.Rating= Rating;
	}
	public String getTitle()
	{
		return Title;
	}
	public String getRating()
	{
		return Rating;
	}
	public void setSoldTickets(int SoldTickets) 
	{
		this.SoldTickets = SoldTickets;
	}
	public int getSoldTickets() 
	{
		return SoldTickets;
	}
	@Override
	public String toString() {
		return (this.Title+" ("+this.Rating+"): Tickets Sold: "+this.SoldTickets);
	}
}
