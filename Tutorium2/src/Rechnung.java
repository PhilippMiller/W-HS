
public class Rechnung
{
	float RechnungFaktor;
	int RechnungHaushalt;
	double RechnungQuadratmeter;
	
	double Versicherungssumme; 
	
	void Formel()
	{
		if (RechnungHaushalt < 3)
		{
			Versicherungssumme = (10 + RechnungQuadratmeter / 2) * RechnungFaktor;
		}
		if (RechnungHaushalt == 3)
		{
			Versicherungssumme = (15 + RechnungQuadratmeter) * RechnungFaktor;
		}
		if (RechnungHaushalt == 4)
		{
			Versicherungssumme = (15 + (1.5 * RechnungQuadratmeter)) * RechnungFaktor;
		}
		if (RechnungHaushalt > 4)
		{
			Versicherungssumme = (25 + (2 * RechnungQuadratmeter)) * RechnungFaktor;
		}
	}
}
