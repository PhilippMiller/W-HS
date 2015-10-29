import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//set variables
		int monthNumber = 0;
		String[] monthName = {"Januar","Februar","März","April","Mai","Junie","Julie","August","September","Oktober","November","Dezember"};
		List<Float> monthTemperature = new ArrayList<Float>();
		String city;
		int day = 1;
		int dayCount = 0;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		String correction;
		boolean correctionCheck = false;
		List<Float> monthMiddleTemp = new ArrayList<Float>();
		float yearMiddleTemp;
		float additionTemp;
		int additionDay;
		int additionDayCount;
		float additionTempYear;
		 
		
		//days in a month
		
		int[] monthNameDays = {31,0,31,30,31,30,31,31,30,31,30,31,0};
		if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0))
		{
			monthNameDays[1] = 29;
		}
		else
		{
			monthNameDays[1] = 28;
		}
		
		
		
		
		//CODE//
		System.out.println("Willkommen im Temperatur Counter!");
		System.out.print("Bitte geben sie nun eine Stadt ein: ");
		city = io.read_String();
		
		
		//Check city name
		while (correctionCheck == false)
		{
			
			System.out.println("\nSie haben "+city+" gewählt.");
			System.out.print("Bestätigen sie mit \"ja\" oder geben sie eine neue Stadt ein: ");
			correction = io.read_String();
			
			if (correction.equals("ja"))
			{
				System.out.println("\n\nWillkommen in "+city+".");
				correctionCheck = true;
			}
			else
			{
				
				city = correction;
			}
		}
		
		
		//Temperature add for every day
		while ((day <= monthNameDays[monthNumber]))
		{
			System.out.println("Heute ist der "+day+" "+monthName[monthNumber]+" "+year+".");
			System.out.print("Bitte gib eine Temperatur an: ");
			monthTemperature.add(1f/*io.read_float()*/);
			dayCount = dayCount + 1;
			
			if (day == monthNameDays[monthNumber])
			{
				if (monthNumber <= 12)
				{
					monthNumber = monthNumber + 1;
					day = 1;
				}
				else
				{
						day = 50;
				}
			}
			else
			{
				day = day + 1;
			}
			
		}
		
		//VAR SET
		monthNumber = 0;
		additionDay = 1;
		additionTemp = 0;
		additionTempYear = 0;
		additionDayCount = 0;
		
		//DURCHSCHNITTS RECHNUNG
		while (additionDay <= monthNameDays[monthNumber])
		{
			System.out.println(monthName[monthNumber]+monthNameDays[monthNumber]+" <-> "+additionDay+" | Temp: "+monthTemperature.get(additionDay));
			additionTemp = additionTemp + monthTemperature.get(additionDay);
			additionDayCount = additionDayCount + 1;
			
			if (additionDay == monthNameDays[monthNumber])
			{
				if (monthNumber <= 12)
				{
					System.out.println(additionTemp);
					additionTemp = additionTemp / monthNameDays[monthNumber];
					monthMiddleTemp.add(additionTemp);
					monthNumber = monthNumber + 1;
					additionTemp = 0;
					additionDay = 1;
				}
				else
				{
					additionDay = 50;
				}
			}
			else
			{
				additionDay = additionDay + 1;
			}
			
		}
		
		additionTempYear = monthMiddleTemp.get(0)+monthMiddleTemp.get(1)+monthMiddleTemp.get(2)+monthMiddleTemp.get(3)+monthMiddleTemp.get(4)+monthMiddleTemp.get(5)+monthMiddleTemp.get(6)+monthMiddleTemp.get(7)+monthMiddleTemp.get(8)+monthMiddleTemp.get(9)+monthMiddleTemp.get(10)+monthMiddleTemp.get(11);
		System.out.println("\nFolgende Durschnitts Temperaturen wurden ermittelt:");
		monthNumber = 0;
		
		while (monthNumber < 12)
		{
			System.out.println("Für "+monthName[monthNumber]+" "+year+": "+monthMiddleTemp.get(monthNumber));
			monthNumber = monthNumber + 1;
		}
		
		yearMiddleTemp = additionTempYear/12;
		System.out.println("\nFür das gesamte Jahr "+year+": "+yearMiddleTemp);

	}

}
