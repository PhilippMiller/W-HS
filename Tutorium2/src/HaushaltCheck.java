
public class HaushaltCheck
{
	int bewohner;
	double quadratmeter;
	int rechnung;
	
	int status = 0;
	
	void haushalt()
	{

		if (status == 0)
		{
			System.out.print("Bewohner: ");
			bewohner = io.read_int();
			
			if (bewohner <= 0)
			{
				System.out.println("Es muss mindestens einen Bewohner gemeldet sein!");
				haushalt();
			}
			else
			{
				status = 1;
			}
		}
		
		System.out.print("Wohnfläche: ");
		quadratmeter = io.read_double();
		
		if (quadratmeter <= 0)
		{
			System.out.println("Es muss mindestens ein m² bebeaut sein!");
			haushalt();
		}
		
		
		
	}
}
