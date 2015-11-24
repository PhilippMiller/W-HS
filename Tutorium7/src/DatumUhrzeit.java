import java.text.SimpleDateFormat;
import java.util.Date;

public class DatumUhrzeit
{
	static String aktuellesDatum()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date currentTime = new Date();
		
		return formatter.format(currentTime).toString();
	}
	
	static String aktuelleUhrzeit()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
		Date currentTime = new Date();
				
		return formatter.format(currentTime).toString(); 
	}

}
