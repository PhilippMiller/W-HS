import bocholt.*;
import gelsenkirchen.*;

public class Studis 
{
	public static void main(String[] args)
   	{
   		gelsenkirchen.WinfoStudi Klaus = new gelsenkirchen.WinfoStudi();
   		BionikStudi Sabine = new BionikStudi();
   		WirtschaftStudi Peter = new WirtschaftStudi();	

      	Klaus.hello();
      	Sabine.hello();
      	Peter.hello(); 
      	
      	
      	System.out.println("\n\n                        |   lehrveran-  |   lehrveran-  |   lehrveran-  |   lehrveran-  |");
      	System.out.println("                        |   staltung1   |   staltung2   |   staltung3   |   staltung4   |");
      	System.out.println("------------------------|---------------|---------------|---------------|---------------|");
      	System.out.println("bocholt.WinfoStudi      |       X       |       X       |       X       |       X       |");
      	System.out.println("------------------------|---------------|---------------|---------------|---------------|");
      	System.out.println("gelsenkirchen.WinfoStudi|       O       |       O       |       O       |       O       |");
      	System.out.println("------------------------|---------------|---------------|---------------|---------------|");
      	System.out.println("bocholt.WinfoTut        |       O       |       X       |       X       |       X       |");
      	System.out.println("------------------------|---------------|---------------|---------------|---------------|");
      	
   	}
}