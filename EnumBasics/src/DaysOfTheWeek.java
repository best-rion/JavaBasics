public enum DaysOfTheWeek {
	
	SUNDAY("রবিবার", 20),
	MONDAY("সোমবার", 40),
	TUESDAY("মঙ্গলবার", 60),
	WEDNESDAY("বুধবার", 80),
	THURSDAY("বৃহস্পতিবার", 100),
	FRIDAY("শুক্রবার", 90),
	SATURDAY("শনিবার", 20);
	
	private String bangla;
	private int levelOfHappiness;
	
	DaysOfTheWeek(String bangla, int levelOfHappiness)
	{
		this.bangla = bangla;
		this.levelOfHappiness = levelOfHappiness;
	}
	
	public String getBangla()
	{
		return bangla;
	}
	
	public int getLevelOfHappiness()
	{
		return levelOfHappiness;
	}
}
