import java.lang.Enum;

public class TestEnums {
	public static void main(String[] args)
	{
		/*
		System.out.println(DaysOfTheWeek.SUNDAY);
		
		DaysOfTheWeek today = DaysOfTheWeek.MONDAY;
		
		if (today == DaysOfTheWeek.MONDAY)
		{
			System.out.println("It's Monday :(");
		}
		
		DaysOfTheWeek[] days = DaysOfTheWeek.values();
		
		for (DaysOfTheWeek day: days)
		{
			if (day == DaysOfTheWeek.MONDAY)
				System.out.println("Today is "+day);
			else
				System.out.println("Today is not "+day);
		}
		*/
		
		/*
		DaysOfTheWeek sunday = DaysOfTheWeek.valueOf("SUNDAY");
		System.out.println("This must print SUNDAY. Let's see. -> "+ sunday);
		

		//DaysOfTheWeek someday = DaysOfTheWeek.valueOf("SOMEDAY");
		//System.out.println("This must throw an IllegalArguementException. Let's see. -> "+ someday);
		
		*/
		DaysOfTheWeek friday = Enum.valueOf(DaysOfTheWeek.class,"FRIDAY");
		System.out.println(friday);
		System.out.println(friday.getBangla());
		System.out.println("Level of happiness = " + friday.getLevelOfHappiness());
		System.out.println("Ordinal value = " + friday.ordinal());
		
	}
}
