package aufgabe40;

public class GDI2MinichessMove 
{
	private GDI2MinichessPosition from;
	private GDI2MinichessPosition to;
	
	public GDI2MinichessMove(GDI2MinichessPosition from, GDI2MinichessPosition to)
	{
		this.from = from;
		this.to= to;
	}
	
	public GDI2MinichessPosition getFrom() {
		return from;
	}
	public void setFrom(GDI2MinichessPosition from) {
		this.from = from;
	}
	public GDI2MinichessPosition getTo() {
		return to;
	}
	public void setTo(GDI2MinichessPosition to) {
		this.to = to;
	}
	
	
}
