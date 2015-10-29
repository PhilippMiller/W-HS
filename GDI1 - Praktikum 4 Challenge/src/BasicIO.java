import java.io.*;

class io
{
	static int read_int()
	{
		try 
		{
			BufferedReader din = new BufferedReader( 
					new InputStreamReader(System.in));
			return Integer.parseInt(din.readLine());
		}
		catch (NumberFormatException e)
		{
			System.out.println("Falscheingabe! Bitte nochmal eingeben: ");
			return read_int();
		}
		catch (IOException e)
		{
			return -1;
		}
	}
	
	static int read_int_1234()
	{
		
		int durchlauf = 0;
		int antwort;
		
		try 
		{
			do
			{
				durchlauf++;
				if (durchlauf > 1)
				{
					System.out.println("Bitte nur 1, 2, 3 oder 4 eingeben!");
				}
				BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
				antwort = Integer.parseInt(din.readLine());
			}
			while (antwort !=1 & antwort != 2 & antwort != 3 & antwort != 4);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Falscheingabe! Bitte nochmal eingeben: ");
			return read_int();
		}
		catch (IOException e)
		{
			return -1;
		}
		return antwort;
	}

	static float read_float()
	{
		try 
		{
			BufferedReader din = new BufferedReader( 
					new InputStreamReader(System.in));
			Float fl = new Float(din.readLine());
			return fl.floatValue();  
		}
		catch (NumberFormatException e)
		{
			System.out.println("Falscheingabe! Bitte nochmal eingeben: ");
			return read_float();
		}
		catch (IOException e)
		{
			return -1f;
		}
	}
	
	static double read_double()
	{
		try 
		{
			BufferedReader din = new BufferedReader( 
					new InputStreamReader(System.in));
			Double dou = new Double(din.readLine());
			return dou.doubleValue();
		}
		catch (NumberFormatException e)
		{
			System.out.println("Falscheingabe! Bitte nochmal eingeben: ");
			return read_double();
		}
		catch (IOException e)
		{
			return -1;
		}
	}

	static String read_String()
	{

		try
		{
			BufferedReader din = new BufferedReader(
					new InputStreamReader(System.in)); 
			return din.readLine();
		}
		catch(IOException e)		
		{				  
			return "Ein-/Ausgabe-Fehler";
		}
	}
	
	static String read_String_janein()
	{
		String antwort;
		int durchlauf = 0;

		try
		{
			do
			{
				durchlauf++;
				if (durchlauf > 1)
				{
					System.out.println("Bitte mit \"ja\" oder \"nein\" antworten!");
				}
				BufferedReader din = new BufferedReader(
				new InputStreamReader(System.in)); 
				antwort = din.readLine();
			}
			while (antwort.equalsIgnoreCase("ja") == false & antwort.equalsIgnoreCase("nein") == false);
		}
		catch(IOException e)		
		{				  
			return "Ein-/Ausgabe-Fehler";
		}
		return antwort;
	}
	
	static char read_char()
	{
		try
		{
			BufferedReader din = new BufferedReader(
					new InputStreamReader(System.in)); 
			return  (char) din.read();
		}		
		catch(IOException e)		
		{				  
			return '?';
		}
	}
	
	static char read_char_abcd()
	{
		char antwort;
		int durchlauf=0;
		try
		{
			do
			{
				durchlauf++;
				if (durchlauf > 1)
					System.out.println("Bitte nur a, b, c oder d eingeben!");
			
				BufferedReader din = new BufferedReader(
					new InputStreamReader(System.in)); 
					antwort = Character.toLowerCase((char) din.read());
			}
			while (antwort !='a' & antwort != 'b' & antwort != 'c' & antwort != 'd');
		}		
		catch(IOException e)		
		{				  
			return '?';
		}
		
		return antwort;
	}	
}