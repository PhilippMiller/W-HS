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
								











